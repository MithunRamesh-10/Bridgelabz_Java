package JavaStrings.Extras;

import java.util.Scanner;

/**
 * Problem 9 (GCR — Java Strings Level 1 Assignment)
 * Find the most frequent character in a string.
 *
 * Author : Mithun
 * Date : 01-10-2026
 */
public class MostFrequentCharacter {

    // Method to find the most frequent character
    public static char findMostFrequentCharacter(String text) {

        char mostFrequentCharacter = text.charAt(0);
        int maximumFrequency = 0;

        for (int i = 0; i < text.length(); i++) {

            int frequency = 0;

            for (int j = 0; j < text.length(); j++) {

                if (text.charAt(i) == text.charAt(j)) {
                    frequency++;
                }
            }

            if (frequency > maximumFrequency) {
                maximumFrequency = frequency;
                mostFrequentCharacter = text.charAt(i);
            }
        }

        return mostFrequentCharacter;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take string input
        System.out.print("Enter a string: ");
        String text = input.nextLine();

        // Call method
        char result = findMostFrequentCharacter(text);

        // Display result
        System.out.println(
                "Most Frequent Character: '" + result + "'"
        );

        input.close();
    }
}