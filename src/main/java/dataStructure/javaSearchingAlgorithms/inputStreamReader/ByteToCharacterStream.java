package javaSearchingAlgorithms.inputStreamReader;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

/**
 * Problem 1 (Convert Byte Stream to Character Stream)
 * Use InputStreamReader to read file bytes and convert them
 * into characters using UTF-8 encoding.
 *
 * Author : Mithun
 * Date : 09-10-2026
 */

public class ByteToCharacterStream {

    public static void main(String[] args) {

        // Convert file bytes into characters using UTF-8
        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(
                        new FileInputStream("Bridgelabz_Java/src/main/java/sample.txt"),
                        StandardCharsets.UTF_8))) {

            String line;

            // Read and display each line
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}