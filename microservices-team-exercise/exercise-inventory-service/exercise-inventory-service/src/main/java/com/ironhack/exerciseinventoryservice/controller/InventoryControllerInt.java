package com.ironhack.exerciseinventoryservice.controller;

import com.ironhack.exerciseinventoryservice.model.Inventory;

import java.util.Optional;

public interface InventoryControllerInt {
    Optional<Inventory> getProductQuantity(Long id);
}
