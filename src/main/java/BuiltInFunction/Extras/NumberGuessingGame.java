package javaExtras.level1;

import java.util.Random;
import java.util.Scanner;

/**
 * Problem 1 (GCR — Java Extras Level 1 Assignment)
 * Create a number guessing game where the user thinks of a number
 * between 1 and 100 and the computer tries to guess the number.
 * The user provides feedback whether the guess is high, low, or correct.
 *
 * Author : Mithun
 * Date : 01-10-2026
 */
public class NumberGuessingGame {

    // Method to generate a random guess between minimum and maximum
    public static int generateGuess(int minimum, int maximum) {
        Random random = new Random();
        return random.nextInt(maximum - minimum + 1) + minimum;
    }

    // Method to get feedback from the user
    public static String getFeedback(Scanner input) {
        System.out.print("Enter feedback (high / low / correct): ");
        return input.next().toLowerCase();
    }

    // Method to determine the next range based on feedback
    public static int[] determineNextRange(
            int guess,
            String feedback,
            int minimum,
            int maximum) {

        if (feedback.equals("high")) {
            maximum = guess - 1;
        } else if (feedback.equals("low")) {
            minimum = guess + 1;
        }

        return new int[]{minimum, maximum};
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int minimum = 1;
        int maximum = 100;

        String feedback;

        // Generate guesses until the correct number is found
        do {
            int guess = generateGuess(minimum, maximum);

            System.out.println("Computer's guess: " + guess);

            feedback = getFeedback(input);

            // Determine next guessing range
            if (feedback.equals("high") || feedback.equals("low")) {

                int[] range = determineNextRange(
                        guess,
                        feedback,
                        minimum,
                        maximum
                );

                minimum = range[0];
                maximum = range[1];
            }

        } while (!feedback.equals("correct"));

        // Display result
        System.out.println("Computer guessed the number correctly!");

        input.close();
    }
}
