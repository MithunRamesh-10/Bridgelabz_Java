package javaProgrammingElements.level2;

import java.util.Scanner;

/**
 * Problem 5 (GCR — Java Programming Elements Assignment)
 * Write a TemperatureConversion program that takes temperature
 * in Fahrenheit as input and outputs the temperature in Celsius.
 *
 * Author : Mithun
 * Date : 19-09-2026
 */
public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take Fahrenheit temperature from the user
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = input.nextDouble();

        // Convert Fahrenheit to Celsius
        double celsiusResult = (fahrenheit - 32) * 5 / 9;

        // Display the converted temperature
        System.out.println("The " + fahrenheit +
                " fahrenheit is " + celsiusResult + " celsius");

        input.close();
    }
}
