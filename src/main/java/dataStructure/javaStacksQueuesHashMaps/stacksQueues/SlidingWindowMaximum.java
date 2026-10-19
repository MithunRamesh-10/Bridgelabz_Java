package javaStacksQueuesHashMaps.stacksQueues;

import java.util.Deque;
import java.util.LinkedList;

/**
 * Problem 4 (Sliding Window Maximum)
 * Given an array and a window size k, find the maximum element
 * in each sliding window of size k.
 *
 * Hint: Use a deque (double-ended queue) to maintain indices
 * of useful elements in each window.
 *
 * Author : Mithun
 * Date : 07-10-2026
 */

public class SlidingWindowMaximum {

    public static void findMaximum(int[] array, int k) {

        // Check for invalid window size
        if (k <= 0 || k > array.length) {
            System.out.println("Invalid window size");
            return;
        }

        Deque<Integer> deque = new LinkedList<>();

        System.out.print("Sliding Window Maximum: ");

        for (int i = 0; i < array.length; i++) {

            // Remove indices that are outside the current window
            while (!deque.isEmpty() && deque.peekFirst() <= i - k) {
                deque.removeFirst();
            }

            // Remove smaller elements from the back
            while (!deque.isEmpty() && array[deque.peekLast()] <= array[i]) {
                deque.removeLast();
            }

            // Add current index
            deque.addLast(i);

            // Print maximum when first complete window is formed
            if (i >= k - 1) {
                System.out.print(array[deque.peekFirst()] + " ");
            }
        }
    }

    public static void main(String[] args) {

        int[] array = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;

        System.out.print("Array: ");

        for (int value : array) {
            System.out.print(value + " ");
        }

        System.out.println();
        System.out.println("Window Size: " + k);

        findMaximum(array, k);
    }
}