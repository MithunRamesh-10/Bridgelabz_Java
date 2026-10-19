package javaSearchingAlgorithms.binarySearch;

/**
 * Problem 3 (Binary Search - Search a Sorted Matrix)
 * Search for a target in a matrix where each row is sorted
 * and each row's first element is greater than the previous
 * row's last element.
 *
 * Author : Mithun
 * Date : 09-10-2026
 */

public class SearchSortedMatrix {

    public static boolean searchMatrix(int[][] matrix, int target) {

        int rows = matrix.length;

        // Handle an empty matrix
        if (rows == 0 || matrix[0].length == 0) {
            return false;
        }

        int columns = matrix[0].length;
        int left = 0;
        int right = rows * columns - 1;

        // Perform binary search on the flattened matrix
        while (left <= right) {

            int mid = left + (right - left) / 2;

            // Convert flattened index to row and column
            int row = mid / columns;
            int col = mid % columns;

            // Check whether the target is found
            if (matrix[row][col] == target) {
                return true;
            }

            // Search the left half
            if (matrix[row][col] > target) {
                right = mid - 1;
            } else {
                // Search the right half
                left = mid + 1;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        int[][] matrix = {
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 60}
        };

        int target = 16;

        System.out.println("Target: " + target);
        System.out.println("Found: " + searchMatrix(matrix, target));
    }
}