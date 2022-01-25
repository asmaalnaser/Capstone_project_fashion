package com.example.glamour.Controller;
import com.example.glamour.Model.Entities.Designer;
import com.example.glamour.Model.Services.DesignerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "https://glamourasma.herokuapp.com/")
@RestController
@RequestMapping(path = "api/designer")



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


    @GetMapping(path = "designers/{designerId}")
    public Optional<Designer> getDesigner(@PathVariable(name = "designerId") Integer designerId) {
        return designerServices.getDesigner(designerId);

    }

    @PostMapping("add")
    public void registerNewDesigner(@RequestBody Designer designer){
        designerServices.addNewDesigner(designer);
    }

     @DeleteMapping(path = "delete/{designerId}")
       public void deleteDesigner(@PathVariable("designerId")String designerId){
        int intdesignerId = Integer.parseInt(designerId);
        designerServices.deleteDesigner(intdesignerId);
     }
}