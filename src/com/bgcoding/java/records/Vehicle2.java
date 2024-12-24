package com.bgcoding.java.records;

// Record with a constructor that takes one parameter
public record Vehicle2(String brand, String licensePlate) {

    public Vehicle2(String brand) {
        this(brand, null);
    }
}
