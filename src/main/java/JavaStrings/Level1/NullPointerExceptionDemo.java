package javaString.level1;

/**
 * Problem 4 (GCR — Java String Level 1 Assignment)
 * Write a program to demonstrate NullPointerException
 * and handle the exception using try-catch.
 *
 * Author : Mithun
 * Date : 25-09-2026
 */
public class NullPointerExceptionDemo {

    // Generate NullPointerException
    public static void generateException() {
        String text = null;

        // Access a method on a null string
        System.out.println(text.length());
    }

    // Demonstrate and handle NullPointerException
    public static void handleException() {
        String text = null;

        try {
            // Access a method on a null string
            System.out.println(text.length());
        } catch (NullPointerException exception) {
            System.out.println(
                    "NullPointerException handled: "
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

        // The following method generates the exception and stops execution.
        // Uncomment it to see the exception being generated.
        // generateException();

        // Handle the exception using try-catch
        handleException();
    }
}
