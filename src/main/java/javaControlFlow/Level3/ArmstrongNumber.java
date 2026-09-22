package javaControlFlow.Level3;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int originalNumber = number;
        int sum = 0;

        while (number != 0) {

            int digit = number % 10;
            int cube = digit * digit * digit;

            sum = sum + cube;

            number = number / 10;
        }

        if (originalNumber == sum) {
            System.out.println(originalNumber + " is an Armstrong Number");
        } else {
            System.out.println(originalNumber + " is not an Armstrong Number");
        }

        input.close();
    }
}