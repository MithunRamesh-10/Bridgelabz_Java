package javaStacksQueuesHashMaps.hashMaps;

import java.util.HashMap;

/**
 * Problem 10 (Two Sum Problem)
 * Given an array and a target sum, find two indices such that
 * their values add up to the target.
 *
 * Hint: Use a hash map to store the index of each element
 * as you iterate. Check if target - current_element exists
 * in the map.
 *
 * Author : Mithun
 * Date : 07-10-2026
 */

public class TwoSum {

    public static void findTwoSum(int[] array, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < array.length; i++) {

            // Find the required value
            int required = target - array[i];

            // Check if required value already exists
            if (map.containsKey(required)) {

                int previousIndex = map.get(required);

                System.out.println("Indices: " + previousIndex + ", " + i);
                System.out.println("Values: " + array[previousIndex]
                        + " + " + array[i] + " = " + target);

                return;
            }

            // Store value with its index
            map.put(array[i], i);
        }

        System.out.println("No two sum solution found");
    }

    public static void main(String[] args) {

        int[] array = {2, 7, 11, 15};
        int target = 9;

        System.out.print("Array: ");

        for (int value : array) {
            System.out.print(value + " ");
        }

        System.out.println();
        System.out.println("Target: " + target);

        findTwoSum(array, target);
    }
}