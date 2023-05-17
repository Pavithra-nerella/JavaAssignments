package com.assignment6.q3;

public class MyClass {
    public MyClass(String str) {
        System.out.println("Constructed with string: " + str);
    }

    public static void main(String[] args) {
        MyClass[] arr = new MyClass[5]; // Array of object references
        // Initialization messages will not be printed because no objects have been created yet
    }
}
