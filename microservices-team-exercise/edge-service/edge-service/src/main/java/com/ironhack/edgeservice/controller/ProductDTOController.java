package com.ironhack.edgeservice.controller;

import com.ironhack.edgeservice.DTO.ProductDTO;
import com.ironhack.edgeservice.Service.ProductDTOService;
import com.ironhack.edgeservice.models.Inventory;
import com.ironhack.edgeservice.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
public class ProductDTOController implements ProductDTOControllerInt{

    @Autowired
    ProductDTOService productDTOService;

    private final Logger logger = LoggerFactory.getLogger(ProductDTOController.class);
    @GetMapping("/product/{serial_number}")
    public ProductDTO getProductById(@PathVariable(name = "serial_number") Long id){
        return productDTOService.getProductById(id);
    }

}
