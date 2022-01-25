package com.example.glamour.Controller;


import com.example.glamour.Model.Entities.Review;
import com.example.glamour.Model.Services.ReviewServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "https://glamourasma.herokuapp.com/")
@RestController
//    @RequestMapping(path = "review")

    public class ReviewController {

        private ReviewServices reviewServices;

        @Autowired
        public ReviewController(ReviewServices reviewServices) {
            this.reviewServices = reviewServices;
        }

        @GetMapping (path = "reviews")
        public List<Review> getReviews() {
            return reviewServices.getReviews();
        }

        @GetMapping(path =" reviews/{reviewId}")
        public Optional<Review> getReview(@PathVariable(name = "reviewId") Integer reviewId) {
            return reviewServices.getReview(reviewId);
        }

        @PostMapping("api/add")
        public void registerNewReview(@RequestBody Review review) {
            System.out.println("inside add review");
            reviewServices.addNewReview(review);
        }

        @DeleteMapping(path = "api/delete/{reviewId}")
        public void deleteReview(@PathVariable("reviewId") String reviewId) {
            int intreviewId= Integer.parseInt(reviewId);
            reviewServices.deleteReview(intreviewId);
        }
    }

