import java.util.Scanner;

public class CharacterFrequency {

    static String[][] findFrequency(String text) {

        int[] frequency = new int[256];

        for (int i = 0; i < text.length(); i++) {

            char ch = text.charAt(i);

            frequency[ch]++;
        }

        int count = 0;

        for (int i = 0; i < 256; i++) {

            if (frequency[i] > 0) {
                count++;
            }
        }

        String[][] result = new String[count][2];

        int index = 0;

        for (int i = 0; i < 256; i++) {

            if (frequency[i] > 0) {

                result[index][0] = String.valueOf((char) i);
                result[index][1] = String.valueOf(frequency[i]);

                index++;
            }
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[][] result = findFrequency(text);

        System.out.println("\nCharacter\tFrequency");

        for (int i = 0; i < result.length; i++) {

            System.out.println(
                    result[i][0] + "\t\t" + result[i][1]
            );
        }

        sc.close();
    }
}
