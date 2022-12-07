package com.example.shoppingCart_backend.controller;


import com.example.shoppingCart_backend.dao.ProductDao;
import com.example.shoppingCart_backend.dao.UserDao;
import com.example.shoppingCart_backend.model.Products;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ShoppingController {
    @Autowired
    private ProductDao dao;

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/addproduct",consumes = "application/json",produces = "application/json")
    public String AddProduct(@RequestBody Products p){
        System.out.println(p.getProductName().toString());
        dao.save(p);
        return "Product added Successfully";
    }

    @CrossOrigin(origins = "*")
    @GetMapping(path = "/viewProduct",consumes ="application/json",produces = "application/json" )
    public List<Products> ViewAll(){
        return (List<Products>) dao.findAll();
    }

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/search",consumes = "application/json",produces = "application/json")
    public List<Products> SearchProduct(@RequestBody Products p)
    {
        String product_name =String.valueOf(p.getProductName());
        System.out.println(product_name);
        return ((List<Products>) dao.SearchProduct(p.getProductName()));
    }




}
