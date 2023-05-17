package com.assignment7.q4;

public class Main {
    public static void main(String[] args) {
        CycleFactory unicycleFactory = new UnicycleFactory();
        Cycle unicycle = unicycleFactory.createCycle();
        unicycle.ride();

        CycleFactory bicycleFactory = new BicycleFactory();
        Cycle bicycle = bicycleFactory.createCycle();
        bicycle.ride();

        CycleFactory tricycleFactory = new TricycleFactory();
        Cycle tricycle = tricycleFactory.createCycle();
        tricycle.ride();
    }
}
