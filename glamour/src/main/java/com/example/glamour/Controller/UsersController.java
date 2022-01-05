//package com.example.glamour.Controller;
//
//import com.example.glamour.Model.Entities.Users;
//import com.example.glamour.Model.Services.UsersServices;
//import org.apache.catalina.User;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//
//
//
//@RestController
//public class UsersController {
//    private UsersServices usersServices;
//    @Autowired
//    public UsersController(UsersServices usersServices) {
//        this.usersServices = usersServices;
//    }
//
//
//
//
//    @GetMapping("api/users")
//
//    public List<Users> getUser() {
//
//
//        return usersServices.getUser();
//    }
//
//    @GetMapping("api/users/login")
//    public String CheckLogin(@RequestParam(name="userName") String userName, @RequestParam(name="password")String password){
//
//        return usersServices.checkLogin(userName,password);
//    }
//
//    @PostMapping("api/users/add")
//    @ResponseBody
//
//
//    public String registerNewUser(@RequestBody Users users){
//        int result = usersServices.addNewUser(users);
//        if(result == 0){
//            return "username already exist";
//        }
//        else{
//            return "login successfully";
//        }
//    }
//
//    @DeleteMapping(path = "api/users/delete/{userName}")
//    public void deleteUser(@PathVariable ("userName") String userName){
//        usersServices.deleteUser(userName);
//    }
//
//
//
//}
