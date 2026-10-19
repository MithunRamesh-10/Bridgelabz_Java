package javaSortingAlgorithms;

/**
 * Problem 5 (Selection Sort - Sort Exam Scores)
 * A university needs to sort students' exam scores
 * in ascending order.
 * Implement Selection Sort to achieve this.
 *
 * Author : Mithun
 * Date : 08-10-2026
 */

public class SelectionSortExamScores {

    public static void selectionSort(int[] scores) {

        // Move through each unsorted position
        for (int i = 0; i < scores.length - 1; i++) {

            int minimumIndex = i;

            // Find the minimum element
            for (int j = i + 1; j < scores.length; j++) {

                if (scores[j] < scores[minimumIndex]) {
                    minimumIndex = j;
                }
            }

            // Swap minimum with first unsorted element
            int temp = scores[i];
            scores[i] = scores[minimumIndex];
            scores[minimumIndex] = temp;
        }
    }

    public static void main(String[] args) {

        int[] scores = {78, 92, 65, 88, 71};

        System.out.print("Original Exam Scores: ");

        for (int score : scores) {
            System.out.print(score + " ");
        }

        selectionSort(scores);

        System.out.println();

        System.out.print("Sorted Exam Scores: ");

        for (int score : scores) {
            System.out.print(score + " ");
        }
    }
}