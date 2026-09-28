package javaString.level2;

import java.util.Scanner;

/**
 * Problem 2 (GCR — Java String Level 2 Assignment)
 * Split the text into words using charAt() without using
 * the built-in split() method and compare the results.
 *
 * Author : Mithun
 * Date : 25-09-2026
 */
public class SplitWords {

    // Find string length without using length()
    public static int findLength(String text) {
        int count = 0;

        try {
            // Count characters until charAt() throws exception
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException exception) {
            // End of string reached
        }

        return count;
    }

    // Split text into words using charAt()
    public static String[] splitUsingCharAt(String text) {
        int length = findLength(text);

        // Count the number of words
        int wordCount = 1;

        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        String[] words = new String[wordCount];

        // Store words using character positions
        int start = 0;
        int wordIndex = 0;

        for (int i = 0; i <= length; i++) {
            if (i == length || text.charAt(i) == ' ') {
                String word = "";

                // Extract characters of the current word
                for (int j = start; j < i; j++) {
                    word = word + text.charAt(j);
                }

                words[wordIndex] = word;
                wordIndex++;
                start = i + 1;
            }
        }

        return words;
    }

    // Compare two string arrays
    public static boolean compareArrays(
            String[] first, String[] second) {

        // Check array lengths
        if (first.length != second.length) {
            return false;
        }

        // Compare every word
        for (int i = 0; i < first.length; i++) {
            if (!first[i].equals(second[i])) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take complete text input
        System.out.print("Enter text: ");
        String text = input.nextLine();

        // Split using user-defined method
        String[] userDefinedWords = splitUsingCharAt(text);

        // Split using built-in split()
        String[] builtInWords = text.split(" ");

        // Compare both results
        boolean result =
                compareArrays(userDefinedWords, builtInWords);

        // Display user-defined words
        System.out.println("Words using charAt():");
        for (String word : userDefinedWords) {
            System.out.println(word);
        }

        // Display built-in words
        System.out.println("Words using split():");
        for (String word : builtInWords) {
            System.out.println(word);
        }

        System.out.println("Both results are same: " + result);

        input.close();
    }
}
