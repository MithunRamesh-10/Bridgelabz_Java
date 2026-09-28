package javaControlFlow.level1;

import java.util.Scanner;

/**
 * Problem 8 (GCR — Control Flow Assignment)
 * Write a program to count down the number from the user input
 * value to 1 using a while loop for a rocket launch.
 *
 * Author : Mithun
 * Date : 21-09-2026
 */
public class RocketCountdown {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take countdown value from the user
        System.out.print("Enter countdown value: ");
        int counter = input.nextInt();

        // Run countdown using while loop
        while (counter >= 1) {

            // Print current countdown value
            System.out.println(counter);

            // Decrement counter
            counter--;
        }

        input.close();
    }
}
