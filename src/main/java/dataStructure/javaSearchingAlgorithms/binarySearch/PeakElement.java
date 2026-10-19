package javaSearchingAlgorithms.binarySearch;

/**
 * Problem 2 (Binary Search - Find the Peak Element)
 * Find an element greater than its neighbors.
 * If multiple peaks exist, return any one of them.
 *
 * Author : Mithun
 * Date : 09-10-2026
 */

public class PeakElement {

    public static int findPeak(int[] array) {

        int left = 0;
        int right = array.length - 1;

        // Search for a peak using binary search
        while (left < right) {

            int mid = left + (right - left) / 2;

            // Peak lies on the right if the next element is larger
            if (array[mid] < array[mid + 1]) {
                left = mid + 1;
            } else {
                // Peak lies at mid or on the left
                right = mid;
            }
        }

        return left;
    }

    public static void main(String[] args) {

        int[] array = {1, 3, 20, 4, 1, 0};

        int index = findPeak(array);

        System.out.println("Peak Element: " + array[index]);
        System.out.println("Peak Index: " + index);
    }
}