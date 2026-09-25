package javaMethods.Level1;

import java.util.Scanner;

public class RandomNumberAnalysis {

    public static int[] generate4DigitRandomArray(int size) {

        int[] numbers = new int[size];

        for (int i = 0; i < size; i++) {

            numbers[i] = (int) (Math.random() * 9000) + 1000;
        }

        return numbers;
    }

    public static double[] findAverageMinMax(int[] numbers) {

        int sum = 0;

        int minimum = numbers[0];
        int maximum = numbers[0];

        for (int number : numbers) {

            sum += number;

            minimum = Math.min(minimum, number);
            maximum = Math.max(maximum, number);
        }

        double average = (double) sum / numbers.length;

        return new double[]{
                average,
                minimum,
                maximum
        };
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of random values to generate: ");
        int size = sc.nextInt();

        int[] numbers = generate4DigitRandomArray(size);

        System.out.println("\nGenerated 4-digit numbers:");

        for (int number : numbers) {
            System.out.print(number + " ");
        }

        double[] result = findAverageMinMax(numbers);

        System.out.println("\n\nAverage: " + result[0]);
        System.out.println("Minimum: " + (int) result[1]);
        System.out.println("Maximum: " + (int) result[2]);

        sc.close();
    }
}