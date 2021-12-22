package com.example.glamour.Controller;



import com.example.glamour.Model.Entities.Details;
import com.example.glamour.Model.Services.DetailsServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping (path = "api/details")


public class DetailsController {
    private DetailsServices detailsServices;

    @Autowired
    public DetailsController(DetailsServices detailsServices) {
        this.detailsServices = detailsServices;
    }
    @GetMapping
    public List<Details> getDetails() {
        return detailsServices.getDetails();
    }
    @GetMapping(path = "{detailsId}")
    public Optional<Details> getDetails(@PathVariable(name = "detailsId") Integer detailsId) {
        return detailsServices.getDetails(detailsId);

    }

    @PostMapping("/add")
    public void registerNewDetails(@RequestBody Details details){
        detailsServices.addNewDetails(details);
    }


}

