package com.assignment11;

import java.io.*;
import java.util.HashMap;

public class CharacterCounter {

    public static HashMap<Character, Integer> countCharacters(File file) throws IOException {
        HashMap<Character, Integer> map = new HashMap<>();
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        int c = 0;
        while ((c = br.read()) != -1) {
            char character = (char) c;
            if (character != ' ') {
                if (map.containsKey(character)) {
                    int val = map.get(character) + 1;
                    map.put(character, val);
                } else {
                    map.put(character, 1);
                }
            }
        }
        br.close();
        return map;
    }

    public static void writeToFile(File file, HashMap<Character, Integer> map) throws IOException {
        FileOutputStream ops = new FileOutputStream(file);
        ObjectOutputStream objOps = new ObjectOutputStream(ops);
        objOps.writeObject(map.toString());
        objOps.flush();
        objOps.close();
        ops.close();
    }
}
