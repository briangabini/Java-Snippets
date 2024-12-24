package com.bgcoding.java.records;

public class RecordsEx1 {

    public static void main(String[] args) {
        String brand = "Mercedes";
        String licensePlate = "UX 1238 A95";

        VehiclePojo vehicle = new VehiclePojo(brand, licensePlate);

        System.out.println( vehicle.getBrand() );
        System.out.println( vehicle.getLicensePlate() );

        System.out.println( vehicle.toString() );
    }
}
