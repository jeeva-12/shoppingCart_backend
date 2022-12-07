package com.example.shoppingCart_backend.controller;

import com.example.shoppingCart_backend.dao.UserDao;
import com.example.shoppingCart_backend.model.Products;
import com.example.shoppingCart_backend.model.UserSignup;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserDao dao;

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/adduser",consumes = "application/json",produces = "application/json")
    public String AddUser(@RequestBody UserSignup u){
        System.out.println(u.getEmail());
        dao.save(u);
        return "Product added Successfully";
    }

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/userlogin",consumes = "application/json",produces = "application/json")
    public String UserLogin() {
        return "user login";
    }

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/adminlogin",consumes = "application/json",produces = "application/json")
    public String AdminLogin() {
        return "admin login";
    }

}
