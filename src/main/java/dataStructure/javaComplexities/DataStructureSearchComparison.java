package javaComplexities;

import java.util.HashSet;
import java.util.TreeSet;

/**
 * Problem 6 (Runtime Analysis - Data Structure Search)
 * Compare the search performance of Array, HashSet
 * and TreeSet for different dataset sizes.
 *
 * Author : Mithun
 * Date : 12-10-2026
 */

public class DataStructureSearchComparison {

    // Search an element in an array
    // Time Complexity: O(N)
    // Space Complexity: O(1)
    public static boolean arraySearch(int[] array, int target) {

        for (int value : array) {
            if (value == target) {
                return true;
            }
        }

        return false;
    }

    // Search using HashSet
    // Average Time Complexity: O(1)
    public static boolean hashSetSearch(
            HashSet<Integer> set, int target) {

        return set.contains(target);
    }

    // Search using TreeSet
    // Time Complexity: O(log N)
    public static boolean treeSetSearch(
            TreeSet<Integer> set, int target) {

        return set.contains(target);
    }

    public static void main(String[] args) {

        int[] sizes = {1000, 100000, 1000000};

        System.out.println("Data Structure Search Comparison");

        for (int size : sizes) {

            int[] array = new int[size];
            HashSet<Integer> hashSet = new HashSet<>();
            TreeSet<Integer> treeSet = new TreeSet<>();

            // Insert the same values into all structures
            for (int i = 0; i < size; i++) {
                array[i] = i;
                hashSet.add(i);
                treeSet.add(i);
            }

            // Search for the last element
            int target = size - 1;

            // Measure array search
            long start = System.nanoTime();
            boolean arrayResult = arraySearch(array, target);
            long arrayTime = System.nanoTime() - start;

            // Measure HashSet search
            start = System.nanoTime();
            boolean hashResult = hashSetSearch(hashSet, target);
            long hashTime = System.nanoTime() - start;

            // Measure TreeSet search
            start = System.nanoTime();
            boolean treeResult = treeSetSearch(treeSet, target);
            long treeTime = System.nanoTime() - start;

            System.out.println("\nDataset Size: " + size);

            System.out.println("Array Search Found: "
                    + arrayResult);
            System.out.println("Array Search Time: "
                    + arrayTime + " ns");

            System.out.println("HashSet Search Found: "
                    + hashResult);
            System.out.println("HashSet Search Time: "
                    + hashTime + " ns");

            System.out.println("TreeSet Search Found: "
                    + treeResult);
            System.out.println("TreeSet Search Time: "
                    + treeTime + " ns");
        }
    }
}
