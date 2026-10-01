package JavaStrings.Extras;

import java.util.Scanner;

/**
 * Problem 12 (GCR — Java Strings Level 1 Assignment)
 * Write a replace method that replaces a given word
 * with another word in a sentence.
 *
 * Author : Mithun
 * Date : 01-10-2026
 */
public class ReplaceWordInSentence {

    // Method to replace one word with another word
    public static String replaceWord(
            String sentence,
            String oldWord,
            String newWord) {

        String result = "";
        int i = 0;

        while (i < sentence.length()) {

            boolean wordFound = true;

            if (i + oldWord.length() <= sentence.length()) {

                for (int j = 0; j < oldWord.length(); j++) {

                    if (sentence.charAt(i + j) != oldWord.charAt(j)) {
                        wordFound = false;
                        break;
                    }
                }

            } else {
                wordFound = false;
            }

            if (wordFound) {
                result = result + newWord;
                i = i + oldWord.length();
            } else {
                result = result + sentence.charAt(i);
                i++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take sentence
        System.out.print("Enter a sentence: ");
        String sentence = input.nextLine();

        // Take word to replace
        System.out.print("Enter word to replace: ");
        String oldWord = input.nextLine();

        // Take replacement word
        System.out.print("Enter replacement word: ");
        String newWord = input.nextLine();

        // Call method
        String result = replaceWord(
                sentence,
                oldWord,
                newWord
        );

        // Display result
        System.out.println("Modified Sentence: " + result);

        input.close();
    }
}
