package com.example.javaproj1.controller;


import com.example.javaproj1.models.Product;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @PostMapping("/product")
    public void createProduct(Product product) {

    }

    public Product getProduct(Long id) {
        return null;
    }

    public void updateProduct(Product product) {

    }

    public void deleteProduct(Long id) {

    }

}
