package javaStacksQueuesHashMaps.hashMaps;

import java.util.HashMap;

/**
 * Problem 6 (Find All Subarrays with Zero Sum)
 * Given an array, find all subarrays whose elements sum up to zero.
 *
 * Hint: Use a hash map to store the cumulative sum and its frequency.
 * If a sum repeats, a zero-sum subarray exists.
 *
 * Author : Mithun
 * Date : 07-10-2026
 */

public class ZeroSumSubarrays {

    public static void findZeroSumSubarrays(int[] array) {

        HashMap<Integer, Integer> sumMap = new HashMap<>();

        int sum = 0;

        // Initial cumulative sum
        sumMap.put(0, 1);

        for (int i = 0; i < array.length; i++) {

            // Calculate cumulative sum
            sum += array[i];

            // Check if this sum appeared before
            if (sumMap.containsKey(sum)) {

                int frequency = sumMap.get(sum);

                // Print all matching subarrays
                for (int j = 0; j < frequency; j++) {
                    System.out.println("Subarray found ending at index " + i);
                }
            }

            // Increase frequency of current sum
            sumMap.put(sum, sumMap.getOrDefault(sum, 0) + 1);
        }
    }

    public static void main(String[] args) {

        int[] array = {3, 4, -7, 3, 1, -4, -2, -2};

        System.out.print("Array: ");

        for (int value : array) {
            System.out.print(value + " ");
        }

        System.out.println();
        System.out.println("Zero Sum Subarrays:");

        findZeroSumSubarrays(array);
    }
}