package javaArrays.level2;

import java.util.Scanner;

/**
 * Problem 2 (GCR — Java Arrays Level 2 Assignment)
 * Find the youngest among Amar, Akbar, and Anthony based on age
 * and find the tallest among them based on height using arrays.
 *
 * Author : Mithun
 * Date : 22-09-2026
 */
public class YoungestTallestFriend {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Store the names of the three friends
        String[] names = {"Amar", "Akbar", "Anthony"};

        // Create arrays for age and height
        int[] ages = new int[3];
        double[] heights = new double[3];

        // Take age and height input
        for (int i = 0; i < names.length; i++) {
            System.out.print("Enter age of " + names[i] + ": ");
            ages[i] = input.nextInt();

            System.out.print("Enter height of " + names[i] + ": ");
            heights[i] = input.nextDouble();
        }

        // Assume the first friend is youngest and tallest
        int youngestIndex = 0;
        int tallestIndex = 0;

        // Find youngest and tallest friend
        for (int i = 1; i < names.length; i++) {

            // Compare ages
            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
            }

            // Compare heights
            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i;
            }
        }

        // Display the results
        System.out.println("Youngest friend: " + names[youngestIndex]);
        System.out.println("Tallest friend: " + names[tallestIndex]);

        input.close();
    }
}
