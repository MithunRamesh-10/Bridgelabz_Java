package javaControlFlow.level2;

import java.util.Scanner;

/**
 * Problem 8 (GCR — Control Flow Level 2 Assignment)
 * Find the youngest friend among Amar, Akbar, and Anthony based on age
 * and find the tallest friend based on their heights.
 *
 * Author : Mithun
 * Date : 21-09-2026
 */
public class YoungestTallestFriend {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take ages of the three friends
        System.out.print("Enter Amar's age: ");
        int amarAge = input.nextInt();

        System.out.print("Enter Akbar's age: ");
        int akbarAge = input.nextInt();

        System.out.print("Enter Anthony's age: ");
        int anthonyAge = input.nextInt();

        // Take heights of the three friends
        System.out.print("Enter Amar's height: ");
        double amarHeight = input.nextDouble();

        System.out.print("Enter Akbar's height: ");
        double akbarHeight = input.nextDouble();

        System.out.print("Enter Anthony's height: ");
        double anthonyHeight = input.nextDouble();

        // Find the youngest friend
        String youngest;

        if (amarAge <= akbarAge && amarAge <= anthonyAge) {
            youngest = "Amar";
        } else if (akbarAge <= amarAge && akbarAge <= anthonyAge) {
            youngest = "Akbar";
        } else {
            youngest = "Anthony";
        }

        // Find the tallest friend
        String tallest;

        if (amarHeight >= akbarHeight && amarHeight >= anthonyHeight) {
            tallest = "Amar";
        } else if (akbarHeight >= amarHeight && akbarHeight >= anthonyHeight) {
            tallest = "Akbar";
        } else {
            tallest = "Anthony";
        }

        // Display the results
        System.out.println("Youngest friend: " + youngest);
        System.out.println("Tallest friend: " + tallest);

        input.close();
    }
}
