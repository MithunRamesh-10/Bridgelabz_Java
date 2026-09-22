package javaControlFlow.Level2;

import java.util.Scanner;

public class FactorsOfNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        System.out.println("Factors of " + number + " are:");

        for (int i = 1; i < number; i++) {

            if (number % i == 0) {
                System.out.println(i);
            }
        }

        input.close();
    }
}
