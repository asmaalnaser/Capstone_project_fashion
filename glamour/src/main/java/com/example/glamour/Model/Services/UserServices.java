package com.example.glamour.Model.Services;

import com.example.glamour.Model.Entities.Users;
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

        public List<Users> getUsers() {
            return userRepository.findAll();
        }

        public Optional<Users> getUser(String userName) {
            return userRepository.findById(userName);
        }

        public String getCheck(String userName, String password) {
            if (userRepository.existsByUsername(userName)) {
                String pass = userRepository.findPasswordByUsername(userName);
                if (pass.equals(password)) {
                    return "authenticated";
                } else {
                    return "Password does not match";
                }
            }

            return "Username not found";
        }

        public void addNewUsers(Users users) {
            userRepository.save(users);
        }

        public void deleteUsers(String userName) {
            userRepository.deleteById(userName);
        }
}
