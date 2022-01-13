package com.example.glamour.Controller;
import com.example.glamour.Model.Entities.User;
import com.example.glamour.Model.Services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
public class UserController {


    private UserServices  userServices;

    @Autowired
    public UserController(UserServices userServices) {
        this.userServices = userServices;
    }



    @GetMapping("api/user")

    public List<User> getUser() {


        return  userServices.getUser();
    }

    @GetMapping("api/user/login")
    public String CheckLogin(@RequestParam(name="userName") String userName, @RequestParam(name="password")String password){

        return userServices.checkLogin(userName,password);
    }

    @PostMapping("api/user/add")
    @ResponseBody
    public String registerNewUser(@RequestBody User user){

        int result = userServices.addNewUser(user);
        if(result == 0){
            return "username already exist";
        }
        else{
            return "login successfully";
        }
    }

    @DeleteMapping(path = "api/user/delete/{userName}")
    public void deleteUser(@PathVariable ("userName") String userName){
        userServices.deleteUser(userName);
    }



}