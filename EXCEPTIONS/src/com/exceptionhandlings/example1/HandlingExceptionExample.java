package com.exceptionhandlings.example1;

import java.io.File;
        import java.io.FileNotFoundException;
        import java.util.Scanner;

public class HandlingExceptionExample  {

    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("example.txt");

        Scanner readFile = new Scanner(file);

    }

}
