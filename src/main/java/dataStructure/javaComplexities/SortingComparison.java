package javaComplexities;

import java.util.Arrays;
import java.util.Random;

/**
 * Problem 2 (Runtime Analysis - Sorting Algorithms)
 * Compare Bubble Sort, Merge Sort and Quick Sort
 * for different dataset sizes.
 *
 * Author : Mithun
 * Date : 12-10-2026
 */

public class SortingComparison {

    // Bubble Sort: O(N^2) average/worst time, O(1) space
    public static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            boolean swapped = false;

            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }

            if (!swapped) {
                break;
            }
        }
    }

    // Merge Sort: O(N log N) time, O(N) auxiliary space
    public static void mergeSort(int[] array, int left, int right) {
        if (left >= right) {
            return;
        }

        int mid = left + (right - left) / 2;
        mergeSort(array, left, mid);
        mergeSort(array, mid + 1, right);
        merge(array, left, mid, right);
    }

    private static void merge(int[] array, int left, int mid, int right) {
        int[] temp = new int[right - left + 1];
        int i = left, j = mid + 1, k = 0;

        while (i <= mid && j <= right) {
            if (array[i] <= array[j]) {
                temp[k++] = array[i++];
            } else {
                temp[k++] = array[j++];
            }
        }

        while (i <= mid) {
            temp[k++] = array[i++];
        }

        while (j <= right) {
            temp[k++] = array[j++];
        }

        for (i = 0; i < temp.length; i++) {
            array[left + i] = temp[i];
        }
    }

    // Quick Sort: O(N log N) average, O(N^2) worst time
    public static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(array, low, high);
            quickSort(array, low, pivotIndex - 1);
            quickSort(array, pivotIndex + 1, high);
        }
    }

    private static int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (array[j] <= pivot) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        return i + 1;
    }

    public static void main(String[] args) {
        int[] sizes = {1000, 5000, 10000};
        Random random = new Random(42);

        System.out.println("Sorting Algorithm Runtime Comparison");

        for (int size : sizes) {
            int[] original = new int[size];

            for (int i = 0; i < size; i++) {
                original[i] = random.nextInt(100000);
            }

            int[] bubble = original.clone();
            int[] merge = original.clone();
            int[] quick = original.clone();

            long start = System.nanoTime();
            bubbleSort(bubble);
            long bubbleTime = System.nanoTime() - start;

            start = System.nanoTime();
            mergeSort(merge, 0, merge.length - 1);
            long mergeTime = System.nanoTime() - start;

            start = System.nanoTime();
            quickSort(quick, 0, quick.length - 1);
            long quickTime = System.nanoTime() - start;

            System.out.println("\nDataset Size: " + size);
            System.out.println("Bubble Sort Time: " + bubbleTime + " ns");
            System.out.println("Merge Sort Time: " + mergeTime + " ns");
            System.out.println("Quick Sort Time: " + quickTime + " ns");

            System.out.println("All Sorted Correctly: "
                    + (isSorted(bubble) && isSorted(merge)
                    && isSorted(quick)));
        }
    }

    // Verify that an array is sorted
    private static boolean isSorted(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i - 1] > array[i]) {
                return false;
            }
        }
        return true;
    }
}