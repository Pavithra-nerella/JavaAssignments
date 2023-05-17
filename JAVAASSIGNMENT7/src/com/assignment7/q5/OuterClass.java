package com.assignment7.q5;

public class OuterClass {

    private int outerVar;

    public OuterClass(int outerVar) {
        this.outerVar = outerVar;
    }

    public class InnerClass {

        int innerVar;

        public InnerClass(int innerVar) {
            this.innerVar = innerVar;
        }

        public void printVars() {
            System.out.println("OuterVar: " + outerVar + ", InnerVar: " + innerVar);
        }
    }
}

