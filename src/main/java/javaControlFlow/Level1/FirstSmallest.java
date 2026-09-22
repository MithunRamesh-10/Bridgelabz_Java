package javaControlFlow.Level1;

import java.util.Scanner;

public class FirstSmallest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number 1: ");
        int number1 = input.nextInt();

        System.out.print("Enter number 2: ");
        int number2 = input.nextInt();

        System.out.print("Enter number 3: ");
        int number3 = input.nextInt();

        boolean result = number1 <= number2 && number1 <= number3;

        System.out.println("Is the first number the smallest? " + result);

        input.close();
    }
}
