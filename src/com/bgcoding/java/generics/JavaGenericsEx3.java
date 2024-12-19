package com.bgcoding.java.generics;

import java.util.*;

public class JavaGenericsEx3 {

    public static void main(String[] args) {
        List<Car>           carList = new ArrayList<>();
        Set<Car>            carSet  = new HashSet<>();
        Map<String, Car>    carMap  = new HashMap<>();

        for (Car car : carList) {

        }

        for (Car car : carSet) {

        }

        for (String key : carMap.keySet()) {

        }

        for (Car car : carMap.values()) {

        }
    }
}
