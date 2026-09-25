package javaMethods.Level3;

import java.util.Scanner;

public class SpecialNumberChecker {

    public static boolean isPrime(int number) {

        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {

            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static int sumOfDigits(int number) {

        number = Math.abs(number);

        int sum = 0;

        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }

        return sum;
    }

    public static int productOfDigits(int number) {

        number = Math.abs(number);

        if (number == 0) {
            return 0;
        }

        int product = 1;

        while (number > 0) {
            product *= number % 10;
            number /= 10;
        }

        return product;
    }

    public static boolean isNeon(int number) {

        int square = number * number;

        return sumOfDigits(square) == number;
    }

    public static boolean isSpy(int number) {

        return sumOfDigits(number) == productOfDigits(number);
    }

    public static boolean isAutomorphic(int number) {

        int square = number * number;

        return String.valueOf(square)
                .endsWith(String.valueOf(number));
    }

    public static boolean isBuzz(int number) {

        return number % 7 == 0 || number % 10 == 7;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        System.out.println("Prime: " + isPrime(number));
        System.out.println("Neon: " + isNeon(number));
        System.out.println("Spy: " + isSpy(number));
        System.out.println("Automorphic: " + isAutomorphic(number));
        System.out.println("Buzz: " + isBuzz(number));

        sc.close();
    }
}
