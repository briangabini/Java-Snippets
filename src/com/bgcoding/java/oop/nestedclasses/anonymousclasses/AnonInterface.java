package com.bgcoding.java.oop.nestedclasses.anonymousclasses;

public class AnonInterface {

    public static void main(String[] args) {
        MyInterface  instance = () -> {
            System.out.println("AnonymousClassEx.doIt()");
        };

        instance.doIt();
    }
}
