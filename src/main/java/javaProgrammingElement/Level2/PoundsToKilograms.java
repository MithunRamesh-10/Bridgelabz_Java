package javaProgrammingElement.Level2;

import java.util.Scanner;

public class PoundsToKilograms {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter weight in pounds: ");
        double weight = input.nextDouble();

        double weightInKg = weight * 0.453592;

        System.out.println("The weight of the person in pound is " +
                weight + " and in kg is " + weightInKg);

        input.close();
    }
}
