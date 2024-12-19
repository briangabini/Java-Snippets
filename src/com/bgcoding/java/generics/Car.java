package com.bgcoding.java.generics;

public class Car {

    private int weight;
    private int length;
    private int width;
    private int passengerCapacity;

    public Car(int weight, int length, int width, int passengerCapacity) {
        this.weight = weight;
        this.length = length;
        this.width = width;
        this.passengerCapacity = passengerCapacity;
    }

    public Car(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }


}
