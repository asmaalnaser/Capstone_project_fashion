package com.example.glamour.Controller;


import com.example.glamour.Model.Entities.Designer;
import com.example.glamour.Model.Entities.Picture;
import com.example.glamour.Model.Services.DesignerServices;
import com.example.glamour.Model.Services.PictureServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping (path = "api/picture")
@CrossOrigin
public class PictureController {

    private PictureServices pictureServices ;

    @Autowired

    public PictureController(PictureServices pictureServices) {
        this.pictureServices = pictureServices;
    }

    @GetMapping(path = "picture ")
    public List<Picture> getPictures() {
        return pictureServices.getPictures();
    }


    @GetMapping(path = "{pictureId}")
    public Optional<Picture> getPicture(@PathVariable(name = "pictureId") String pictureId) {
        return pictureServices.getPicture(pictureId);

    }

    @PostMapping("add/picture")
    public void registerNewPicture(@RequestBody Picture picture){
        pictureServices.addNewPicture(picture);
//    }
//
//    @DeleteMapping(path = "api/delete/designer/{designerId}")
//    public void deleteDesigner(@PathVariable("designerId")String designerId){
//        int intdesignerId = Integer.parseInt(designerId);
//        designerServices.deleteDesigner(intdesignerId);
//    }
}

}
