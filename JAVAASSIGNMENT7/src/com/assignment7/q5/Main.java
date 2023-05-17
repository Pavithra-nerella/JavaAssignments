package com.assignment7.q5;

public class Main {

    public static void main(String[] args) {

        // Create an instance of the outer class
        OuterClass outer = new OuterClass(1);

        // Create an instance of the inner class
        OuterClass.InnerClass inner = outer.new InnerClass(2);

        // Call method on inner class
        inner.printVars();

        // Create an instance of the subclass
        SubClass sub = new SubClass(3);

        // Create an instance of the subclass inner class
        SubClass.SubInnerClass subInner = sub.new SubInnerClass(4);

        // Call methods on subclass inner class
        subInner.printVars();
        subInner.printSubVars();
    }
}
