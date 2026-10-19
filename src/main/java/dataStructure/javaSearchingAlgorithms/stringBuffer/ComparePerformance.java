package javaSearchingAlgorithms.stringBuffer;

/**
 * Problem 2 (Compare StringBuffer with StringBuilder)
 * Compare the execution time of StringBuffer and StringBuilder
 * while concatenating one million strings.
 *
 * Author : Mithun
 * Date : 09-10-2026
 */

public class ComparePerformance {

    public static void main(String[] args) {

        int repetitions = 1_000_000;

        // Measure StringBuilder execution time
        StringBuilder builder = new StringBuilder();

        long builderStart = System.nanoTime();

        for (int i = 0; i < repetitions; i++) {
            builder.append("hello");
        }

        long builderEnd = System.nanoTime();

        // Measure StringBuffer execution time
        StringBuffer buffer = new StringBuffer();

        long bufferStart = System.nanoTime();

        for (int i = 0; i < repetitions; i++) {
            buffer.append("hello");
        }

        long bufferEnd = System.nanoTime();

        // Convert nanoseconds to milliseconds
        double builderTime =
                (builderEnd - builderStart) / 1_000_000.0;

        double bufferTime =
                (bufferEnd - bufferStart) / 1_000_000.0;

        System.out.println("Number of Appends: " + repetitions);
        System.out.printf("StringBuilder Time: %.3f ms%n", builderTime);
        System.out.printf("StringBuffer Time: %.3f ms%n", bufferTime);

        System.out.println("StringBuilder Length: " + builder.length());
        System.out.println("StringBuffer Length: " + buffer.length());
    }
}