package JavaStrings.Extras;

import java.util.Scanner;

/**
 * Problem 5 (GCR — Java Strings Level 1 Assignment)
 * Find the longest word in a given sentence.
 *
 * Author : Mithun
 * Date : 01-10-2026
 */
public class LongestWordInSentence {

    // Method to find the longest word
    public static String findLongestWord(String sentence) {

        String longestWord = "";
        String currentWord = "";

        for (int i = 0; i <= sentence.length(); i++) {

            if (i < sentence.length() && sentence.charAt(i) != ' ') {

                currentWord = currentWord + sentence.charAt(i);

            } else {

                if (currentWord.length() > longestWord.length()) {
                    longestWord = currentWord;
                }

                currentWord = "";
            }
        }

        return longestWord;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take sentence input
        System.out.print("Enter a sentence: ");
        String sentence = input.nextLine();

        // Call method
        String result = findLongestWord(sentence);

        // Display result
        System.out.println("Longest word: " + result);

        input.close();
    }
}