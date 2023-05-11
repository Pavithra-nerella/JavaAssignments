package com.userinput;

import java.util.Scanner;

public class UserInputExample {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter an input");
        String text=input.nextLine();
        System.out.println("Your line is: "+text);
        System.out.println("Enter an integer");
        int value=input.nextInt();
        System.out.println("Your number is: "+value);
        System.out.println("Enter a double number");
        double number=input.nextDouble();
        System.out.println("Your line is: "+number);

    }
}
