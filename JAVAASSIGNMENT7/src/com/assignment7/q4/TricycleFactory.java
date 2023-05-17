package com.assignment7.q4;

public class TricycleFactory implements CycleFactory {
    public Cycle createCycle() {
        return new Tricycle();
    }
}
