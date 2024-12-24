package com.bgcoding.java.oop.nestedclasses.staticnestedclass;

// Ex. 1: Static Nested Classes
public class Outer {

    public static class Nested {

    }

    public static void main(String[] args) {
        Outer.Nested instance = new Outer.Nested();
    }
}
