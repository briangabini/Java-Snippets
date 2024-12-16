package com.bgcoding.java.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class JavaStreamsEx3 {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Element 1");
        list.add("Element 2");
        list.add("Element 3");

        // this is called a stream chain, where we chain multiple stream operations together
        // some operation are non-terminal and some are terminal (check notes.md)
        Stream<String> stream = list.stream();
        Stream<String> lowercaseStream = stream.map(String::toLowerCase);
        Stream<String> uppercaseStream = lowercaseStream.map(String::toUpperCase);
        uppercaseStream.forEach(System.out::println);
    }
}



