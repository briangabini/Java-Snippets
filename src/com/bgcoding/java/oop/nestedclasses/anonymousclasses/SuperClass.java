package com.bgcoding.java.oop.nestedclasses.anonymousclasses;

public class SuperClass {

    public void doIt() {
        System.out.println("AnonymousClassEx.doIt()");
    }

    public static void main(String[] args) {
        SuperClass instance = new SuperClass() {
            @Override
            public void doIt() {
                System.out.println("AnonymousClassEx.doIt()");
            }
        };
        instance.doIt();
    }
}
