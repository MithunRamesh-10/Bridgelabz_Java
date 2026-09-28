package javaControlFlow.level1;

import java.util.Scanner;

/**
 * Problem 9 (GCR — Control Flow Assignment)
 * Rewrite program 8 to do the countdown using the for-loop.
 *
 * Author : Mithun
 * Date : 21-09-2026
 */
public class RocketCountdownFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take countdown value from the user
        System.out.print("Enter countdown value: ");
        int counter = input.nextInt();

        // Run countdown using for loop
        for (int i = counter; i >= 1; i--) {

            // Print current countdown value
            System.out.println(i);
        }

        input.close();
    }
}
