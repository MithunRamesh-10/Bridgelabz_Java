import java.util.Scanner;

public class CompareSubstringUsingCharAt {

    public static String createSubstring(String text, int start, int end) {

        String result = "";

        for (int i = start; i < end; i++) {
            result = result + text.charAt(i);
        }

        return result;
    }

    public static boolean compareStrings(String str1, String str2) {

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

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = scanner.next();

        System.out.print("Enter start index: ");
        int start = scanner.nextInt();

        System.out.print("Enter end index: ");
        int end = scanner.nextInt();

        String userDefinedSubstring =
                createSubstring(text, start, end);

        String builtInSubstring =
                text.substring(start, end);

        boolean result =
                compareStrings(userDefinedSubstring, builtInSubstring);

        System.out.println("User-defined substring: "
                + userDefinedSubstring);

        System.out.println("Built-in substring: "
                + builtInSubstring);

        System.out.println("Both substrings are same: " + result);

        scanner.close();
    }
}