package javaSearchingAlgorithms.fileReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Problem 1 (Read a File Line by Line Using FileReader)
 * Read a text file line by line and print each line to the console.
 *
 * Author : Mithun
 * Date : 09-10-2026
 */

public class ReadFileLineByLine {

    public static void main(String[] args) {

        // Open the file and wrap it with BufferedReader
        try (BufferedReader reader =
                     new BufferedReader(new FileReader("Bridgelabz_Java/src/main/java/sample.txt"))) {

            String line;

            // Read and print each line
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}