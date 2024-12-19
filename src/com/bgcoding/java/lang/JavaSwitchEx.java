package com.bgcoding.java.lang;

public class JavaSwitchEx {

    private enum Size {
        SMALL, MEDIUM, LARGE
    }

    public static void main(String[] args) {
        usingIfstatements(0);
        switchOnIntegers(3);
        switchOnChars('L');
        switchOnStrings("XL");
        switchOnEnum(Size.SMALL);
    }

    public static void usingIfstatements(int value) {
        if (value == 0) {
            System.out.println("Value is zero");
        } else if (value > 0) {
            System.out.println("Value is positive");
        } else {
            System.out.println("Value is negative");
        }
    }

    public static void switchOnIntegers(int value) {
        switch (value) {
            case 1, 10, 12:                             // multiple case statements
                System.out.println("Value is one");
                break;
            case 2:
                System.out.println("Value is two");
                break;
            case 3:
                System.out.println("Value is three");
                break;
            default:
                System.out.println("Value is unknown");
                break;
        }
    }

    public static void switchOnChars(char value) {
        switch (value) {
            case 'A':
                System.out.println("Value is A");
                break;
            case 'B':
                System.out.println("Value is B");
                break;
            case 'L':
                System.out.println("Value is L");
                break;
            default:
                System.out.println("Value is unknown");
                break;
        }
    }

    public static void switchOnStrings(String value) {
        switch (value) {
            case "A":
                System.out.println("Value is A");
                break;
            case "B":
                System.out.println("Value is B");
                break;
            case "XL":
                System.out.println("Value is KL");
                break;
            default:
                System.out.println("Value is unknown");
                break;
        }
    }

    public static void switchOnEnum(Size size) {
        switch (size) {
            case SMALL:
                System.out.println("Size is SMALL");
                break;
            case MEDIUM:
                System.out.println("Size is MEDIUM");
                break;
            case LARGE:
                System.out.println("Size is LARGE");
                break;
            default:
                System.out.println("Size is unknown");
                break;
        }
    }
}