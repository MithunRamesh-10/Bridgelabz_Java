package javaProgrammingElements.level1;

/**
 * Problem 6 (GCR — Java Programming Elements Assignment)
 * Calculate the discount amount and final fee when the fee is INR 125000
 * and discount is 10%.
 *
 * Author : Mithun
 * Date : 19-09-2026
 */
public class UniversityFee {
    public static void main(String[] args) {

        // Store the university fee
        double fee = 125000;

        // Store the discount percentage
        double discountPercent = 10;

        // Calculate the discount amount
        double discount = fee * discountPercent / 100;

        // Calculate the final fee after discount
        double finalFee = fee - discount;

        // Display the discount and final fee
        System.out.println("The discount amount is INR " + discount +
                " and final discounted fee is INR " + finalFee);
    }
}
