package javaProgrammingElements.level1;

/**
 * Problem 4 (GCR — Java Programming Elements Assignment)
 * Create a program to calculate the profit and loss in number and percentage
 * based on the cost price of INR 129 and the selling price of INR 191.
 *
 * Hint =>
 * Profit = Selling Price - Cost Price
 * Profit Percentage = Profit / Cost Price * 100
 *
 * Author : Mithun
 * Date : 19-09-2026
 */
public class ProfitLoss {
    public static void main(String[] args) {

        // Store the cost price
        double costPrice = 129;

        // Store the selling price
        double sellingPrice = 191;

        // Calculate the profit
        double profit = sellingPrice - costPrice;

        // Calculate the profit percentage
        double profitPercentage = (profit / costPrice) * 100;

        // Display cost price and selling price
        System.out.println("The Cost Price is INR " + costPrice +
                " and Selling Price is INR " + sellingPrice);

        // Display profit and profit percentage
        System.out.println("The Profit is INR " + profit +
                " and the Profit Percentage is " + profitPercentage);
    }
}
