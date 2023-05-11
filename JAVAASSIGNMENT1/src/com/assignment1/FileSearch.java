package com.assignment1;

import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FileSearch {

    //Recursively searches for files in the user's home directory that match a given pattern.
    public static void searchFiles(String regex) {

        // Compile the regular expression pattern
        Pattern pattern = Pattern.compile(regex);

        // Get the user's home directory
        String homeDir = System.getProperty("user.home");
        File dir = new File(homeDir);

        // Search for files that match the regular expression
        searchFilesRecursive(dir, pattern);
    }

    private static void searchFilesRecursive(File dir, Pattern pattern) {

        // Get a list of files in the directory
        File[] files = dir.listFiles();

        // If the list of files is null (e.g. if dir is not a directory), return
        if (files == null) {
            return;
        }

        // Loop through the files in the directory
        for (File file : files) {

            // If the file is a directory, recursively search it
            if (file.isDirectory()) {
                searchFilesRecursive(file, pattern);
            }

            // If the file matches the regular expression, print its absolute path
            else {
                String fileName = file.getName();
                Matcher matcher = pattern.matcher(fileName);
                if (matcher.matches()) {
                    System.out.println(file.getAbsolutePath());
                }
            }
        }
    }
}
