package com.ifelse;

public class IfElseExample {
    public static void main(String[] args) {
        int amount = 0;
        while (true) {
            System.out.println("loop");
            if (amount == 6) {
                break;
            }
            amount++;
            System.out.println("Out of loop");
        }
    }
}
