import java.util.Scanner;

public class TrimStringUsingCharAt {

    static int[] findTrimIndexes(String text) {

        int start = 0;
        int end = text.length() - 1;

        while (start <= end && text.charAt(start) == ' ') {
            start++;
        }

        while (end >= start && text.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end};
    }

    static String createSubstring(String text, int start, int end) {

        String result = "";

        for (int i = start; i <= end; i++) {
            result = result + text.charAt(i);
        }

        return result;
    }

    static boolean compareStrings(String str1, String str2) {

        if (str1.length() != str2.length()) {
            return false;
        }

        for (int i = 0; i < str1.length(); i++) {

            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        int[] indexes = findTrimIndexes(text);

        String userDefined =
                createSubstring(text, indexes[0], indexes[1]);

        String builtIn = text.trim();

        System.out.println("Using charAt(): [" + userDefined + "]");
        System.out.println("Using trim(): [" + builtIn + "]");

        System.out.println("Both results are same: "
                + compareStrings(userDefined, builtIn));

        sc.close();
    }
}
