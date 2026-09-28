package javaControlFlow.level1;

/**
 * Problem 7 (GCR — Control Flow Assignment)
 * Write a program SpringSeason that takes month and day
 * from the command line and prints "Its a Spring Season"
 * otherwise "Not a Spring Season".
 *
 * Author : Mithun
 * Date : 21-09-2026
 */
public class SpringSeason {

    // Method to check whether the date is in Spring Season
    public static boolean isSpringSeason(int month, int day) {
        return (month == 3 && day >= 20) ||
                (month == 4) ||
                (month == 5) ||
                (month == 6 && day <= 20);
    }

    public static void main(String[] args) {

        // Take month and day from command line
        int month = Integer.parseInt(args[0]);
        int day = Integer.parseInt(args[1]);

        // Check whether the date is in Spring Season
        boolean isSpring = isSpringSeason(month, day);

        // Display the result
        if (isSpring) {
            System.out.println("Its a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
    }
}
