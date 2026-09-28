package javaArrays.level1;

import java.util.Scanner;

/**
 * Problem 6 (GCR — Java Arrays Level 1 Assignment)
 * Create a program to find the mean height of players in a football team.
 * Store the heights of 11 players in an array, find their sum,
 * and calculate the mean height.
 *
 * Author : Mithun
 * Date : 22-09-2026
 */
public class MeanHeightOfPlayers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Create an array to store heights of 11 players
        double[] heights = new double[11];

        // Take height input for all players
        for (int i = 0; i < heights.length; i++) {
            System.out.print("Enter height of player " + (i + 1) + ": ");
            heights[i] = input.nextDouble();
        }

        // Calculate the sum of all heights
        double sum = 0;

        for (int i = 0; i < heights.length; i++) {
            sum += heights[i];
        }

        // Calculate the mean height
        double mean = sum / heights.length;

        // Display the mean height
        System.out.println("Mean height of the football team: " + mean);

        input.close();
    }
}
