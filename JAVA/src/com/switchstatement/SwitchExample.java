package com.switchstatement;

import java.util.Scanner;

public class SwitchExample {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the instruction");
        String text =input.nextLine();
        switch(text){
            case "run":
                System.out.println("Program is running");
                break;
            case "stop":
                System.out.println("Program is stopped");
                break;
            default:
                System.out.println("Instructions not recognised");
        }
    }
}
