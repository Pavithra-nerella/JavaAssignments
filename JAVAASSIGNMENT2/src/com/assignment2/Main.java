package com.assignment2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        AlphabetChecker alphabetChecker = new AlphabetChecker();
        boolean containsAlphabet = alphabetChecker.containsAlphabet(input);

        if (containsAlphabet) {
            System.out.println("The string contains all the letters of the alphabet.");
        } else {
            System.out.println("The string does not contain all the letters of the alphabet.");
        }
    }
}
