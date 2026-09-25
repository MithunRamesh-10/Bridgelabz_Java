package javaMethods.Level3;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class UniqueOTPGenerator {

    public static int generateOTP() {

        Random random = new Random();

        return 100000 + random.nextInt(900000);
    }

    public static int[] generateUniqueOTPs(int size) {

        int[] otps = new int[size];

        HashSet<Integer> uniqueOTPs = new HashSet<>();

        int index = 0;

        while (index < size) {

            int otp = generateOTP();

            if (!uniqueOTPs.contains(otp)) {

                uniqueOTPs.add(otp);

                otps[index] = otp;

                index++;
            }
        }

        return otps;
    }

    public static boolean areOTPsUnique(int[] otps) {

        HashSet<Integer> set = new HashSet<>();

        for (int otp : otps) {

            if (set.contains(otp)) {
                return false;
            }

            set.add(otp);
        }

        return true;
    }

    public static void main(String[] args) {

        int[] otps = generateUniqueOTPs(10);

        System.out.println("Generated OTPs:");

        for (int otp : otps) {
            System.out.println(otp);
        }

        System.out.println(
                "\nAll OTPs are unique: " +
                        areOTPsUnique(otps)
        );
    }
}
