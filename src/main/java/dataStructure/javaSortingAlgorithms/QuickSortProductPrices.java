package javaSortingAlgorithms;

/**
 * Problem 4 (Quick Sort - Sort Product Prices)
 * An e-commerce company wants to display product prices
 * in ascending order.
 * Implement Quick Sort to sort the product prices.
 *
 * Author : Mithun
 * Date : 08-10-2026
 */

public class QuickSortProductPrices {

    public static void quickSort(int[] prices, int low, int high) {

        // Continue while the array has more than one element
        if (low < high) {

            // Partition the array
            int pivotIndex = partition(prices, low, high);

            // Sort the left partition
            quickSort(prices, low, pivotIndex - 1);

            // Sort the right partition
            quickSort(prices, pivotIndex + 1, high);
        }
    }

    public static int partition(int[] prices, int low, int high) {

        // Choose the last element as pivot
        int pivot = prices[high];

        int i = low - 1;

        // Place smaller elements before the pivot
        for (int j = low; j < high; j++) {

            if (prices[j] <= pivot) {

                i++;

                int temp = prices[i];
                prices[i] = prices[j];
                prices[j] = temp;
            }
        }

        // Place pivot in its correct position
        int temp = prices[i + 1];
        prices[i + 1] = prices[high];
        prices[high] = temp;

        return i + 1;
    }

    public static void main(String[] args) {

        int[] prices = {450, 120, 750, 300, 200};

        System.out.print("Original Product Prices: ");

        for (int price : prices) {
            System.out.print(price + " ");
        }

        quickSort(prices, 0, prices.length - 1);

        System.out.println();

        System.out.print("Sorted Product Prices: ");

        for (int price : prices) {
            System.out.print(price + " ");
        }
    }
}