package javaSortingAlgorithms;

/**
 * Problem 3 (Merge Sort - Sort an Array of Book Prices)
 * A bookstore maintains a list of book prices in an array.
 * Implement Merge Sort to sort the prices in ascending order.
 *
 * Author : Mithun
 * Date : 08-10-2026
 */

public class MergeSortBookPrices {

    public static void mergeSort(int[] prices, int left, int right) {

        // Continue while more than one element exists
        if (left < right) {

            int middle = (left + right) / 2;

            // Sort the left half
            mergeSort(prices, left, middle);

            // Sort the right half
            mergeSort(prices, middle + 1, right);

            // Merge both sorted halves
            merge(prices, left, middle, right);
        }
    }

    public static void merge(int[] prices, int left, int middle, int right) {

        int leftSize = middle - left + 1;
        int rightSize = right - middle;

        int[] leftArray = new int[leftSize];
        int[] rightArray = new int[rightSize];

        // Copy elements into left array
        for (int i = 0; i < leftSize; i++) {
            leftArray[i] = prices[left + i];
        }

        // Copy elements into right array
        for (int i = 0; i < rightSize; i++) {
            rightArray[i] = prices[middle + 1 + i];
        }

        int i = 0;
        int j = 0;
        int k = left;

        // Compare elements from both halves
        while (i < leftSize && j < rightSize) {

            if (leftArray[i] <= rightArray[j]) {
                prices[k] = leftArray[i];
                i++;
            } else {
                prices[k] = rightArray[j];
                j++;
            }

            k++;
        }

        // Copy remaining left elements
        while (i < leftSize) {
            prices[k] = leftArray[i];
            i++;
            k++;
        }

        // Copy remaining right elements
        while (j < rightSize) {
            prices[k] = rightArray[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {

        int[] prices = {450, 120, 750, 300, 200};

        System.out.print("Original Book Prices: ");

        for (int price : prices) {
            System.out.print(price + " ");
        }

        mergeSort(prices, 0, prices.length - 1);

        System.out.println();

        System.out.print("Sorted Book Prices: ");

        for (int price : prices) {
            System.out.print(price + " ");
        }
    }
}