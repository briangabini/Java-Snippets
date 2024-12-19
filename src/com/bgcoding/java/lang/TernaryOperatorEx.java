package com.bgcoding.java.lang;

public class TernaryOperatorEx {

    public static void main(String[] args) {

        String textCase = "uppercase";

        String firstName = textCase.equals("uppercase") ? "JOHN" : "john";

        System.out.println(firstName);

        int val1 = 15;
        int val2 = 20;

        int max = val1 >= val2 ? val1 : val2;
        System.out.println("max: " + max);
    }
}
