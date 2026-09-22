package javaControlFlow.Level1;

import java.util.Scanner;

public class NaturalNumberSumFor {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int number = input.nextInt();

        if (number > 0) {

            int sumUsingFor = 0;

            for (int i = 1; i <= number; i++) {
                sumUsingFor += i;
            }

            int sumUsingFormula = number * (number + 1) / 2;

            System.out.println("Sum using for loop: " + sumUsingFor);
            System.out.println("Sum using formula: " + sumUsingFormula);

            if (sumUsingFor == sumUsingFormula) {
                System.out.println("Both results are correct.");
            } else {
                System.out.println("Both results are not equal.");
            }

        } else {
            System.out.println("The number is not a natural number.");
        }

        input.close();
    }
}
