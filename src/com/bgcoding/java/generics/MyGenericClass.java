package com.bgcoding.java.generics;

import java.util.ArrayList;
import java.util.List;

public class MyGenericClass<T> {                            // You can declare the generic type here

    public List<T> elements = new ArrayList<>();

    // declare the generic type before the return type
    public <T> void add(T element, List<T> list) {
        list.add(element);
    }

    public <T> T addAndReturn(T element, List<T> list) {
        list.add(element);
        return element;
    }

    public <T> T addAndReturn(T element) {
        return element;
    }
}
