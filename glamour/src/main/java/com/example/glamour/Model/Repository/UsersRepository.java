package com.example.glamour.Model.Repository;




import com.example.glamour.Model.Entities.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends JpaRepository<Users, String> {
//
//    @Query ("SELECT password FROM User WHERE username = :username")
//    String findByUsername(@Param("username") String username);
//

}
