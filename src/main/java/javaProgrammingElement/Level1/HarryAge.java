package javaProgrammingElements.level1;

/**
 * Problem 1 (GCR — Java Programming Elements Assignment)
 * Write a program to find the age of Harry if the birth year is 2000.
 * Assume the Current Year is 2024.
 *
 * Author : Mithun
 * Date : 19-09-2026
 */
public class FindHarryAge {
    public static void main(String[] args) {

        // Store Harry's birth year
        int birthYear = 2000;

        // Store the current year
        int currentYear = 2024;

        // Calculate Harry's age
        int age = currentYear - birthYear;

        // Display Harry's age
        System.out.println("Harry's age in 2024 is " + age);
    }
}
