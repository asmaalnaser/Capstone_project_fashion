package com.example.glamour.Model.Services;

import com.example.glamour.Model.Entities.Designer;
import com.example.glamour.Model.Repository.DesignerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class DesignerServices {



    private DesignerRepository designerRepository;

    @Autowired
    public DesignerServices(DesignerRepository designerRepository) {
        this.designerRepository = designerRepository;
    }


    public List<Designer> getDesigners() {
        return designerRepository.findAll();

    }

    public Optional<Designer> getDesigner(Integer designerId) {
        return designerRepository.findById(designerId);

    }
    public void addNewDesigner(Designer designer) {
        designerRepository.save(designer);
    }

    }



