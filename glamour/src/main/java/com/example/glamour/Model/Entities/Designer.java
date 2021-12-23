package com.example.glamour.Model.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table
public class Designer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int designer_Id;
    private String designer_Name;
    private String designer_Email;
    private int designer_Phone;
    private String designer_Company;
    private  int designer_Age;

    @OneToMany(mappedBy = "designer")

    @JsonIgnore
    private List<Details> items = new ArrayList<>();

    public Designer(int designer_Id, String designer_Name, String designer_Email, int designer_Phone, String designer_Company, int designer_Age, List<Details> items) {
        this.designer_Id = designer_Id;
        this.designer_Name = designer_Name;
        this.designer_Email = designer_Email;
        this.designer_Phone = designer_Phone;
        this.designer_Company = designer_Company;
        this.designer_Age = designer_Age;
        this.items = items;
    }

    public Designer() {
    }

    public int getDesigner_Id() {
        return designer_Id;
    }

    public void setDesigner_Id(int designer_Id) {
        this.designer_Id = designer_Id;
    }

    public String getDesigner_Name() {
        return designer_Name;
    }

    public void setDesigner_Name(String designer_Name) {
        this.designer_Name = designer_Name;
    }

    public String getDesigner_Email() {
        return designer_Email;
    }

    public void setDesigner_Email(String designer_Email) {
        this.designer_Email = designer_Email;
    }

    public int getDesigner_Phone() {
        return designer_Phone;
    }

    public void setDesigner_Phone(int designer_Phone) {
        this.designer_Phone = designer_Phone;
    }

    public String getDesigner_Company() {
        return designer_Company;
    }

    public void setDesigner_Company(String designer_Company) {
        this.designer_Company = designer_Company;
    }

    public int getDesigner_Age() {
        return designer_Age;
    }

    public void setDesigner_Age(int designer_Age) {
        this.designer_Age = designer_Age;
    }

    public List<Details> getItems() {
        return items;
    }

    public void setItems(List<Details> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "Designer{" +
                "designer_Id=" + designer_Id +
                ", designer_Name='" + designer_Name + '\'' +
                ", designer_Email='" + designer_Email + '\'' +
                ", designer_Phone=" + designer_Phone +
                ", designer_Company='" + designer_Company + '\'' +
                ", designer_Age=" + designer_Age +
                ", items=" + items +
                '}';
    }
}

