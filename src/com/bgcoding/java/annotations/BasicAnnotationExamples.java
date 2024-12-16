package com.bgcoding.java.annotations;

@MyAnnotation
public class BasicAnnotationExamples {                      // class declaration

    @MyAnnotation                                           // member variable
    public String name = "MyName";

    @MyAnnotation                                           // constructor
    public BasicAnnotationExamples() {

    }

    @MyAnnotation                                           // method
    public void printText(@MyAnnotation String text) {      // parameter

        @MyAnnotation String localVar = "Some Text";        // local variable
    }

    @MyAnnotation                                           // static method
    public static void main(@MyAnnotation String[] args) {  // static method parameter declaration
    }
}
