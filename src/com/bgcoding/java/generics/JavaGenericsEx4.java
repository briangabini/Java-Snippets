package com.bgcoding.java.generics;

import java.util.ArrayList;
import java.util.List;

// Generics Wildcards
public class JavaGenericsEx4 {

    public static void main(String[] args) {
        List<Parent> parentList = new ArrayList<>();
        List<ChildA> childAList = new ArrayList<>();
        List<ChildB> childBList = new ArrayList<>();

        processParent(parentList);
        // compile error, incompatible types
        // in java an instance of ChildA is technically also an instance of Parent
//        processParent(childAList);
//        processParent(childBList);

        processAny(childBList);

        processParentSubclass(parentList);
        processParentSubclass(childAList);
        processParentSubclass(childBList);

        processParentSuperclass(parentList);
        // compile error, incompatible types
//        processParentSuperclass(childAList);
//        processParentSuperclass(childBList);

    }

    // process parent objects
    public static void processParent(List<Parent> elements) {
        Parent parent = elements.get(0);
        elements.add(new Parent());
    }

    public static void processAny(List<?> elements) {
        Object parent = elements.get(0);            // this is fine, because Object is the parent of all classes
        // Truck truck = elements.get(0);              // This is not fine, because the compiler doesn't know what type of object is in the list
        // elements.add(new Object());                     // This is not fine, because the compiler doesn't know what type of object is in the list
    }

    // we cannot add to the list, but we can read from it
    public static void processParentSubclass(List<? extends Parent> elements) {
        Parent object = elements.get(0);
        ChildA childA = (ChildA) elements.get(0);       // this is fine, because the compiler knows that the list contains Parent or its subclasses
    }

    public static void processParentSuperclass(List<? super Parent> elements) {
        elements.add(new Parent());
        elements.add(new ChildA());
        elements.add(new ChildB());
    }
}
