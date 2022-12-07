package com.example.shoppingCart_backend.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "usersidnup")

public class UserSignup {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String phnno;
    private String email;
    private String password;
    private String conpassword;

    public UserSignup() {
    }

    public UserSignup(int id, String name, String phnno, String email, String password, String conpassword) {
        this.id = id;
        this.name = name;
        this.phnno = phnno;
        this.email = email;
        this.password = password;
        this.conpassword = conpassword;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return name;
    }

    public void setProductName(String productName) {
        this.name = productName;
    }

    public String getPhnno() {
        return phnno;
    }

    public void setPhnno(String phnno) {
        this.phnno = phnno;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConpassword() {
        return conpassword;
    }

    public void setConpassword(String conpassword) {
        this.conpassword = conpassword;
    }
}
