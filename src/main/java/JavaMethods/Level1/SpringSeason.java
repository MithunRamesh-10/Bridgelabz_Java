package javaMethods.level1;

/**
 * Problem 6 (GCR — Java Methods Level 1 Assignment)
 * Check whether the given month and day fall within Spring Season.
 * Spring Season is from March 20 to June 20.
 *
 * Author : Mithun
 * Date : 23-09-2026
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

        // Call method to check Spring Season
        boolean isSpring = isSpringSeason(month, day);

        // Display result
        if (isSpring) {
            System.out.println("Its a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
    }
}
