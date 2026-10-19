package javaSortingAlgorithms;

/**
 * Problem 7 (Counting Sort - Sort Student Ages)
 * A school collects students' ages ranging from 10 to 18
 * and wants them sorted.
 * Implement Counting Sort for this task.
 *
 * Author : Mithun
 * Date : 08-10-2026
 */

public class CountingSortStudentAges {

    public static void countingSort(int[] ages) {

        int minimum = 10;
        int maximum = 18;

        // Create count array for ages 10 to 18
        int[] count = new int[maximum - minimum + 1];

        // Store frequency of each age
        for (int age : ages) {
            count[age - minimum]++;
        }

        // Compute cumulative frequencies
        for (int i = 1; i < count.length; i++) {
            count[i] = count[i] + count[i - 1];
        }

        int[] output = new int[ages.length];

        // Place elements in their correct positions
        for (int i = ages.length - 1; i >= 0; i--) {

            int age = ages[i];

            output[count[age - minimum] - 1] = age;

            count[age - minimum]--;
        }

        // Copy sorted values back
        for (int i = 0; i < ages.length; i++) {
            ages[i] = output[i];
        }
    }

    public static void main(String[] args) {

        int[] ages = {15, 12, 18, 10, 14, 12, 16, 11, 15};

        System.out.print("Original Ages: ");

        for (int age : ages) {
            System.out.print(age + " ");
        }

        countingSort(ages);

        System.out.println();

        System.out.print("Sorted Ages: ");

        for (int age : ages) {
            System.out.print(age + " ");
        }
    }
}