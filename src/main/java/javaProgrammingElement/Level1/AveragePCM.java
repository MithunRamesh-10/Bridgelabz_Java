package javaProgrammingElements.level1;

/**
 * Problem 2 (GCR — Java Programming Elements Assignment)
 * Sam's mark in Maths is 94, Physics is 95 and Chemistry is 96 out of 100.
 * Find the average percent mark in PCM.
 *
 * Author : Mithun
 * Date : 19-09-2026
 */
public class AverageMarks {
    public static void main(String[] args) {

        // Store marks in Mathematics
        int maths = 94;

        // Store marks in Physics
        int physics = 95;

        // Store marks in Chemistry
        int chemistry = 96;

        // Calculate the average marks
        double average = (maths + physics + chemistry) / 3.0;

        // Display the average marks
        System.out.println("Sam's average mark in PCM is " + average);
    }
}
