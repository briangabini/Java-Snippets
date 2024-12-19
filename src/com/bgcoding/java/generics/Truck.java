package com.bgcoding.java.generics;

public class Truck {

    private int weight;
    private int length;
    private int width;
    private int loadCapacity;

    public Truck(int weight, int length, int width, int loadCapacity) {
        this.weight = weight;
        this.length = length;
        this.width = width;
        this.loadCapacity = loadCapacity;
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

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }
}
