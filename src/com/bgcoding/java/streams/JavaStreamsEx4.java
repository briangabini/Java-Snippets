package com.bgcoding.java.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class JavaStreamsEx4 {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Element 1");
        list.add("Element 2");
        list.add("Element 3");

        // this is called a stream chain, where we chain multiple stream operations together
        // some operation are non-terminal and some are terminal (check notes.md)
        list.stream()
            .map(String::toLowerCase)
            .map(String::toUpperCase)
            .forEach(System.out::println);
    }
}




