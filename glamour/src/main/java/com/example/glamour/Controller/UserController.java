package com.example.glamour.Controller;


import com.example.glamour.Model.Entities.Users;
import com.example.glamour.Model.Services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/user")
public class UserController {


        private UserServices userServices;

        @Autowired

        public UserController(UserServices userServices) {
            this.userServices = userServices;
        }


        @GetMapping
        public List<Users> getUsers() {
            return userServices.getUsers();
        }

        @PostMapping("add")
        public void registerNewUser(@RequestBody Users users) {
            userServices.addNewUsers(users);
        }

        @GetMapping(path = "{users}")
        public Optional<Users> getUser(@PathVariable (name = "usersId") String userName) {
            return userServices.getUser(userName);
        }

        @GetMapping(path = "login")
        public String checkLogin(@RequestParam(name = "username") String username ,
                                 @RequestParam (name = "password") String password ) {
            return userServices.getCheck(username,password);

        }
        @DeleteMapping(path = "delete/users{users}")
        public void deleteUsers (@PathVariable("userName") String userName){
            userServices.deleteUsers(userName);
        }
    }

