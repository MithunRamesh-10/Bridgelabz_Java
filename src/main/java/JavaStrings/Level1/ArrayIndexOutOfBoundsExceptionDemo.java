package javaString.level1;

import java.util.Scanner;

/**
 * Problem 8 (GCR — Java String Level 1 Assignment)
 * Write a program to demonstrate ArrayIndexOutOfBoundsException
 * and handle the exception using try-catch.
 *
 * Author : Mithun
 * Date : 25-09-2026
 */
public class ArrayIndexOutOfBoundsExceptionDemo {

    // Generate ArrayIndexOutOfBoundsException
    public static void generateException(String[] names) {

        // Access an index larger than the array length
        System.out.println(names[names.length]);
    }

    // Demonstrate and handle the exception
    public static void handleException(String[] names) {

        try {
            // Access an index larger than the array length
            System.out.println(names[names.length]);
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println(
                    "ArrayIndexOutOfBoundsException handled: "
                            + exception.getMessage()
            );
        } catch (RuntimeException exception) {
            System.out.println(
                    "RuntimeException handled: "
                            + exception.getMessage()
            );
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take array size
        System.out.print("Enter number of names: ");
        int size = input.nextInt();

        String[] names = new String[size];

        // Take names as input
        for (int i = 0; i < size; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = input.next();
        }

        // Uncomment to generate the exception directly
        // generateException(names);

        // Handle the exception
        handleException(names);

        input.close();
    }
}
