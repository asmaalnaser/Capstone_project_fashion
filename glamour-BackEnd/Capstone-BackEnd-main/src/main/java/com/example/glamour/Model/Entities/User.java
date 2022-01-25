package com.example.glamour.Model.Entities;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table
public class User {
    @Id
    private String userName;
    private String password;
    private String roles;

//    @ManyToMany(mappedBy = "user")
//    @JsonIgnore
//    private List<Designer> designers = new ArrayList<>();

    @OneToMany(mappedBy = "user")
    @JsonIgnore
    private List<Booking>items = new ArrayList<>();

    public User(String userName, String password, String roles, List<Booking> items) {
        this.userName = userName;
        this.password = password;
        this.roles = roles;
        this.items = items;
    }


    public User() {
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }

    public List<Booking> getItems() {
        return items;
    }

    public void setItems(List<Booking> items) {
        this.items = items;
    }
}




