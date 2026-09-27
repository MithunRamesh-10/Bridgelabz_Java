package javaMethods.level3;

/**
 * Problem 1 (GCR — Java Methods Level 3 Assignment)
 * Generate heights of 11 football players and find the
 * sum, mean, shortest, and tallest height.
 *
 * Author : Mithun
 * Date : 23-09-2026
 */
public class FootballPlayerHeights {

    // Method to generate random heights
    public static int[] generateHeights() {
        int[] heights = new int[11];

        for (int i = 0; i < heights.length; i++) {
            // Generate height from 150 to 250 cm
            heights[i] = (int) (Math.random() * 101) + 150;
        }

        return heights;
    }

    // Method to find sum of heights
    public static int findSum(int[] heights) {
        int sum = 0;

        for (int height : heights) {
            sum += height;
        }

        return sum;
    }

    // Method to find mean height
    public static double findMean(int[] heights) {
        int sum = findSum(heights);
        return (double) sum / heights.length;
    }

    // Method to find shortest height
    public static int findShortest(int[] heights) {
        int shortest = heights[0];

        for (int height : heights) {
            if (height < shortest) {
                shortest = height;
            }
        }

        return shortest;
    }

    // Method to find tallest height
    public static int findTallest(int[] heights) {
        int tallest = heights[0];

        for (int height : heights) {
            if (height > tallest) {
                tallest = height;
            }
        }

        return tallest;
    }

    public static void main(String[] args) {

        // Generate heights
        int[] heights = generateHeights();

        // Display heights
        System.out.print("Player heights: ");

        for (int height : heights) {
            System.out.print(height + " ");
        }

        // Calculate results
        int sum = findSum(heights);
        double mean = findMean(heights);
        int shortest = findShortest(heights);
        int tallest = findTallest(heights);

        // Display results
        System.out.println("\nSum: " + sum);
        System.out.println("Mean: " + mean);
        System.out.println("Shortest: " + shortest + " cm");
        System.out.println("Tallest: " + tallest + " cm");
    }
}
