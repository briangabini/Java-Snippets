package com.bgcoding.java.generics;

public class JavaGenericsExInterfaces {

    public static void main(String[] args) {
        MyInterface<Truck> myInterface = new MyInterfaceImpl<>();

        MyInterface<Truck> myInterface2 = new MyInterfaceImpl2();
//        MyInterface<Car> myInterface3 = new MyInterfaceImpl2();     // not possible since we hardcoded the type in MyInterfaceImpl2

        try {
            Truck truck = myInterface.createInstance(Truck.class);
            // Car car = myInterface.createInstance(Car.class);

        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}
