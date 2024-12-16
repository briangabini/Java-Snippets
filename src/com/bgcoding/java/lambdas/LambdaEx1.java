package com.bgcoding.java.lambdas;

import java.util.Comparator;

public class LambdaEx1 {

    public static void main(String[] args) {
        Comparator<String> stringComparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        };

        int comparison = stringComparator.compare("hello", "world");
        System.out.println(comparison);

        Comparator<String> comparatorStringLambda
                = String::compareTo;                // we can use a method reference, when it has the same signature, i.e. compareTo takes in 2 params and returns a boolean

        int lambdaComparison = comparatorStringLambda.compare("hello", "world");
        System.out.println(lambdaComparison);
    }
}
