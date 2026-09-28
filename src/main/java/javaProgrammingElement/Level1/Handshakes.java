package javaProgrammingElements.level1;

import java.util.Scanner;

/**
 * Problem 16 (GCR — Java Programming Elements Assignment)
 * Calculate the maximum number of handshakes possible among
 * a given number of students.
 *
 * Author : Mithun
 * Date : 19-09-2026
 */
public class MaximumHandshakes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take the number of students from the user
        System.out.print("Enter number of students: ");
        int numberOfStudents = input.nextInt();

        // Calculate the maximum number of handshakes
        int handshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

        // Display the maximum number of handshakes
        System.out.println("The maximum number of handshakes is " + handshakes);

        input.close();
    }
}
