//package com.example.glamour.Model.Repository;
//import com.example.glamour.Model.Entities.Users;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;
//
//
//    public interface UsersRepository extends JpaRepository<Users, Integer> {
//        @Query("SELECT password FROM Users WHERE username = :username")
//        String findPasswordByUsername(@Param("username") String username);
//
//        @Query("select case when count(username) > 0 then true else false end from Users where username = :username")
//        Boolean existsByUsername(@Param("username") String username);
//    }
//}