package javaStacksQueuesHashMaps.hashMaps;

import java.util.HashMap;

/**
 * Problem 7 (Check for a Pair with Given Sum)
 * Given an array and a target sum, find if there exists
 * a pair of elements whose sum is equal to the target.
 *
 * Hint: Store visited numbers in a hash map and check if
 * target - current_number exists in the map.
 *
 * Author : Mithun
 * Date : 07-10-2026
 */

public class PairWithGivenSum {

    public static void findPair(int[] array, int target) {

        HashMap<Integer, Boolean> map = new HashMap<>();

        for (int value : array) {

            // Find the number required to make the target
            int required = target - value;

            // Check if required number was already seen
            if (map.containsKey(required)) {
                System.out.println("Pair found: " + required + " + " + value
                        + " = " + target);
                return;
            }

            // Store current number
            map.put(value, true);
        }

        System.out.println("No pair found");
    }

    public static void main(String[] args) {

        int[] array = {10, 15, 3, 7};
        int target = 17;

        System.out.print("Array: ");

        for (int value : array) {
            System.out.print(value + " ");
        }

        System.out.println();
        System.out.println("Target: " + target);

        findPair(array, target);
    }
}