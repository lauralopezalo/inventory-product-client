package com.ironhack.edgeservice.Service;

import com.ironhack.edgeservice.DTO.ProductDTO;
import com.ironhack.edgeservice.client.InventoryServiceClient;
import com.ironhack.edgeservice.client.ProductServiceClient;
import com.ironhack.edgeservice.models.Inventory;
import com.ironhack.edgeservice.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductDTOService implements ProductDTOServiceInt{

    @Autowired
    InventoryServiceClient inventoryServiceClient;
    @Autowired
    ProductServiceClient productServiceClient;
    @Override
    public ProductDTO getProductById(Long id) {
        Product product = productServiceClient.getProductNameAndPrice(id);
        Inventory inventory = inventoryServiceClient.getProductQuantity(id);
        ProductDTO productDTO = new ProductDTO();
        productDTO.setProductName(product.getProductName());
        productDTO.setPrice(product.getPrice());
        productDTO.setQuantity(inventory.getQuantity());
        productDTO.setSerialNumber(id);
        return productDTO;
    }
}
