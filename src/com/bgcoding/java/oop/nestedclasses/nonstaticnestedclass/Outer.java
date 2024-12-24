package com.bgcoding.java.oop.nestedclasses.nonstaticnestedclass;

// Ex. 2: Non-static Nested Classes (Inner Classes)
public class Outer {

    public class Inner {

    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();          // We can't create an instance of Inner class without an instance of Outer class
    }
}
