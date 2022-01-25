package com.example.glamour.Model.Services;

import com.example.glamour.Model.Entities.Review;
import com.example.glamour.Model.Repository.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReviewServices {

        private ReviewRepository reviewRepository;
        @Autowired
        public ReviewServices(ReviewRepository reviewRepository) {
            this.reviewRepository = reviewRepository;
        }
        public List<Review> getReviews() {
            return reviewRepository.findAll();
        }
        public Optional<Review> getReview(Integer reviewId){
            return reviewRepository.findById(reviewId);
        }
        public void addNewReview(Review review) {
            reviewRepository.save(review);

        }
        public void deleteReview(Integer reviewId){
            reviewRepository.deleteById(reviewId);
        }
    }

