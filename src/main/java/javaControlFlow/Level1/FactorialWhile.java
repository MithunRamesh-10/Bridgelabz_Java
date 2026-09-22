package javaControlFlow.Level1;

import java.util.Scanner;

public class FactorialWhile {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        if (number > 0) {

            long factorial = 1;
            int i = 1;

            while (i <= number) {
                factorial *= i;
                i++;
            }

            System.out.println("The factorial of " + number +
                    " is " + factorial);

        } else {
            System.out.println("The number is not a positive integer.");
        }

        input.close();
    }
}
