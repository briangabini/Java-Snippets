package com.bgcoding.java.annotations.custom;

//@CustomAnnotation(name = "CustomAnnotationExample", count = 123, tags = {"Java", "Examples", "Annotations"})
//@CustomAnnotation(tags = {"Java", "Examples", "Annotations"})       // Using defaults
@CustomAnnotation()
public class CustomAnnotationExample {

    @CustomAnnotation
    public String myField = null;

    @CustomAnnotation
    public CustomAnnotationExample() {

    }

    @CustomAnnotation
    public void doIt(@CustomAnnotation String message) {

    }
}
