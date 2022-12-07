package com.example.shoppingCart_backend.dao;

import com.example.shoppingCart_backend.model.UserSignup;
import org.springframework.data.repository.CrudRepository;

public interface UserDao extends CrudRepository<UserSignup,String> {
}
