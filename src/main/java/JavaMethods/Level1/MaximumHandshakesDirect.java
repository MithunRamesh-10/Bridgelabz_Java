package javaMethods.level1;

import java.util.Scanner;

/**
 * Problem 3 (GCR — Java Methods Level 1 Assignment)
 * Find the maximum number of handshakes among N students.
 * Use a method with numberOfStudents as the input.
 *
 * Author : Mithun
 * Date : 23-09-2026
 */
public class MaximumHandshakesMethod {

    // Method to calculate maximum handshakes
    public static int findHandshakes(int numberOfStudents) {
        return (numberOfStudents * (numberOfStudents - 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take number of students
        System.out.print("Enter number of students: ");
        int numberOfStudents = input.nextInt();

        // Call method to calculate handshakes
        int handshakes = findHandshakes(numberOfStudents);

        // Display result
        System.out.println("Number of possible handshakes: " + handshakes);

        input.close();
    }
}
