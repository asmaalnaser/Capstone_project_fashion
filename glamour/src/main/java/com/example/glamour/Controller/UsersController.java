package com.example.glamour.Controller;


import com.example.glamour.Model.Entities.Users;
import com.example.glamour.Model.Services.UsersServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
//import java.util.Optional;

@RestController
@RequestMapping  (path = "users")
public class UsersController {
    private UsersServices usersServices;

    @Autowired
    public UsersController(UsersServices usersServices) {
        this.usersServices = usersServices;
    }

    @GetMapping
    public List<Users> getUser() {
        return usersServices.getUsers();
    }
//    @GetMapping(path = "{username}")
//    public Optional<User> getUser(@PathVariable(name = "username") String username) {
//        return userServices.getUser(username);
//
//    }

    @PostMapping("add")
    @ResponseBody
    public String registerNewUser(@RequestBody Users users) {
        usersServices.addNewUser(users);
        int result = usersServices.addNewUser(users);
        if (result == 0) {
            return "username already exist";
        } else {
            return "login successfully";
        }
    }
        @DeleteMapping(path = "delete/users")

        public void deleteUser (@PathVariable("username") String username){
            usersServices.deleteUser(username);
        }
    }
