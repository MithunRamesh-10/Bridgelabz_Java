package javaControlFlow.Level1;

import java.util.Scanner;

public class NaturalNumberSumWhile {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int number = input.nextInt();

        if (number > 0) {

            int sumUsingWhile = 0;
            int i = 1;

            while (i <= number) {
                sumUsingWhile += i;
                i++;
            }

            int sumUsingFormula = number * (number + 1) / 2;

            System.out.println("Sum using while loop: " + sumUsingWhile);
            System.out.println("Sum using formula: " + sumUsingFormula);

            if (sumUsingWhile == sumUsingFormula) {
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
