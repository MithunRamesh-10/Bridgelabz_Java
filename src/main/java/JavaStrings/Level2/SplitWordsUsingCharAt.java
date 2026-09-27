import java.util.Scanner;

public class SplitWordsUsingCharAt {

    static int findLength(String text) {

        int count = 0;

        while (true) {
            try {
                text.charAt(count);
                count++;
            } catch (StringIndexOutOfBoundsException e) {
                break;
            }
        }

        return count;
    }

    static String[] splitWords(String text) {

        int length = findLength(text);
        int wordCount = 1;

        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        String[] words = new String[wordCount];

        int wordIndex = 0;
        String word = "";

        for (int i = 0; i < length; i++) {

            char ch = text.charAt(i);

            if (ch == ' ') {
                words[wordIndex] = word;
                wordIndex++;
                word = "";
            } else {
                word = word + ch;
            }
        }

        words[wordIndex] = word;

        return words;
    }

    static boolean compareArrays(String[] arr1, String[] arr2) {

        if (arr1.length != arr2.length) {
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {

            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String text = sc.nextLine();

        String[] userDefined = splitWords(text);
        String[] builtIn = text.split(" ");

        System.out.println("\nWords:");

        for (String word : userDefined) {
            System.out.println(word);
        }

        System.out.println("\nBoth results are same: "
                + compareArrays(userDefined, builtIn));

        sc.close();
    }
}