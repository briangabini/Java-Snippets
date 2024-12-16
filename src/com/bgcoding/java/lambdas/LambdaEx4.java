package com.bgcoding.java.lambdas;

import java.io.IOException;

public class LambdaEx4 {

    static String thirdText = "Hey, a third text";

    private String fourthText = "Fourth Text";

    public void doIt() {
        final String otherText = "Hello: ";

        MyInterface myInterface = (text) -> {
            System.out.println(otherText + text + " " + fourthText);
        };

        myInterface.printIt("ABC");
        fourthText = "Blablabla";
        myInterface.printIt("ABC");
    }

    public static void main(String[] args) throws IOException {
        LambdaEx4 instance = new LambdaEx4();
        instance.doIt();
    }
}
