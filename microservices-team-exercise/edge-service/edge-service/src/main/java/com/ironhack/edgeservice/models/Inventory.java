package com.ironhack.edgeservice.models;

public class Inventory {

    private Long serialNumber;
    private Long quantity;

    public Inventory() {
    }

    public Inventory(Long serial_number, Long quantity) {
        this.serialNumber = serial_number;
        this.quantity = quantity;
    }

    public Long getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(Long serial_number) {
        this.serialNumber = serial_number;
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }
}
