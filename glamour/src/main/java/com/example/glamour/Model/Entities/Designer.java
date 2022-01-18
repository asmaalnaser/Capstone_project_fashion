package com.example.glamour.Model.Entities;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import javax.persistence.*;




@Entity
@Table
@JsonIdentityInfo(
        generator = ObjectIdGenerators.PropertyGenerator.class,
        property = "id")
public class Designer {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String designer_Name;
    private String designer_Email;
    private int designer_Phone;
    private String designer_Company;
    private int designer_Age;
    private String bio;
    private String img;
    private String expertise;




//    @ManyToOne
//    @JoinColumn(name = "BookingId",referencedColumnName = "id")
//    private Booking booking;

    @OneToOne(mappedBy = "designer")
    private  Booking booking;

    public Designer(int id, String designer_Name, String designer_Email, int designer_Phone, String designer_Company, int designer_Age, String bio, String img, String expertise, Booking booking) {
        this.id = id;
        this.designer_Name = designer_Name;
        this.designer_Email = designer_Email;
        this.designer_Phone = designer_Phone;
        this.designer_Company = designer_Company;
        this.designer_Age = designer_Age;
        this.bio = bio;
        this.img = img;
        this.expertise = expertise;
        this.booking = booking;
    }

    public Designer() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public Booking getBooking() {
        return booking;
    }

    public void setBooking(Booking booking) {
        this.booking = booking;
    }
}