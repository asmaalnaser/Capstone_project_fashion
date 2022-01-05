//package com.example.glamour.Model.Services;
//
//import com.example.glamour.Model.Entities.Users;
//import com.example.glamour.Model.Repository.UsersRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//
//@Service
//public class UsersServices {
//
//
//
//        private UsersRepository.UsersRepositry usersRepositry;
//        @Autowired
//        public UsersServices (UsersRepository.UsersRepositry usersRepositry) {
//            this.usersRepositry = usersRepositry;
//        }
//
//
//        public List<Users> getUser() {
//            return usersRepositry.findAll();
//
//        }
//        public Integer addNewUser(Users users){
//            if(usersRepositry.existsById(users.getUsername())){
//                return 0;
//            }
//            else{
//                usersRepositry.save(users);
//                return 1;
//            }
//
//        }
//
//        public String checkLogin(String userName,String password){
//            if(usersRepositry.existsById(userName)){
//                String pass= usersRepositry.findPassword(userName);
//
//                if(pass.equals(password)){
//                    String role= usersRepositry.findRoles(userName);
//
//                    return "authenticated"+ role;
//                }
//                else{
//                    return "password Does not match";
//                }
//
//            }
//            return "please sign up";
//        }
//        public void deleteUser(String userName) {
//            usersRepositry.deleteById(userName);}
//    }
//
