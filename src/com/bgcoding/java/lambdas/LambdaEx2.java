package com.bgcoding.java.lambdas;

import java.util.Comparator;

public class LambdaEx2 {

    public static void main(String[] args) {
        MyFunction myFunction = (s1, s2) -> {
            System.out.println(s1 + " " + s2);
            return s1 + " " + s2;
        };
        String returnValue = myFunction.apply("Hello Function Body", "Test");
    }
}
