package com.assignment7.q1;

public abstract class Rodent {
    Rodent() {
        System.out.println("A new Rodent has been created!");
    }

    abstract void eat();

    abstract void sleep();
}
