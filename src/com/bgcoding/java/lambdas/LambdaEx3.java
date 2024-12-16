package com.bgcoding.java.lambdas;

import java.io.FileOutputStream;
import java.io.IOException;

public class LambdaEx3 {

    public static void main(String[] args) throws IOException {
        MyInterface myInterface = text -> System.out.println(text);

        myInterface.printIt("Hello, World!");
        MyInterface.printItToSystemOut("Hello, World!");
        myInterface.printUtf8To("Hello, World!", new FileOutputStream("output.txt"));
    }
}
