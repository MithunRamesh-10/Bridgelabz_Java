package javaComplexities;

/**
 * Problem 5 (Runtime Analysis - Fibonacci Sequence)
 * Compare recursive and iterative approaches to calculate
 * Fibonacci numbers for different input values.
 *
 * Author : Mithun
 * Date : 12-10-2026
 */

public class FibonacciComparison {

    // Calculate Fibonacci using recursion
    // Time Complexity: O(2^N)
    // Space Complexity: O(N)
    public static long recursiveFibonacci(int n) {

        if (n <= 1) {
            return n;
        }

        return recursiveFibonacci(n - 1)
                + recursiveFibonacci(n - 2);
    }

    // Calculate Fibonacci using iteration
    // Time Complexity: O(N)
    // Space Complexity: O(1)
    public static long iterativeFibonacci(int n) {

        if (n <= 1) {
            return n;
        }

        long first = 0;
        long second = 1;

        for (int i = 2; i <= n; i++) {
            long next = first + second;
            first = second;
            second = next;
        }

        return second;
    }

    public static void main(String[] args) {

        int[] values = {10, 30, 50};

        System.out.println("Recursive vs Iterative Fibonacci");

        for (int n : values) {

            System.out.println("\nN: " + n);

            // Naive recursion is skipped for large input
            if (n <= 30) {

                long start = System.nanoTime();
                long recursiveResult = recursiveFibonacci(n);
                long recursiveTime = System.nanoTime() - start;

                System.out.println("Recursive Result: "
                        + recursiveResult);
                System.out.println("Recursive Time: "
                        + recursiveTime + " ns");

            } else {
                System.out.println(
                        "Recursive calculation skipped (too slow).");
            }

            long start = System.nanoTime();
            long iterativeResult = iterativeFibonacci(n);
            long iterativeTime = System.nanoTime() - start;

            System.out.println("Iterative Result: "
                    + iterativeResult);
            System.out.println("Iterative Time: "
                    + iterativeTime + " ns");
        }
    }
}