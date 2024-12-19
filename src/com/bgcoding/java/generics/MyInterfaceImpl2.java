package com.bgcoding.java.generics;

public class MyInterfaceImpl2 implements MyInterface<Truck> {

    @Override
    public Truck createInstance(Class<Truck> ofClass)
            throws InstantiationException, IllegalAccessException {
        return ofClass.newInstance();
    }
}
