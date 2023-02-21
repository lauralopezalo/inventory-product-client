package com.ironhack.edgeservice.client;

import com.ironhack.edgeservice.models.Inventory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@FeignClient("inventory-service")
public interface InventoryServiceClient {

    @GetMapping("/inventory/{serial_number}")
    Inventory getProductQuantity(@PathVariable(name = "serial_number") Long id);

//    @GetMapping("/price/{serial_number}")
//    Product getProductNameAndPrice(@PathVariable(name = "serial_number") Long id);
}
