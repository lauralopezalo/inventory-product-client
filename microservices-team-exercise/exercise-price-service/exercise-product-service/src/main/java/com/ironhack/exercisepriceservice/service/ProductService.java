package com.ironhack.exercisepriceservice.service;

import com.ironhack.exercisepriceservice.model.Product;
import com.ironhack.exercisepriceservice.model.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    ProductRepository productRepository;
    public Optional<Product> getProductNameAndPrice(Long id){
        return productRepository.findBySerialNumber(id);
    }
}
