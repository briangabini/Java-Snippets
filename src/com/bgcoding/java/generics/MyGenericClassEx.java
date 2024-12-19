package com.bgcoding.java.generics;

import java.util.ArrayList;
import java.util.List;

public class MyGenericClassEx {

    public static void main(String[] args) {

        MyGenericClass<Car> genericClass = new MyGenericClass<>();

//        genericClass.elements.add(new Truck(3000, 6, 2, 18000));
        genericClass.elements.add(new Car(4));
        Car car1 = genericClass.addAndReturn(new Car(4));
        Car car2 = car1;

        List<Car> cars = new ArrayList<>();
        genericClass.add(new Car(4), cars);

        Car car = genericClass.addAndReturn(new Car(4), cars);

        List<Truck> trucks = new ArrayList<>();
        Truck truck = genericClass.addAndReturn(new Truck(3000, 6, 2, 18000), trucks);
    }
}
