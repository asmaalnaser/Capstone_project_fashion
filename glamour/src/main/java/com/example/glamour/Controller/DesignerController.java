package com.example.glamour.Controller;
import com.example.glamour.Model.Entities.Designer;
import com.example.glamour.Model.Services.DesignerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/designer")
@CrossOrigin(origins = "http://localhost:8080")


public class DesignerController {
    private DesignerServices designerServices;

    @Autowired

    public DesignerController(DesignerServices designerServices) {
        this.designerServices = designerServices;
    }

    @GetMapping
    public List<Designer> getDesigners() {
        return designerServices.getDesigners();
    }
    @GetMapping(path = "{designerId}")
    public Optional<Designer> getDesigner(@PathVariable(name = "designerId") Integer designerId) {
        return designerServices.getDesigner(designerId);

    }

    @PostMapping("/designer/add")
    public void registerNewDesigner(@RequestBody Designer designer){
        designerServices.addNewDesigner(designer);
    }


}