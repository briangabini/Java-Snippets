package com.bgcoding.java.enumex;

import java.util.EnumMap;
import java.util.EnumSet;

// https://youtu.be/1612Ngij7_c
public class EnumEx1 {

    public static void main(String[] args) {
        Level level = Level.HIGH;

        // use switch with enums
        switch (level) {
            case HIGH:
                System.out.println(Level.HIGH);
                break;
            case MEDIUM:
                System.out.println(Level.MEDIUM);
                break;
            case LOW:
                System.out.println(Level.LOW);
                break;
        }

        // iterate over each enum
        Level[] levelValues = Level.values();
        for (Level l : levelValues) {
            System.out.println(l);
        }

        // create an enum from a string
        Level levelFromString = Level.valueOf("HIGH");
        System.out.println(levelFromString);

        // execute getLevel method
        System.out.println(level.getLevel());

        // execute normalize method
        System.out.println(Level.HIGH.normalize());
        System.out.println(Level.MEDIUM.normalize());
        System.out.println(Level.LOW.normalize());

        // use enumSet
        EnumSet enumSet = EnumSet.of(Level.HIGH, Level.MEDIUM);
        System.out.println(enumSet);

        // use enumMap
        EnumMap<Level, String> enumMap = new EnumMap(Level.class);
        enumMap.put(Level.HIGH, "High value");
        enumMap.put(Level.MEDIUM, "Medium value");
        enumMap.put(Level.LOW, "Low value");

        System.out.println(enumMap);
    }
}
