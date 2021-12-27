package com.example.glamour.Model.Services;



import com.example.glamour.Model.Entities.Users;
import com.example.glamour.Model.Repository.UsersRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersServices {

    private UsersRepository usersRepository;

    @Autowired
    public UsersServices(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }


    public List<Users> getUsers() {
        return usersRepository.findAll();
    }

//    public  Optional <User> getUser(String username){
//        return userRepository.findById(username);

      public Integer addNewUser(Users users){
      if(usersRepository.existsById(users.getUsername())){
          return 0;
      }
      else {
       usersRepository.save(users);
        return  1;
      }

    }
        public  void  deleteUser(String username) {
        usersRepository.deleteById(username);
    }
}

