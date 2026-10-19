package javaSearchingAlgorithms.inputStreamReader;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Problem 2 (Read User Input and Write to File)
 * Read console input using InputStreamReader and write each
 * input line to a file until the user enters "exit".
 *
 * Author : Mithun
 * Date : 09-10-2026
 */

public class UserInputToFile {

    public static void main(String[] args) {

        // Read input from the console and write to a file
        try (
                BufferedReader reader = new BufferedReader(
                        new InputStreamReader(System.in));
                FileWriter writer = new FileWriter("Bridgelabz_Java/src/main/java/user_input.txt")
        ) {

            String line;

            System.out.println("Enter text (type exit to stop):");

            // Continue until the user enters exit
            while ((line = reader.readLine()) != null) {

                if (line.equalsIgnoreCase("exit")) {
                    break;
                }

                // Write each input on a new line
                writer.write(line);
                writer.write(System.lineSeparator());
            }

            System.out.println("Input saved to user_input.txt");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}