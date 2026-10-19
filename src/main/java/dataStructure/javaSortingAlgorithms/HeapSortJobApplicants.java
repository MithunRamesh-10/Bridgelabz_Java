package javaSortingAlgorithms;

/**
 * Problem 6 (Heap Sort - Sort Job Applicants by Salary)
 * A company receives job applications with different expected
 * salary demands.
 * Implement Heap Sort to sort these salary demands in ascending order.
 *
 * Author : Mithun
 * Date : 08-10-2026
 */

public class HeapSortJobApplicants {

    public static void heapSort(int[] salaries) {

        int n = salaries.length;

        // Build Max Heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(salaries, n, i);
        }

        // Extract maximum element one by one
        for (int i = n - 1; i > 0; i--) {

            // Move largest element to the end
            int temp = salaries[0];
            salaries[0] = salaries[i];
            salaries[i] = temp;

            // Restore Max Heap
            heapify(salaries, i, 0);
        }
    }

    public static void heapify(int[] salaries, int n, int root) {

        int largest = root;

        int left = 2 * root + 1;
        int right = 2 * root + 2;

        // Check left child
        if (left < n && salaries[left] > salaries[largest]) {
            largest = left;
        }

        // Check right child
        if (right < n && salaries[right] > salaries[largest]) {
            largest = right;
        }

        // If largest is not root, swap and continue heapifying
        if (largest != root) {

            int temp = salaries[root];
            salaries[root] = salaries[largest];
            salaries[largest] = temp;

            heapify(salaries, n, largest);
        }
    }

    public static void main(String[] args) {

        int[] salaries = {60000, 45000, 80000, 55000, 70000};

        System.out.print("Original Salary Demands: ");

        for (int salary : salaries) {
            System.out.print(salary + " ");
        }

        heapSort(salaries);

        System.out.println();

        System.out.print("Sorted Salary Demands: ");

        for (int salary : salaries) {
            System.out.print(salary + " ");
        }
    }
}