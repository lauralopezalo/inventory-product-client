package com.ironhack.exercisepriceservice.controller;

import com.ironhack.exercisepriceservice.model.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

public interface ProductControllerInt {
    Optional<Product> getProductNameAndPrice(Long id);
}
