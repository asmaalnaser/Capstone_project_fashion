package com.example.glamour.Model.Services;
import com.example.glamour.Model.Entities.User;
import com.example.glamour.Model.Repository.UserRepositry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class UserServices {

    private UserRepositry userRepositry;

    @Autowired
    public UserServices(UserRepositry userRepositry) {
        this.userRepositry = userRepositry;
    }




    public List<User> getUser() {
        return userRepositry.findAll();

    }
    public Integer addNewUser(User user){
        if(userRepositry.existsById(user.getUserName())){

            return 0;
        }
        else{
            userRepositry.save(user);
            return 1;
        }

    }

    public String checkLogin(String userName,String password){
        if(userRepositry.existsById(userName)){
            String pass= userRepositry.findPassword(userName);

            if(pass.equals(password)){
                String role= userRepositry.findRoles(userName);

                return "authenticated"+ role;
            }
            else{
                return "password Does not match";
            }

        }
        return "please sign up";
    }
    public void deleteUser(String userName) {
        userRepositry.deleteById(userName);}
}



