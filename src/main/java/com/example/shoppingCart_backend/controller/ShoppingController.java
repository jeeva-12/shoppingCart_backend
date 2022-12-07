package com.example.shoppingCart_backend.controller;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShoppingController {

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/add",consumes = "application/json",produces = "application/json")
    public String addProduct(){
        return "Product added Successfully";
    }

    @CrossOrigin(origins = "*")
    @GetMapping(path = "/viewproduct",consumes = "application/json",produces = "application/json")
    public String viewProduct(){
        return "view";
    }

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/serachproduct",consumes = "application/json",produces = "application/json")
    public String searchProduct(){
        return "searchproduct";
    }


    @CrossOrigin(origins = "*")
    @PostMapping(path = "/usersignup",consumes = "application/json",produces = "application/json")
    public String userSignup(){
        return "User added Successfully";
    }

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/userlogin",consumes = "application/json",produces = "application/json")
    public String userLogin() {
        return "user login";
    }

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/adminlogin",consumes = "application/json",produces = "application/json")
    public String adminLogin() {
        return "admin login";
    }



}
