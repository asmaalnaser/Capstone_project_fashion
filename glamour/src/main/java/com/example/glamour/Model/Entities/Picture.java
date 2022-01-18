//package com.example.glamour.Model.Entities;
//
//
//import com.fasterxml.jackson.annotation.JsonIdentityInfo;
//import com.fasterxml.jackson.annotation.JsonIgnore;
//import com.fasterxml.jackson.annotation.ObjectIdGenerators;
//
//import javax.persistence.*;
//import java.util.ArrayList;
//import java.util.List;
//
//@Entity
//@Table
//@JsonIdentityInfo(
//        generator = ObjectIdGenerators.PropertyGenerator.class,
//        property = "id")
//public class Picture {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private int id;
//    private String img1;
//    private String picture_type;
//    private String img2;
//    private String img3;
//    private String img4;
//    private String img5;
//    private String img6;
//
//
//    @ManyToOne
//
//    @JoinColumn(name = "designerID", referencedColumnName = "id")
//    private Designer designer;
//
//
//
//    public Picture(int id, String img1, String picture_type, String img2, String img3, String img4, String img5, String img6, Designer designer) {
//        this.id = id;
//        this.img1 = img1;
//        this.picture_type = picture_type;
//        this.img2 = img2;
//        this.img3 = img3;
//        this.img4 = img4;
//        this.img5 = img5;
//        this.img6 = img6;
//        this.designer = designer;
//    }
//
//    public Picture() {
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getImg1() {
//        return img1;
//    }
//
//    public void setImg1(String img1) {
//        this.img1 = img1;
//    }
//
//    public String getPicture_type() {
//        return picture_type;
//    }
//
//    public void setPicture_type(String picture_type) {
//        this.picture_type = picture_type;
//    }
//
//    public String getImg2() {
//        return img2;
//    }
//
//    public void setImg2(String img2) {
//        this.img2 = img2;
//    }
//
//    public String getImg3() {
//        return img3;
//    }
//
//    public void setImg3(String img3) {
//        this.img3 = img3;
//    }
//
//    public String getImg4() {
//        return img4;
//    }
//
//    public void setImg4(String img4) {
//        this.img4 = img4;
//    }
//
//    public String getImg5() {
//        return img5;
//    }
//
//    public void setImg5(String img5) {
//        this.img5 = img5;
//    }
//
//    public String getImg6() {
//        return img6;
//    }
//
//    public void setImg6(String img6) {
//        this.img6 = img6;
//    }
//
//    public Designer getDesigner() {
//        return designer;
//    }
//
//    public void setDesigner(Designer designer) {
//        this.designer = designer;
//    }
