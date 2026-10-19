package javaComplexities;

/**
 * Problem 3 (Runtime Analysis - String Concatenation)
 * Compare String, StringBuilder and StringBuffer
 * for repeated string concatenation.
 *
 * Author : Mithun
 * Date : 12-10-2026
 */

public class StringComparison {

    // String is immutable; repeated concatenation can take O(N^2) time.
    public static String stringConcat(int count) {
        String result = "";

        for (int i = 0; i < count; i++) {
            result += "a";
        }

        return result;
    }

    // StringBuilder is mutable and generally takes O(N) time
    // for appending N single-character strings.
    public static String builderConcat(int count) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < count; i++) {
            result.append("a");
        }

        return result.toString();
    }

    // StringBuffer is mutable and synchronized.
    public static String bufferConcat(int count) {
        StringBuffer result = new StringBuffer();

        for (int i = 0; i < count; i++) {
            result.append("a");
        }

        return result.toString();
    }

    public static void main(String[] args) {
        int count = 10000;

        System.out.println("String Concatenation Runtime Comparison");
        System.out.println("Number of Operations: " + count);

        long start = System.nanoTime();
        String stringResult = stringConcat(count);
        long stringTime = System.nanoTime() - start;

        start = System.nanoTime();
        String builderResult = builderConcat(count);
        long builderTime = System.nanoTime() - start;

        start = System.nanoTime();
        String bufferResult = bufferConcat(count);
        long bufferTime = System.nanoTime() - start;

        System.out.println("String Length: " + stringResult.length());
        System.out.println("String Time: " + stringTime + " ns");

        System.out.println("StringBuilder Length: "
                + builderResult.length());
        System.out.println("StringBuilder Time: " + builderTime + " ns");

        System.out.println("StringBuffer Length: "
                + bufferResult.length());
        System.out.println("StringBuffer Time: " + bufferTime + " ns");
    }
}