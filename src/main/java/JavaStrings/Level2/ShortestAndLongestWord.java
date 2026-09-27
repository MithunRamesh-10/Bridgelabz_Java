import java.util.Scanner;

public class ShortestAndLongestWord {

    static String[] splitWords(String text) {

        int wordCount = 1;

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        String[] words = new String[wordCount];

        int index = 0;
        String word = "";

        for (int i = 0; i < text.length(); i++) {

            char ch = text.charAt(i);

            if (ch == ' ') {
                words[index] = word;
                index++;
                word = "";
            } else {
                word = word + ch;
            }
        }

        words[index] = word;

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

    static int[] findShortestAndLongest(String[][] words) {

        int shortest = 0;
        int longest = 0;

        for (int i = 1; i < words.length; i++) {

            int currentLength = Integer.parseInt(words[i][1]);
            int shortestLength = Integer.parseInt(words[shortest][1]);
            int longestLength = Integer.parseInt(words[longest][1]);

            if (currentLength < shortestLength) {
                shortest = i;
            }

            if (currentLength > longestLength) {
                longest = i;
            }
        }

        return new int[]{shortest, longest};
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String text = sc.nextLine();

        String[] words = splitWords(text);
        String[][] wordLengths = getWordLengths(words);

        int[] result = findShortestAndLongest(wordLengths);

        System.out.println("Shortest word: "
                + wordLengths[result[0]][0]);

        System.out.println("Longest word: "
                + wordLengths[result[1]][0]);

        sc.close();
    }
}
