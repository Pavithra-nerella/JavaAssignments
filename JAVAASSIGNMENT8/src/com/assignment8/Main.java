package com.assignment8;

public class Main {
    public static void main(String[] args) {
        try {
            ExceptionThrower.throwExceptions();
        } catch (CustomException1 | CustomException2 | CustomException3 e) {
            System.out.println("Caught exception: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed.");
        }
    }
}
