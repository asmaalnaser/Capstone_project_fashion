package com.example.glamour.Model.Entities;
import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.*;

import java.util.ArrayList;
import java.util.List;


@Entity
@Table
public class Designer {


    @Id
    private int designer_Id;
    private String designer_Name;
    private String designer_Email;
    private int designer_Phone;
    private String designer_Company;
    private int designer_Age;
    private String bio;
    private String img;
    private String expertise;

    public Designer(int designer_Id, String designer_Name, String designer_Email, int designer_Phone, String designer_Company, int designer_Age, String bio, String img, String expertise, List<User> user, List<Details> details, List<Booking> booking, List<Picture> picture) {
        this.designer_Id = designer_Id;
        this.designer_Name = designer_Name;
        this.designer_Email = designer_Email;
        this.designer_Phone = designer_Phone;
        this.designer_Company = designer_Company;
        this.designer_Age = designer_Age;
        this.bio = bio;
        this.img = img;
        this.expertise = expertise;
        this.user = user;
        this.details = details;
        this.booking = booking;
        this.picture = picture;
    }



    @ManyToMany
    @JoinTable(name = "User_designer",
            joinColumns = @JoinColumn(name = "designer_Id"),
            inverseJoinColumns = @JoinColumn(name = "username"))
    private List<User> user = new ArrayList<>();



    @OneToMany(mappedBy = "designer")
    @JsonIgnore
    private List<Details> details = new ArrayList<>();


    @OneToMany(mappedBy = "designer")
    @JsonIgnore
    private List<Booking> booking = new ArrayList<>();


    @OneToMany(mappedBy = "designer")
    @JsonIgnore
    private List<Picture> picture = new ArrayList<>();

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

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getExpertise() {
        return expertise;
    }

    public void setExpertise(String expertise) {
        this.expertise = expertise;
    }

    public List<User> getUser() {
        return user;
    }

    public void setUser(List<User> user) {
        this.user = user;
    }

    public List<Details> getDetails() {
        return details;
    }

    public void setDetails(List<Details> details) {
        this.details = details;
    }

    public List<Booking> getBooking() {
        return booking;
    }

    public void setBooking(List<Booking> booking) {
        this.booking = booking;
    }

    public List<Picture> getPicture() {
        return picture;
    }

    public void setPicture(List<Picture> picture) {
        this.picture = picture;
    }
}