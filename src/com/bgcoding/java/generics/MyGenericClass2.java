package com.bgcoding.java.generics;

public class MyGenericClass2 {

    public <T> T createInstance(Class<T> classOfInstance)
            throws IllegalAccessException, InstantiationException {
        return classOfInstance.newInstance();
    }
}
