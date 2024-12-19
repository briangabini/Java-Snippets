package com.bgcoding.java.generics;

public interface MyInterface<T> {

    public T createInstance(Class<T> ofClass)
        throws InstantiationException,
                IllegalAccessException;
}
