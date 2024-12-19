package com.bgcoding.java.generics;

public class MyInterfaceImpl<T> implements MyInterface<T> {

    @Override
    public T createInstance(Class<T> ofClass)
            throws InstantiationException, IllegalAccessException {
        return ofClass.newInstance();
    }
}
