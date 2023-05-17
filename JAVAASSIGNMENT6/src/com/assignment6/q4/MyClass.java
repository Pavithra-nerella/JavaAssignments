package com.assignment6.q4;

public class MyClass {
    public MyClass(String str) {
        System.out.println("Constructed with string: " + str);
    }

    public static void main(String[] args) {
        MyClass[] arr = new MyClass[5]; // Array of object references
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new MyClass("Object " + i); // Creating objects to attach to the array
        }
    }
}
