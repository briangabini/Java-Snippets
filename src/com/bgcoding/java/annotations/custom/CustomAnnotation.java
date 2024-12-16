package com.bgcoding.java.annotations.custom;

import java.lang.annotation.*;

//@Target(ElementType.TYPE)               // Target annotation to be used on classes
//@Inherited                                  // Inherit this annotation, when a class extends another class using this annotation
//@Documented                                 // Include this annotation in the Javadoc
@Retention(RetentionPolicy.RUNTIME)          // Retain this annotation at runtime
public @interface CustomAnnotation {
    String name() default "Jack";
    int count() default 999;
    String[] tags() default {"Java", "Annotations"};
}
