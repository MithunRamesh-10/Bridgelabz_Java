package javaString.level2;

import java.util.Scanner;

/**
 * Problem 4 (GCR — Java String Level 2 Assignment)
 * Split the text into words and find the shortest and
 * longest strings in the given text.
 *
 * Author : Mithun
 * Date : 25-09-2026
 */
public class ShortestLongestWords {

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

        // Count the number of words
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        String[] words = new String[wordCount];

        int start = 0;
        int wordIndex = 0;

        // Extract every word
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

    // Create word and length 2D array
    public static String[][] createWordLengthArray(String[] words) {
        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] =
                    String.valueOf(findLength(words[i]));
        }

        return result;
    }

    // Find shortest and longest word positions
    public static int[] findShortestLongest(String[][] words) {
        int shortestIndex = 0;
        int longestIndex = 0;

        // Compare word lengths
        for (int i = 1; i < words.length; i++) {
            int currentLength =
                    Integer.parseInt(words[i][1]);

            int shortestLength =
                    Integer.parseInt(words[shortestIndex][1]);

            int longestLength =
                    Integer.parseInt(words[longestIndex][1]);

            if (currentLength < shortestLength) {
                shortestIndex = i;
            }

            if (currentLength > longestLength) {
                longestIndex = i;
            }
        }

        return new int[]{shortestIndex, longestIndex};
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take complete text input
        System.out.print("Enter text: ");
        String text = input.nextLine();

        // Split text into words
        String[] words = splitUsingCharAt(text);

        // Create word-length array
        String[][] wordLengthArray =
                createWordLengthArray(words);

        // Find shortest and longest word
        int[] result =
                findShortestLongest(wordLengthArray);

        // Display results
        int shortestIndex = result[0];
        int longestIndex = result[1];

        System.out.println(
                "Shortest word: "
                        + wordLengthArray[shortestIndex][0]
        );

        System.out.println(
                "Shortest length: "
                        + wordLengthArray[shortestIndex][1]
        );

        System.out.println(
                "Longest word: "
                        + wordLengthArray[longestIndex][0]
        );

        System.out.println(
                "Longest length: "
                        + wordLengthArray[longestIndex][1]
        );

        input.close();
    }
}
