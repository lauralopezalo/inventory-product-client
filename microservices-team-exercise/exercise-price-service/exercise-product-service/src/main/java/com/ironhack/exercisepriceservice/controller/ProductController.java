package com.ironhack.exercisepriceservice.controller;

import com.ironhack.exercisepriceservice.model.Product;
import com.ironhack.exercisepriceservice.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/price/{serial_number}")
    public Optional<Product> getProductNameAndPrice(@PathVariable(name = "serial_number") Long id){
        return productService.getProductNameAndPrice(id);
    }
}
