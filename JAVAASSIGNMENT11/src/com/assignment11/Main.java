package com.assignment11;

import java.io.*;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        File inputFile = new File("sample.txt");
        File outputFile = new File("result.txt");
        try {
            HashMap<Character, Integer> map = CharacterCounter.countCharacters(inputFile);
            CharacterCounter.writeToFile(outputFile, map);
            System.out.println(map);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
