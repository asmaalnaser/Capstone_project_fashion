//package com.example.glamour.Model.Services;
//
//
//import com.example.glamour.Model.Entities.Booking;
//import com.example.glamour.Model.Entities.Picture;
//import com.example.glamour.Model.Repository.BookingRepository;
//import com.example.glamour.Model.Repository.PictureRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//import java.util.Optional;
//
//@Service
//public class PictureServices {
//
//
//    private PictureRepository pictureRepository;
//
//    @Autowired
//    public PictureServices(PictureRepository pictureRepository) {
//        this.pictureRepository = pictureRepository;
//    }
//
//
//    public List<Picture> getPictures() {
//        return pictureRepository.findAll();
//
//    }
//
//    public Optional<Picture> getPicture(String pictureId) {
//        return pictureRepository.findById(pictureId);
//
//    }
//
//    public void addNewPicture(Picture picture) {
//        pictureRepository.save(picture);
//    }
//
//    public void deletePicture(String pictureId){
//        pictureRepository.deleteById(pictureId);
//    }
//}
//

