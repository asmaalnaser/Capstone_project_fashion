package com.example.glamour.Model.Repository;

import com.example.glamour.Model.Entities.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface ReviewRepository extends JpaRepository<Review, Integer> {
    }

