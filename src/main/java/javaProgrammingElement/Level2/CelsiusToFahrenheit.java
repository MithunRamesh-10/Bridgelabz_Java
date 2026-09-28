package javaProgrammingElements.level2;

import java.util.Scanner;

/**
 * Problem 4 (GCR — Java Programming Elements Assignment)
 * Write a TemperatureConversion program that takes temperature
 * in Celsius as input and outputs the temperature in Fahrenheit.
 *
 * Author : Mithun
 * Date : 19-09-2026
 */
public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take Celsius temperature from the user
        System.out.print("Enter temperature in Celsius: ");
        double celsius = input.nextDouble();

        // Convert Celsius to Fahrenheit
        double fahrenheitResult = (celsius * 9 / 5) + 32;

        // Display the converted temperature
        System.out.println("The " + celsius +
                " celsius is " + fahrenheitResult + " fahrenheit");

        input.close();
    }
}
