package javaSearchingAlgorithms.binarySearch;

/**
 * Problem 1 (Binary Search - Find the Rotation Point)
 * Find the index of the smallest element in a rotated sorted array.
 *
 * Author : Mithun
 * Date : 09-10-2026
 */

public class RotationPoint {

    public static int findRotationPoint(int[] array) {

        int left = 0;
        int right = array.length - 1;

        // Find the smallest element using binary search
        while (left < right) {

            int mid = left + (right - left) / 2;

            // Smallest element lies in the right half
            if (array[mid] > array[right]) {
                left = mid + 1;
            } else {
                // Smallest element lies at mid or to its left
                right = mid;
            }
        }

        return left;
    }

    public static void main(String[] args) {

        int[] array = {4, 5, 6, 7, 0, 1, 2};

        int index = findRotationPoint(array);

        System.out.println("Rotation Point Index: " + index);
        System.out.println("Smallest Element: " + array[index]);
    }
}