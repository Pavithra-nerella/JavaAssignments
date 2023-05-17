package com.assignment7.q3;

public class Main {
    static void callInterface(InterfaceA obj) {
        obj.methodA1();
        obj.methodA2();
    }

    static void callInterface(InterfaceB obj) {
        obj.methodB1();
        obj.methodB2();
    }

    static void callInterface(InterfaceC obj) {
        obj.methodC1();
        obj.methodC2();
    }

    static void callInterface(CombinedInterface obj) {
        obj.methodA1();
        obj.methodA2();
        obj.methodB1();
        obj.methodB2();
        obj.methodC1();
        obj.methodC2();
        obj.newMethod();
    }

    public static void main(String[] args) {
        MyClass obj = new MyClass();

        callInterface(obj);
        callInterface(obj);
        callInterface(obj);
        callInterface(obj);
    }
}
