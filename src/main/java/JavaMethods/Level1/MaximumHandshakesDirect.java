package javaMethods.Level1;

import java.util.Scanner;

public class MaximumHandshakesDirect {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int numberOfStudents = sc.nextInt();

        int handshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

        System.out.println("Number of possible handshakes: " + handshakes);

        sc.close();
    }
}