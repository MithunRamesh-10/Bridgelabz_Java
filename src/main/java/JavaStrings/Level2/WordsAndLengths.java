package javaString.level2;

import java.util.Scanner;

/**
 * Problem 3 (GCR — Java String Level 2 Assignment)
 * Split the text into words and return the words along
 * with their lengths in a 2D String array.
 *
 * Author : Mithun
 * Date : 25-09-2026
 */
public class WordLength {

    // Find string length without using length()
    public static int findLength(String text) {
        int count = 0;

        try {
            // Count characters until exception occurs
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
        int wordCount = 1;

        // Count words using spaces
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        String[] words = new String[wordCount];

        int start = 0;
        int wordIndex = 0;

        // Extract each word
        for (int i = 0; i <= length; i++) {
            if (i == length || text.charAt(i) == ' ') {
                String word = "";

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

    // Create 2D array containing word and its length
    public static String[][] createWordLengthArray(String[] words) {
        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];

            // Find length without using length()
            int wordLength = findLength(words[i]);

            // Convert length to String using String.valueOf()
            result[i][1] = String.valueOf(wordLength);
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take complete text input
        System.out.print("Enter text: ");
        String text = input.nextLine();

        // Split text into words
        String[] words = splitUsingCharAt(text);

        // Create word-length 2D array
        String[][] result = createWordLengthArray(words);

        // Display the result in tabular format
        System.out.printf("%-15s %-10s%n", "Word", "Length");

        for (int i = 0; i < result.length; i++) {
            int length = Integer.parseInt(result[i][1]);

            System.out.printf(
                    "%-15s %-10d%n",
                    result[i][0],
                    length
            );
        }

        input.close();
    }
}
