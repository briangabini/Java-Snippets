package com.bgcoding.java.generics;

import java.util.ArrayList;
import java.util.List;

public class JavaGenericsEx2 {

    public static void main(String[] args) {
        List<Car > cars = new ArrayList<>();             // Adding Car type makes the code type safe
//        List<Truck > cars = new ArrayList<>();             // Doing this will error when calling sumPassengerCapacityGenerics
//        cars.add(new Truck(3000, 800, 200, 5000));

        cars.add(new Car(1000, 400, 180,5));
        cars.add(new Car(1200, 450, 182,5));
        cars.add(new Car(1500, 480, 150,7));

        int passengerCapacitySum = sumPassengerCapacityGenerics(cars);
        System.out.println("Total passenger capacity: " + passengerCapacitySum);
    }

    public static int sumPassengerCapacityGenerics(List<Car> cars) {
        int passengerCapacitySum = 0;
        for (Car car : cars) {
            passengerCapacitySum += car.getPassengerCapacity();
        }
        return passengerCapacitySum;
    }
}
