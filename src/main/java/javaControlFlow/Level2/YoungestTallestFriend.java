package javaControlFlow.Level2;

import java.util.Scanner;

public class YoungestTallestFriend {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Amar's age: ");
        int amarAge = input.nextInt();

        System.out.print("Enter Amar's height in cm: ");
        double amarHeight = input.nextDouble();

        System.out.print("Enter Akbar's age: ");
        int akbarAge = input.nextInt();

        System.out.print("Enter Akbar's height in cm: ");
        double akbarHeight = input.nextDouble();

        System.out.print("Enter Anthony's age: ");
        int anthonyAge = input.nextInt();

        System.out.print("Enter Anthony's height in cm: ");
        double anthonyHeight = input.nextDouble();

        String youngest;

        if (amarAge <= akbarAge && amarAge <= anthonyAge) {
            youngest = "Amar";
        } else if (akbarAge <= amarAge && akbarAge <= anthonyAge) {
            youngest = "Akbar";
        } else {
            youngest = "Anthony";
        }

        String tallest;

        if (amarHeight >= akbarHeight && amarHeight >= anthonyHeight) {
            tallest = "Amar";
        } else if (akbarHeight >= amarHeight && akbarHeight >= anthonyHeight) {
            tallest = "Akbar";
        } else {
            tallest = "Anthony";
        }

        System.out.println("Youngest Friend: " + youngest);
        System.out.println("Tallest Friend: " + tallest);

        input.close();
    }
}
