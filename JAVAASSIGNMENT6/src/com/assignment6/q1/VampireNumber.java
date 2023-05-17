package com.assignment6.q1;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class VampireNumber {

    public static void main(String[] args) {
        List<Long> vampireNumbers = generateVampireNumbers(100);
        for (long number : vampireNumbers) {
            System.out.println(number);
        }
    }

    private static List<Long> generateVampireNumbers(int count) {
        List<Long> vampireNumbers = new ArrayList<>();
        long number = 10;
        while (vampireNumbers.size() < count) {
            if (isVampire(number)) {
                vampireNumbers.add(number);
            }
            number++;
        }
        return vampireNumbers;
    }

    private static boolean isVampire(long number) {
        String str = Long.toString(number);
        int length = str.length();
        if (length % 2 != 0) {
            return false;
        }
        Set<String> permutations = new HashSet<>();
        generatePermutations("", str, permutations);
        for (String perm : permutations) {
            long x = Long.parseLong(perm.substring(0, length / 2));
            long y = Long.parseLong(perm.substring(length / 2));
            if (x * y == number) {
                if (x % 10 == 0 && y % 10 == 0) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    private static void generatePermutations(String prefix, String suffix, Set<String> permutations) {
        if (suffix.length() == 0) {
            permutations.add(prefix);
        } else {
            for (int i = 0; i < suffix.length(); i++) {
                generatePermutations(prefix + suffix.charAt(i), suffix.substring(0, i) + suffix.substring(i+1), permutations);
            }
        }
    }
}
