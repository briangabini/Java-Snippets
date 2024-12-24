package com.bgcoding.java.records;

import java.util.Objects;

// This is a way to create a class that is similar to a record in Java
// As you can see there is a lot of boilerplate code
public class VehiclePojo {

    private String brand = null;
    private String licensePlate = null;

    public VehiclePojo(String brand, String licensePlate) {
        this.brand = brand;
        this.licensePlate = licensePlate;
    }

    public String getBrand() {
        return brand;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        VehiclePojo that = (VehiclePojo) o;
        return Objects.equals(brand, that.brand) && Objects.equals(licensePlate, that.licensePlate);
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(brand);
        result = 31 * result + Objects.hashCode(licensePlate);
        return result;
    }

    @Override
    public String toString() {
        return "VehiclePojo{" +
                "brand='" + brand + '\'' +
                ", licensePlate='" + licensePlate + '\'' +
                '}';
    }
}
