package com.bgcoding.java.lang;

public class Java12SwitchEx {

    public static void main(String[] args) {
        int digitInDecimal = 12;

        char digitIndex = numericSwitchExpression(digitInDecimal);

        System.out.println(digitIndex);

        System.out.println(stringSwitchExpression("abc"));
    }

    private static char numericSwitchExpression(int digitInDecimal) {
        return switch(digitInDecimal) {
            // no need to specify break statement
            case 0 -> '0';
            case 1 -> '1';
            case 2 -> '2';
            case 3 -> '3';
            case 4 -> '4';
            case 5 -> '5';
            case 6 -> '6';
            case 7 -> '7';
            case 8 -> '8';
            case 9 -> '9';
            case 10 -> 'A';
            case 11 -> 'B';
            case 12 -> 'C';
            case 13 -> 'D';
            case 14 -> 'E';
            case 15 -> 'F';

            default -> '?';
        };
    }

    private static int stringSwitchExpression(String token) {
        return switch(token) {
            case "123" -> 0;
            case "abc" -> 1;
            default -> -1;
        };
    }
}
