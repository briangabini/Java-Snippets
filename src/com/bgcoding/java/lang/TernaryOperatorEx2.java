package com.bgcoding.java.lang;

public class TernaryOperatorEx2 {

    public static void main(String[] args) {

        String input = "";

        int value = input == null ? -1 : input.equals("") ? 0 : Integer.parseInt(input);

        System.out.println(value);
    }
}
