import java.util.Scanner;

public class UniqueCharacters {

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

    static char[] findUniqueCharacters(String text) {

        int length = findLength(text);

        char[] temp = new char[length];

        int uniqueCount = 0;

        for (int i = 0; i < length; i++) {

            boolean isUnique = true;

            for (int j = 0; j < i; j++) {

                if (text.charAt(i) == text.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                temp[uniqueCount] = text.charAt(i);
                uniqueCount++;
            }
        }

        char[] result = new char[uniqueCount];

        for (int i = 0; i < uniqueCount; i++) {
            result[i] = temp[i];
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        char[] result = findUniqueCharacters(text);

        System.out.print("Unique characters: ");

        for (char ch : result) {
            System.out.print(ch + " ");
        }

        sc.close();
    }
}