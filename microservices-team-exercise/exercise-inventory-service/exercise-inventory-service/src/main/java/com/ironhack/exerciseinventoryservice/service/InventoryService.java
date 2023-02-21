package com.ironhack.exerciseinventoryservice.service;

import com.ironhack.exerciseinventoryservice.model.Inventory;
import com.ironhack.exerciseinventoryservice.model.InventoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class InventoryService {
    @Autowired
    InventoryRepository inventoryRepository;
    public Optional<Inventory> getProductQuantity(Long id){
        return inventoryRepository.findQuantityBySerialNumber(id);
    }
}
