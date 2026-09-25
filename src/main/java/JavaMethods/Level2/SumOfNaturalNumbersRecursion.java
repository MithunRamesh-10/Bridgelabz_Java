package javaMethods.Level1;

import java.util.Scanner;

public class SumOfNaturalNumbersRecursion {

    public static int findSumUsingRecursion(int n) {
        if (n == 0) {
            return 0;
        }

        return n + findSumUsingRecursion(n - 1);
    }

    public static int findSumUsingFormula(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a natural number greater than 0.");
            sc.close();
            return;
        }

        int recursiveSum = findSumUsingRecursion(n);
        int formulaSum = findSumUsingFormula(n);

        System.out.println("Sum using recursion: " + recursiveSum);
        System.out.println("Sum using formula: " + formulaSum);

        if (recursiveSum == formulaSum) {
            System.out.println("Both computations are correct.");
        } else {
            System.out.println("Both computations are not equal.");
        }

        sc.close();
    }
}