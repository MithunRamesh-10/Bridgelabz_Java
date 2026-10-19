package javaSearchingAlgorithms.fileReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Problem 2 (Count the Occurrence of a Word in a File)
 * Read a file and count how many times a specific word appears.
 *
 * Author : Mithun
 * Date : 09-10-2026
 */

public class CountWordOccurrences {

    public static void main(String[] args) {

        String targetWord = "java";
        int count = 0;

        // Open the file for reading
        try (BufferedReader reader =
                     new BufferedReader(new FileReader("Bridgelabz_Java/src/main/java/sample.txt"))) {

            String line;

            // Read each line
            while ((line = reader.readLine()) != null) {

                // Split the line into words
                String[] words = line.split("\\W+");

                // Compare each word with the target
                for (String word : words) {
                    if (word.equalsIgnoreCase(targetWord)) {
                        count++;
                    }
                }
            }

            System.out.println("Word: " + targetWord);
            System.out.println("Occurrences: " + count);

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}