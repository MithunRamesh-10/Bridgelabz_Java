package javaControlFlow.Level1;

import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double total = 0.0;

        System.out.println("Enter numbers. Enter 0 to stop.");

        double number = input.nextDouble();

        while (number != 0) {
            total += number;
            number = input.nextDouble();
        }

        System.out.println("The total sum is " + total);

        input.close();
    }
}
