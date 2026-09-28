package javaProgrammingElements.level2;

import java.util.Scanner;

/**
 * Problem 11 (GCR — Java Programming Elements Assignment)
 * Write a program to input the Principal, Rate, and Time values
 * and calculate Simple Interest.
 *
 * Author : Mithun
 * Date : 19-09-2026
 */
public class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take the principal amount
        System.out.print("Enter principal: ");
        double principal = input.nextDouble();

        // Take the rate of interest
        System.out.print("Enter rate of interest: ");
        double rate = input.nextDouble();

        // Take the time
        System.out.print("Enter time: ");
        double time = input.nextDouble();

        // Calculate simple interest
        double simpleInterest = (principal * rate * time) / 100;

        // Display the result
        System.out.println("The Simple Interest is " + simpleInterest +
                " for Principal " + principal +
                ", Rate of Interest " + rate + " and Time " + time);

        input.close();
    }
}
