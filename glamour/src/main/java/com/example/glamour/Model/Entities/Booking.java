package com.example.glamour.Model.Entities;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table
public class Booking {

    @Id
    private String username;
    private String email;
    private int number;
    private int date;
    private String communication;


    @ManyToOne
    @JoinColumn(referencedColumnName = "designer_Id")
    private Designer designer;


    public Booking(String username, String email, int number, int date, String communication, Designer designer) {
        this.username = username;
        this.email = email;
        this.number = number;
        this.date = date;
        this.communication = communication;
        this.designer = designer;
    }



    public Booking() {
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


    @Override
    public String toString() {
        return "Booking{" +
                "username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", number=" + number +
                ", date=" + date +
                ", communication='" + communication + '\'' +
                ", designer=" + designer +
                '}';
    }
}