package com.assignment1;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = "";

        // Loop to allow repeated searching for different patterns
        while (!input.equals("exit")) {

            // Prompt the user to enter a regular expression
            System.out.println("Enter a regular expression to search for files (or 'exit' to quit):");
            input = scanner.nextLine();

            // Search for files that match the regular expression
            FileSearch.searchFiles(input);
        }

        scanner.close();
    }
}
