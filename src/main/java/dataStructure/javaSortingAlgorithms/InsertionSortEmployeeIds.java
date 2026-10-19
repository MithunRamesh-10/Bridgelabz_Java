package javaSortingAlgorithms;

/**
 * Problem 2 (Insertion Sort - Sort Employee IDs)
 * A company stores employee IDs in an unsorted array.
 * Implement Insertion Sort to sort the employee IDs in ascending order.
 *
 * Author : Mithun
 * Date : 08-10-2026
 */

public class InsertionSortEmployeeIds {

    public static void insertionSort(int[] employeeIds) {

        // Start from the second element
        for (int i = 1; i < employeeIds.length; i++) {

            int current = employeeIds[i];
            int j = i - 1;

            // Shift larger elements to the right
            while (j >= 0 && employeeIds[j] > current) {
                employeeIds[j + 1] = employeeIds[j];
                j--;
            }

            // Insert current element at correct position
            employeeIds[j + 1] = current;
        }
    }

    public static void main(String[] args) {

        int[] employeeIds = {105, 102, 109, 101, 107};

        System.out.print("Original Employee IDs: ");

        for (int id : employeeIds) {
            System.out.print(id + " ");
        }

        insertionSort(employeeIds);

        System.out.println();

        System.out.print("Sorted Employee IDs: ");

        for (int id : employeeIds) {
            System.out.print(id + " ");
        }
    }
}