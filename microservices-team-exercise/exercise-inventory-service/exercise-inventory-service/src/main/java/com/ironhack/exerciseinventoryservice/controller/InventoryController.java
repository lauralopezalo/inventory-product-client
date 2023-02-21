package com.ironhack.exerciseinventoryservice.controller;

import com.ironhack.exerciseinventoryservice.model.Inventory;
import com.ironhack.exerciseinventoryservice.service.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class InventoryController {

    @Autowired
    InventoryService inventoryService;


    @GetMapping("/inventory/{serial_number}")
    public Optional<Inventory> getProductQuantity(@PathVariable(name = "serial_number") Long id){
        return inventoryService.getProductQuantity(id);
    }
}
