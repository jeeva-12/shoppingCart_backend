package com.example.shoppingCart_backend.dao;

import com.example.shoppingCart_backend.model.Products;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProductDao extends CrudRepository<Products,String> {
@Query(value="SELECT `id`, `category`, `description`, `image`, `price`, `product_name` FROM `products` WHERE `product_name` =:product_name",nativeQuery = true)
List<Products> SearchProduct(@Param("product_name")String product_name) ;
}
