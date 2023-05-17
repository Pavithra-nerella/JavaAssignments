package com.assignment7.q4;

public class BicycleFactory implements CycleFactory {
    public Cycle createCycle() {
        return new Bicycle();
    }
}
