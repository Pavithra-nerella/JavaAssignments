package com.assignment6.q2;

public class MyClass {
    private int number;
    private String name;

    public MyClass(int number) {
        this(number, "default");
    }

    public MyClass(int number, String name) {
        this.number = number;
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }
}

