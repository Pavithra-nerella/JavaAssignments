package com.assignment2;

import java.util.HashSet;
import java.util.Set;

public class AlphabetChecker {

    public boolean containsAlphabet(String input) {
        Set<Character> alphabetSet = new HashSet<>();
        for (char c = 'a'; c <= 'z'; c++) {
            alphabetSet.add(Character.toLowerCase(c));
        }

        for (char c : input.toCharArray()) {
            if (alphabetSet.contains(Character.toLowerCase(c))) {
                alphabetSet.remove(Character.toLowerCase(c));
                if (alphabetSet.isEmpty()) {
                    return true;
                }
            }
        }

        return false;
    }
}
