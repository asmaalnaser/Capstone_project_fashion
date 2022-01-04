package com.example.glamour.Model.Entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table

public class Users {
    @Id
    private String username;
    private int password;


    @ManyToMany(mappedBy = "users")
    private List<Designer> designers = new ArrayList<>();


    public Users(String username, int password, List<Designer> designers) {
        this.username = username;
        this.password = password;
        this.designers = designers;
    }


    public Users() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public List<Designer> getDesigners() {
        return designers;
    }

    public void setDesigners(List<Designer> designers) {
        this.designers = designers;
    }


    @Override
    public String toString() {
        return "Users{" +
                "username='" + username + '\'' +
                ", password=" + password +
                ", designers=" + designers +
                '}';
    }
}