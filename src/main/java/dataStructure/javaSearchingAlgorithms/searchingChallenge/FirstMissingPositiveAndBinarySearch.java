package javaSearchingAlgorithms.searchingChallenge;

import java.util.Arrays;

/**
 * Challenge Problem (Linear Search and Binary Search)
 * Find the first missing positive integer using linear search.
 * Sort the array and use binary search to find a target index.
 *
 * Author : Mithun
 * Date : 09-10-2026
 */

public class FirstMissingPositiveAndBinarySearch {

    // Find the first missing positive integer using linear search
    public static int findFirstMissingPositive(int[] array) {

        boolean[] present = new boolean[array.length + 1];

        // Mark positive numbers that fit within the required range
        for (int value : array) {
            if (value > 0 && value <= array.length) {
                present[value] = true;
            }
        }

        // Find the first positive number that is missing
        for (int i = 1; i <= array.length; i++) {
            if (!present[i]) {
                return i;
            }
        }

        return array.length + 1;
    }

    // Find the target index using binary search
    public static int binarySearch(int[] array, int target) {

        int left = 0;
        int right = array.length - 1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (array[mid] == target) {
                return mid;
            }

            if (array[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] array = {3, 4, -1, 1};
        int target = 3;

        // Find missing positive before sorting
        int missing = findFirstMissingPositive(array);

        // Sort the array before binary search
        Arrays.sort(array);

        System.out.println("First Missing Positive: " + missing);
        System.out.println("Sorted Array: " + Arrays.toString(array));

        int index = binarySearch(array, target);

        System.out.println("Target: " + target);
        System.out.println("Target Index: " + index);
    }
}