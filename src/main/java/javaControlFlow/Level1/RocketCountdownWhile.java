package javaControlFlow.Level1;

import java.util.Scanner;

public class RocketCountdownWhile {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter countdown number: ");
        int counter = input.nextInt();

        while (counter >= 1) {
            System.out.println(counter);
            counter--;
        }

        input.close();
    }
}
