package com.developer.connect;
//import javax.persistence.Entity;
//import javax.persistence.Table;
//import javax.persistence.Id;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Column;


import jakarta.persistence.*;

@Entity
@Table(name = "User")
public class UserEntity {
    public UserEntity(long id, String username, String email) {
        this.id = id;
        this.username = username;
        this.email = email;
    }

    public long getId() {
        return id;
    }

    public UserEntity() {
    }

    public void setId(long id) {
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

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "User_id")
    private long id;

    @Column(name = "User_Name")
    private String username;

    @Column(name = "email")
    private String email;

    // Getters and setters
}
