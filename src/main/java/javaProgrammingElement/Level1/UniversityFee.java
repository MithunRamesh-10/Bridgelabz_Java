package javaProgrammingElements.level1;

import java.util.Scanner;

/**
 * Problem 9 (GCR — Java Programming Elements Assignment)
 * Take the fee and discount percentage as user input and calculate
 * the discount and final fee.
 *
 * Author : Mithun
 * Date : 19-09-2026
 */
public class StudentFeeDiscount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take the fee from the user
        System.out.print("Enter fee: ");
        double fee = input.nextDouble();

        // Take the discount percentage from the user
        System.out.print("Enter discount percentage: ");
        double discountPercent = input.nextDouble();

        // Calculate the discount amount
        double discount = fee * discountPercent / 100;

        // Calculate the final fee
        double finalFee = fee - discount;

        // Display the discount and final fee
        System.out.println("The discount amount is INR " + discount +
                " and final discounted fee is INR " + finalFee);

        input.close();
    }
}
