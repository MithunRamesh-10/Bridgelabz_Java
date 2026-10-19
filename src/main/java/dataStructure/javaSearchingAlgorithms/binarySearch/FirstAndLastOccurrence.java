package javaSearchingAlgorithms.binarySearch;

/**
 * Problem 4 (Binary Search - First and Last Occurrence)
 * Find the first and last indices of a target in a sorted array.
 * Return -1 for both if the target is not found.
 *
 * Author : Mithun
 * Date : 09-10-2026
 */

public class FirstAndLastOccurrence {

    // Find the first occurrence of the target
    public static int findFirst(int[] array, int target) {

        int left = 0;
        int right = array.length - 1;
        int result = -1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (array[mid] == target) {
                result = mid;

                // Continue searching on the left
                right = mid - 1;

            } else if (array[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return result;
    }

    // Find the last occurrence of the target
    public static int findLast(int[] array, int target) {

        int left = 0;
        int right = array.length - 1;
        int result = -1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (array[mid] == target) {
                result = mid;

                // Continue searching on the right
                left = mid + 1;

            } else if (array[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return result;
    }

    public static void main(String[] args) {

        int[] array = {1, 2, 2, 2, 3, 4, 5};
        int target = 2;

        System.out.println("First Occurrence: "
                + findFirst(array, target));

        System.out.println("Last Occurrence: "
                + findLast(array, target));
    }
}