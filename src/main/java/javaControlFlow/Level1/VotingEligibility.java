package javaControlFlow.level1;

import java.util.Scanner;

/**
 * Problem 5 (GCR — Control Flow Assignment)
 * Write a program to check whether a person can vote,
 * depending on whether his/her age is greater than or equal to 18.
 *
 * Author : Mithun
 * Date : 21-09-2026
 */
public class VotingEligibility {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take age from the user
        System.out.print("Enter age: ");
        int age = input.nextInt();

        // Check voting eligibility
        if (age >= 18) {

            // Display eligible message
            System.out.println("The person's age is " + age +
                    " and can vote.");
        } else {

            // Display not eligible message
            System.out.println("The person's age is " + age +
                    " and cannot vote.");
        }

        input.close();
    }
}
