package com.bgcoding.java.generics;

import java.util.ArrayList;
import java.util.List;

public class JavaGenericsEx1 {

    public static void main(String[] args) {
        List cars = new ArrayList<>();
        // We want to be warned during compile time -> Use generics
        cars.add(new Truck(3000, 800, 200, 5000));      // We get a runtime error when we enter sumPassengerCapacity

        cars.add(new Car(1000, 400, 180,5));
        cars.add(new Car(1200, 450, 182,5));
        cars.add(new Car(1500, 480, 150,7));

        int passengerCapacitySum = sumPassengerCapacity(cars);
        System.out.println("Total passenger capacity: " + passengerCapacitySum);
    }

    public static int sumPassengerCapacity(List cars) {
        int passengerCapacitySum = 0;
        for (Object o : cars) {
            Car car = (Car) o;
            passengerCapacitySum += car.getPassengerCapacity();
        }
        return passengerCapacitySum;
    }
}
