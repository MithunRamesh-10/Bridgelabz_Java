package javaMethods.level2;

/**
 * Problem 12 (GCR — Java Methods Level 2 Assignment)
 * Generate five 4-digit random numbers and find their
 * average, minimum, and maximum values.
 *
 * Author : Mithun
 * Date : 23-09-2026
 */
public class RandomNumberStatistics {

    // Method to generate an array of 4-digit random numbers
    public int[] generate4DigitRandomArray(int size) {
        int[] numbers = new int[size];

        for (int i = 0; i < size; i++) {
            // Generate a 4-digit number from 1000 to 9999
            numbers[i] = (int) (Math.random() * 9000) + 1000;
        }

        return numbers;
    }

    // Method to find average, minimum and maximum
    public double[] findAverageMinMax(int[] numbers) {

        int sum = 0;
        int minimum = numbers[0];
        int maximum = numbers[0];

        for (int number : numbers) {
            // Calculate sum
            sum += number;

            // Find minimum
            minimum = (int) Math.min(minimum, number);

            // Find maximum
            maximum = (int) Math.max(maximum, number);
        }

        // Calculate average
        double average = (double) sum / numbers.length;

        return new double[]{average, minimum, maximum};
    }

    public static void main(String[] args) {

        // Create object to call non-static methods
        RandomNumberStatistics calculator =
                new RandomNumberStatistics();

        // Generate five random numbers
        int[] numbers = calculator.generate4DigitRandomArray(5);

        // Display numbers
        System.out.print("Random numbers: ");

        for (int number : numbers) {
            System.out.print(number + " ");
        }

        // Find statistics
        double[] result = calculator.findAverageMinMax(numbers);

        // Display results
        System.out.println("\nAverage: " + result[0]);
        System.out.println("Minimum: " + result[1]);
        System.out.println("Maximum: " + result[2]);
    }
}
