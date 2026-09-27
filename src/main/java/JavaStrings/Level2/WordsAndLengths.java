import java.util.Scanner;

public class WordsAndLengths {

    static String[] splitWords(String text) {

        int wordCount = 1;

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        String[] words = new String[wordCount];

        int wordIndex = 0;
        String word = "";

        for (int i = 0; i < text.length(); i++) {

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

    static String[][] getWordLengths(String[] words) {

        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {

            result[i][0] = words[i];
            result[i][1] = String.valueOf(findLength(words[i]));
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String text = sc.nextLine();

        String[] words = splitWords(text);
        String[][] result = getWordLengths(words);

        System.out.println("\nWord\tLength");

        for (int i = 0; i < result.length; i++) {

            int length = Integer.parseInt(result[i][1]);

            System.out.println(result[i][0] + "\t" + length);
        }

        sc.close();
    }
}
