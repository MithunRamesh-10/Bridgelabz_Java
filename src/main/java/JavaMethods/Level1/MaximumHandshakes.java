package javaMethods.level1;

import java.util.Scanner;

/**
 * Problem 2 (GCR — Java Methods Level 1 Assignment)
 * Find the maximum number of handshakes possible among N students
 * using the combination formula.
 *
 * Author : Mithun
 * Date : 23-09-2026
 */
public class MaximumHandshakes {

    // Method to calculate maximum handshakes
    public static int calculateHandshakes(int numberOfStudents) {
        return (numberOfStudents * (numberOfStudents - 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take number of students
        System.out.print("Enter number of students: ");
        int numberOfStudents = input.nextInt();

        // Call method to calculate handshakes
        int handshakes = calculateHandshakes(numberOfStudents);

        // Display result
        System.out.println("Maximum number of handshakes: " + handshakes);

        input.close();
    }
}
