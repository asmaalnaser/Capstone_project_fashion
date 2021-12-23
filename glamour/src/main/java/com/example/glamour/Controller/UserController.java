package com.example.glamour.Controller;


import com.example.glamour.Model.Entities.User;
import com.example.glamour.Model.Services.UserServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
//import java.util.Optional;

@RestController
@RequestMapping  (path = "user")
public class UserController {
    private UserServices userServices;

    @Autowired
    public UserController(UserServices userServices) {
        this.userServices = userServices;
    }

    @GetMapping
    public List<User> getUser() {
        return userServices.getUsers();
    }
//    @GetMapping(path = "{username}")
//    public Optional<User> getUser(@PathVariable(name = "username") String username) {
//        return userServices.getUser(username);
//
//    }

    @PostMapping("add")
    @ResponseBody
    public String registerNewUser(@RequestBody User user) {
        userServices.addNewUser(user);
        int result = userServices.addNewUser(user);
        if (result == 0) {
            return "username already exist";
        } else {
            return "login successfully";
        }
    }
        @DeleteMapping(path = "delete/user")

        public void deleteUser (@PathVariable("username") String username){
            userServices.deleteUser(username);
        }
    }
