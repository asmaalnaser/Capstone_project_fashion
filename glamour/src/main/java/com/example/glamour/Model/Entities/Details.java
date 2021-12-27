//package com.example.glamour.Model.Entities;
//
//import javax.persistence.*;
//
//@Entity
//@Table
//public class Details {
//    @Id
//    private String photo;
//    private String name;
//    private int age;
//    private int id;
//    private String address;
//    private String bio;
//
//
////    @ManyToOne
////    @JoinColumn(name = "Designer_ID" ,referencedColumnName = "designer_Id")
////    private Designer designer;
//
//    public Details(String photo, String name, int age, int id, String address, String bio, Designer designer) {
//        this.photo = photo;
//        this.name = name;
//        this.age = age;
//        this.id = id;
//        this.address = address;
//        this.bio = bio;
////        this.designer = designer;
//    }
//
//    public Details() {
//    }
//
//    public String getPhoto() {
//        return photo;
//    }
//
//    public void setPhoto(String photo) {
//        this.photo = photo;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
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
//    public String getAddress() {
//        return address;
//    }
//
//    public void setAddress(String address) {
//        this.address = address;
//    }
//
//    public String getBio() {
//        return bio;
//    }
//
//    public void setBio(String bio) {
//        this.bio = bio;
//    }
//
////    public Designer getDesigner() {
////        return designer;
////    }
////
////    public void setDesigner(Designer designer) {
////        this.designer = designer;
////    }
//
//    @Override
//    public String toString() {
//        return "Details{" +
//                "photo='" + photo + '\'' +
//                ", name='" + name + '\'' +
//                ", age=" + age +
//                ", id=" + id +
//                ", address='" + address + '\'' +
//                ", bio='" + bio + '\'' +
////                ", designer=" + designer +
//                '}';
//    }
