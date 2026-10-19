package javaSortingAlgorithms;

/**
 * Problem 1 (Bubble Sort - Sort Student Marks)
 * A school maintains student marks in an array.
 * Implement Bubble Sort to sort the student marks in ascending order.
 *
 * Author : Mithun
 * Date : 08-10-2026
 */

public class BubbleSortStudentMarks {

    public static void bubbleSort(int[] marks) {

        // Traverse the array multiple times
        for (int i = 0; i < marks.length - 1; i++) {

            boolean swapped = false;

            // Compare adjacent elements
            for (int j = 0; j < marks.length - 1 - i; j++) {

                // Swap if elements are in the wrong order
                if (marks[j] > marks[j + 1]) {

                    int temp = marks[j];
                    marks[j] = marks[j + 1];
                    marks[j + 1] = temp;

                    swapped = true;
                }
            }

            // Stop if no swapping is required
            if (!swapped) {
                break;
            }
        }
    }

    public static void main(String[] args) {

        int[] marks = {85, 62, 91, 45, 73};

        System.out.print("Original Marks: ");

        for (int mark : marks) {
            System.out.print(mark + " ");
        }

        bubbleSort(marks);

        System.out.println();

        System.out.print("Sorted Marks: ");

        for (int mark : marks) {
            System.out.print(mark + " ");
        }
    }
}