package javaControlFlow.Level2;

import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number: ");
        int number = input.nextInt();

        System.out.print("Enter power: ");
        int power = input.nextInt();

        int result = 1;

        for (int i = 1; i <= power; i++) {
            result = result * number;
        }

        System.out.println(number + " raised to the power " +
                power + " is " + result);

        input.close();
    }
}
