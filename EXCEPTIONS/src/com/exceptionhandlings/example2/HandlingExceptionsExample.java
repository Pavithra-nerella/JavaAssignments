package com.exceptionhandlings.example2;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class HandlingExceptionsExample{

    public static void main(String[] args) {

        File file = new File("example.txt");

        try {
            Scanner readFile = new Scanner(file);

            // It will not be executed if an exception is thrown
            System.out.println("Hello there");

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + file.toString());
        }


        System.out.println("Hello there");
    }

}
