package javaComplexities;

/**
 * Problem 1 (Runtime Analysis - Linear Search vs Binary Search)
 * Compare the runtime of Linear Search and Binary Search
 * for different dataset sizes.
 *
 * Author : Mithun
 * Date : 12-10-2026
 */

public class SearchComparison {

    // Perform Linear Search
    // Time Complexity: O(N)
    // Space Complexity: O(1)
    public static int linearSearch(int[] array, int target) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }

        return -1;
    }

    // Perform Binary Search on a sorted array
    // Time Complexity: O(log N)
    // Space Complexity: O(1)
    public static int binarySearch(int[] array, int target) {

        int left = 0;
        int right = array.length - 1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (array[mid] == target) {
                return mid;
            } else if (array[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] sizes = {1000, 10000, 1000000};

        System.out.println("Linear Search vs Binary Search");

        for (int size : sizes) {

            int[] array = new int[size];

            // Create sorted data
            for (int i = 0; i < size; i++) {
                array[i] = i;
            }

            int target = size - 1;

            // Measure Linear Search runtime
            long startTime = System.nanoTime();
            int linearResult = linearSearch(array, target);
            long linearTime = System.nanoTime() - startTime;

            // Measure Binary Search runtime
            startTime = System.nanoTime();
            int binaryResult = binarySearch(array, target);
            long binaryTime = System.nanoTime() - startTime;

            System.out.println("\nDataset Size: " + size);

            System.out.println("Linear Search Index: "
                    + linearResult);
            System.out.println("Linear Search Time: "
                    + linearTime + " ns");

            System.out.println("Binary Search Index: "
                    + binaryResult);
            System.out.println("Binary Search Time: "
                    + binaryTime + " ns");
        }
    }
}