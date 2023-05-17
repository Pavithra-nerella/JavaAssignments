package com.assignment7.q3;

public class MyClass extends ConcreteClass implements CombinedInterface {
    @Override
    public void methodA1() {

        System.out.println("MyClass implementing InterfaceA methodA1.");
    }

    @Override
    public void methodA2() {
        System.out.println("MyClass implementing InterfaceA methodA2.");
    }

    @Override
    public void methodB1() {
        System.out.println("MyClass implementing InterfaceB methodB1.");
    }

    @Override
    public void methodB2() {
        System.out.println("MyClass implementing InterfaceB methodB2.");
    }

    @Override
    public void methodC1() {
        System.out.println("MyClass implementing InterfaceC methodC1.");
    }

    @Override
    public void methodC2() {
        System.out.println("MyClass implementing InterfaceC methodC2.");
    }

    @Override
    public void newMethod() {
        System.out.println("MyClass implementing CombinedInterface newMethod.");
    }
}
