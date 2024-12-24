package com.bgcoding.java.records;

public record Vehicle3(String brand, String licensePlate) {

    public Vehicle3(String brand) {
        this(brand, null);
    }

    // Can also be a static method
    public String brandAsLowerCase() {
        return brand().toLowerCase();
    }
}
