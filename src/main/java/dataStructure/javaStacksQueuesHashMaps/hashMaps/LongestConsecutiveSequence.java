package javaStacksQueuesHashMaps.hashMaps;

import java.util.HashMap;

/**
 * Problem 8 (Longest Consecutive Sequence)
 * Given an unsorted array, find the length of the longest
 * consecutive elements sequence.
 *
 * Hint: Use a hash map to store elements and check for
 * consecutive elements efficiently.
 *
 * Author : Mithun
 * Date : 07-10-2026
 */

public class LongestConsecutiveSequence {

    public static int findLongestSequence(int[] array) {

        HashMap<Integer, Boolean> map = new HashMap<>();

        // Store all elements in the hash map
        for (int value : array) {
            map.put(value, true);
        }

        int longest = 0;

        for (int value : array) {

            // Start only when previous number does not exist
            if (!map.containsKey(value - 1)) {

                int current = value;
                int length = 1;

                // Find consecutive numbers
                while (map.containsKey(current + 1)) {
                    current++;
                    length++;
                }

                // Update longest sequence
                longest = Math.max(longest, length);
            }
        }

        return longest;
    }

    public static void main(String[] args) {

        int[] array = {100, 4, 200, 1, 3, 2};

        System.out.print("Array: ");

        for (int value : array) {
            System.out.print(value + " ");
        }

        System.out.println();

        int result = findLongestSequence(array);

        System.out.println("Longest Consecutive Sequence Length: " + result);
    }
}