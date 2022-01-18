//package com.example.glamour.Model.Services;
//
//
//
//import com.example.glamour.Model.Entities.Details;
//import com.example.glamour.Model.Repository.DetailsRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//import java.util.Optional;
//
//@Service
//public class DetailsServices {
//
//    private DetailsRepository detailsRepository;
//
//    @Autowired
//    public DetailsServices(DetailsRepository detailsRepository) {
//        this.detailsRepository = detailsRepository;
//    }
//
//
//    public List<Details> getDetails() {
//        return detailsRepository.findAll();
//
//    }
//
//    public Optional<Details> getDetails(Integer detailsId) {
//        return detailsRepository.findById(detailsId);
//
//    }
//    public void addNewDesigner(Details details) {
//        detailsRepository.save(details);
//    }
//
//    public void addNewDetails(Details details) {
//    }
//}
