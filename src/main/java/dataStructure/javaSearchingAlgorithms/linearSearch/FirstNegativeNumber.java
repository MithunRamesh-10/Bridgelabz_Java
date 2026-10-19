package javaSearchingAlgorithms.linearSearch;

/**
 * Problem 1 (Linear Search - First Negative Number)
 * Find the first negative number in an integer array.
 * Return its index or -1 if no negative number exists.
 *
 * Author : Mithun
 * Date : 09-10-2026
 */

public class FirstNegativeNumber {

    public static int findFirstNegative(int[] numbers) {

        // Traverse the array from the beginning
        for (int i = 0; i < numbers.length; i++) {

            // Return the index of the first negative number
            if (numbers[i] < 0) {
                return i;
            }
        }

        // Return -1 if no negative number is found
        return -1;
    }

    public static void main(String[] args) {

        int[] numbers = {10, 25, 7, -4, -9, 12};

        System.out.print("Array: ");

        for (int number : numbers) {
            System.out.print(number + " ");
        }

        int index = findFirstNegative(numbers);

        if (index != -1) {
            System.out.println("\nFirst Negative Number: " + numbers[index]);
            System.out.println("Index: " + index);
        } else {
            System.out.println("\nNo negative number found");
        }
    }
}