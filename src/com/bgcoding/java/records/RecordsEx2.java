package com.bgcoding.java.records;

public class RecordsEx2 {

    public static void main(String[] args) {
        String brand = "Mercedes";
        String licensePlate = "UX 1238 A95";

        Vehicle1 vehicle = new Vehicle1(brand, licensePlate);
        System.out.println( vehicle.brand() );
        System.out.println( vehicle.licensePlate() );
        System.out.println( vehicle.toString() );

        Vehicle2 vehicle2 = new Vehicle2(brand);
        System.out.println( vehicle2.brand() );

        Vehicle3 vehicle3 = new Vehicle3(brand);
        System.out.println( vehicle3.brandAsLowerCase() );
    }
}
