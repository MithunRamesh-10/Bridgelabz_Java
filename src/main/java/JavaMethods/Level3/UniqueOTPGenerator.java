package javaMethods.level3;

import java.util.Scanner;

/**
 * Problem 7 (GCR — Java Methods Level 3 Assignment)
 * Generate a six-digit OTP 10 times and check whether
 * all generated OTP numbers are unique.
 *
 * Author : Mithun
 * Date : 23-09-2026
 */
public class UniqueOTP {

    // Method to generate a six-digit OTP
    public static int generateOTP() {
        return (int) (Math.random() * 900000) + 100000;
    }

    // Method to check whether all OTPs are unique
    public static boolean areUnique(int[] otps) {

        for (int i = 0; i < otps.length; i++) {
            for (int j = i + 1; j < otps.length; j++) {
                if (otps[i] == otps[j]) {
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {

        // Create array for 10 OTPs
        int[] otps = new int[10];

        // Generate 10 OTPs
        for (int i = 0; i < otps.length; i++) {
            otps[i] = generateOTP();
        }

        // Display OTPs
        System.out.println("Generated OTPs:");

        for (int otp : otps) {
            System.out.println(otp);
        }

        // Check uniqueness
        boolean unique = areUnique(otps);

        System.out.println("All OTPs are unique: " + unique);
    }
}
