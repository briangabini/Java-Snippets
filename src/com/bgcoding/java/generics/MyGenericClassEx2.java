package com.bgcoding.java.generics;

// Class Objects as Generic Type Literals
// Useful if trying to read and pass JSON data to a class
public class MyGenericClassEx2 {

    public static void main(String[] args) {
        Class<MyObject1> class1 = MyObject1.class;
        Class<MyObject2> class2 = MyObject2.class;

        MyGenericClass2 factory = new MyGenericClass2();
        try {
            MyObject1 instance1 = factory.createInstance(MyObject1.class);
            System.out.println(instance1);

            MyObject2 instance2 = factory.createInstance(MyObject2.class);
            System.out.println(instance2);

        } catch (IllegalAccessException | InstantiationException e) {
            throw new RuntimeException(e);
        }
    }
}

