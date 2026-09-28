package javaProgrammingElements.level1;

/**
 * Problem 3 (GCR — Java Programming Elements Assignment)
 * Create a program to convert the distance of 10.8 kilometers to miles.
 *
 * Hint =>
 * 1 km = 1.6 miles
 *
 * Author : Mithun
 * Date : 19-09-2026
 */
public class ConvertKmToMiles {
    public static void main(String[] args) {

        // Store the distance in kilometers
        double kilometers = 10.8;

        // Convert kilometers to miles
        double miles = kilometers * 1.6;

        // Display the converted distance
        System.out.println("The distance " + kilometers +
                " km in miles is " + miles);
    }
}
