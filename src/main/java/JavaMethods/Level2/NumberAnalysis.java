package javaMethods.Level1;

import java.util.Scanner;

public class NumberAnalysis {

    public static boolean isPositive(int number) {
        return number >= 0;
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static int compare(int number1, int number2) {
        if (number1 > number2) {
            return 1;
        } else if (number1 == number2) {
            return 0;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        System.out.println("\nNumber Analysis:");

        for (int number : numbers) {

            if (number < 0) {
                System.out.println(number + " is Negative");
            } else {
                System.out.print(number + " is Positive");

                if (isEven(number)) {
                    System.out.println(" and Even");
                } else {
                    System.out.println(" and Odd");
                }
            }
        }

        int comparison = compare(numbers[0], numbers[4]);

        if (comparison == 1) {
            System.out.println("\nFirst element is greater than last element.");
        } else if (comparison == 0) {
            System.out.println("\nFirst element is equal to last element.");
        } else {
            System.out.println("\nFirst element is less than last element.");
        }

        sc.close();
    }
}
