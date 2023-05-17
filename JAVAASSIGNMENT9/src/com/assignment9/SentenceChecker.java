package com.assignment9;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SentenceChecker {
    // create a pattern for the sentence format
    private static final Pattern SENTENCE_PATTERN = Pattern.compile("^[A-Z].*\\.$");

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        boolean isValid = isValidSentence(sentence);
        if (isValid) {
            System.out.println("The sentence is valid.");
        } else {
            System.out.println("The sentence is invalid.");
        }
    }

    public static boolean isValidSentence(String sentence) {
        // match the pattern against the sentence
        Matcher matcher = SENTENCE_PATTERN.matcher(sentence);
        return matcher.matches();
    }
}
