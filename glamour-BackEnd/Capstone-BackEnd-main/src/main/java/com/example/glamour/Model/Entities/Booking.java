package com.example.glamour.Model.Entities;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import javax.persistence.*;



@Entity
@Table
@JsonIdentityInfo(
        generator = ObjectIdGenerators.PropertyGenerator.class,
        property = "id")

public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String username;
    private String email;
    private int number;
    private int date;
    private String communication;




  @OneToOne
  @JoinColumn(name = "designer_Id",unique = true,updatable = false)
  private Designer designer;

    @ManyToOne
    @JoinColumn(referencedColumnName = "userName")
    private User user;

  @OneToOne (mappedBy = "booking")
    private Review review;

    public Booking(int id, String username, String email, int number, int date, String communication, Designer designer, User user, Review review) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.number = number;
        this.date = date;
        this.communication = communication;
        this.designer = designer;
        this.user = user;
        this.review = review;
    }



    public Booking() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public String getCommunication() {
        return communication;
    }

    public void setCommunication(String communication) {
        this.communication = communication;
    }

    public Designer getDesigner() {
        return designer;
    }

    public void setDesigner(Designer designer) {
        this.designer = designer;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Review getReview() {
        return review;
    }

    public void setReview(Review review) {
        this.review = review;
    }
}