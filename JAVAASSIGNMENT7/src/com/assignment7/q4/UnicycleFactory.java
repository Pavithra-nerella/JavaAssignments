package com.assignment7.q4;

public class UnicycleFactory implements CycleFactory {
    public Cycle createCycle() {
        return new Unicycle();
    }
}
