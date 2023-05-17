package com.assignment7.q5;

public class SubClass extends OuterClass {

    public SubClass(int outerVar) {
        super(outerVar);
    }

    public class SubInnerClass extends InnerClass {

        public SubInnerClass(int innerVar) {
            super(innerVar);
        }

        public void printSubVars() {
            System.out.println("Subclass InnerVar: " + super.innerVar);
        }
    }
}
