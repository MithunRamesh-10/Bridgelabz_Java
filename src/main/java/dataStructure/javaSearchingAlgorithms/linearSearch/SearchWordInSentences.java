package javaSearchingAlgorithms.linearSearch;

/**
 * Problem 2 (Linear Search - Search Word in Sentences)
 * Find the first sentence containing a specific word.
 * Return the sentence if found, otherwise return "Not Found".
 *
 * Author : Mithun
 * Date : 09-10-2026
 */

public class SearchWordInSentences {

    public static String searchSentence(String[] sentences, String target) {

        // Traverse each sentence
        for (String sentence : sentences) {

            // Check whether the sentence contains the target word
            String[] words = sentence.split("\\W+");

            for (String word : words) {
                if (word.equalsIgnoreCase(target)) {
                    return sentence;
                }
            }
        }

        // Return when no sentence contains the word
        return "Not Found";
    }

    public static void main(String[] args) {

        String[] sentences = {
                "Java is an object oriented language",
                "Python is used in machine learning",
                "I am learning Java programming"
        };

        String target = "Java";

        System.out.println("Search Word: " + target);
        System.out.println("Result: " + searchSentence(sentences, target));
    }
}