package com.bgcoding.java.oop.nestedclasses.localclasses;

// Ex. 4: Local Classes
public class Outer {

    private String text = "I am Outer private!";

    public void printText() {

        class Local {
            private String text = "I am Local private!";

            public void printText() {
                String formattedText = "From Local: %s";
                System.out.println(formattedText.formatted(text));
                System.out.println(formattedText.formatted(Outer.this.text));
            }
        }

        Local local = new Local();
        local.printText();
    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.printText();
    }
}
