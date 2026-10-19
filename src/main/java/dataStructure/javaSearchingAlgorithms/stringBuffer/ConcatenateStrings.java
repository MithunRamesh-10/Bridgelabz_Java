package javaSearchingAlgorithms.stringBuffer;

/**
 * Problem 1 (Concatenate Strings Using StringBuffer)
 * Given an array of strings, concatenate all strings efficiently
 * using StringBuffer.
 *
 * Author : Mithun
 * Date : 09-10-2026
 */

public class ConcatenateStrings {

    public static String concatenate(String[] words) {

        StringBuffer result = new StringBuffer();

        // Append every string to the buffer
        for (String word : words) {
            result.append(word);
        }

        return result.toString();
    }

    public static void main(String[] args) {

        String[] words = {"Hello", " ", "Hemang", "!"};

        System.out.println("Concatenated String: "
                + concatenate(words));
    }
}