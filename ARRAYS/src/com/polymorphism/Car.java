package com.polymorphism;

public class Car extends Vehicle {

    @Override
    public void design() {
        System.out.println("Car design");
    }

    public void ride() {

        System.out.println("Riding the car");
    }

}
