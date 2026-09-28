package javaProgrammingElements.level1;

/**
 * Problem 5 (GCR — Java Programming Elements Assignment)
 * Suppose you have to divide 14 pens among 3 students equally.
 * Write a program to find how many pens each student will get.
 * Also, find the remaining non-distributed pens.
 *
 * Hint =>
 * Use Modulus Operator (%) to find the remainder.
 * Use Division Operator to find the quantity of pens.
 *
 * Author : Mithun
 * Date : 19-09-2026
 */
public class DividePens {
    public static void main(String[] args) {

        // Store the total number of pens
        int pens = 14;

        // Store the number of students
        int students = 3;

        // Calculate pens received by each student
        int pensPerStudent = pens / students;

        // Calculate the remaining pens
        int remainingPens = pens % students;

        // Display the distribution and remaining pens
        System.out.println("The Pen Per Student is " +
                pensPerStudent +
                " and the remaining pen not distributed is " +
                remainingPens);
    }
}
