import java.util.Scanner;

public class ConvertToUpperCase {

    static String convertToUpperCase(String text) {

        String result = "";

        for (int i = 0; i < text.length(); i++) {

            char ch = text.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                ch = (char) (ch - 32);
            }

            result = result + ch;
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

        String userDefined = convertToUpperCase(text);
        String builtIn = text.toUpperCase();

        System.out.println("Using charAt(): " + userDefined);
        System.out.println("Using toUpperCase(): " + builtIn);

        System.out.println("Both results are same: "
                + compareStrings(userDefined, builtIn));

        sc.close();
    }
}
