package com.example.glamour.Model.Services;



import com.example.glamour.Model.Entities.User;
import com.example.glamour.Model.Repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServices {

    private UserRepository userRepository;

    @Autowired
    public UserServices(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    public List<User> getUsers() {
        return userRepository.findAll();
    }

//    public  Optional <User> getUser(String username){
//        return userRepository.findById(username);

      public Integer addNewUser(User user){
      if(userRepository.existsById(user.getUsername())){
          return 0;
      }
else {
    userRepository.save(user);
    return  1;
      }

    }
    public  void  deleteUser(String username) {
        userRepository.deleteById(username);
    }
}

