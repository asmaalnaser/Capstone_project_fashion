//package com.example.glamour.Model.Repository;
//
//import com.example.glamour.Model.Entities.Users;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;
//import org.springframework.stereotype.Repository;
//
//public interface UsersRepository {
//    @Repository
//    public interface UsersRepositry extends JpaRepository<Users,String > {
//        @Query("SELECT roles FROM User  where userName = :userName")
//        String findRoles(@Param("userName") String userName);
//
//        @Query("SELECT password FROM User  where userName = :userName")
//        String findPassword(@Param("userName") String userName);
//
//
//
//    }
//}
