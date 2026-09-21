package javaProgrammingElement.Level1;

import java.util.Scanner;

public class TotalPurchasePrice {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the price of item 1: ");
        double item1 = input.nextDouble();

        System.out.print("Enter the price of item 2: ");
        double item2 = input.nextDouble();

        System.out.print("Enter the price of item 3: ");
        double item3 = input.nextDouble();

        double totalPrice = item1 + item2 + item3;

        System.out.println("The total purchase price is INR " + totalPrice);

        input.close();
    }
}