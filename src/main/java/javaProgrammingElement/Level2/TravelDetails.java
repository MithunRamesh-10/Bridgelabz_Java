package javaProgrammingElement.Level2;

import java.util.Scanner;

public class TravelDetails {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.print("Enter from city: ");
        String fromCity = input.nextLine();

        System.out.print("Enter via city: ");
        String viaCity = input.nextLine();

        System.out.print("Enter destination city: ");
        String toCity = input.nextLine();

        System.out.print("Enter distance from " + fromCity +
                " to " + viaCity + " in miles: ");
        double fromToVia = input.nextDouble();

        System.out.print("Enter distance from " + viaCity +
                " to " + toCity + " in miles: ");
        double viaToFinalCity = input.nextDouble();

        System.out.print("Enter time taken in hours: ");
        double timeTaken = input.nextDouble();

        double totalDistance = fromToVia + viaToFinalCity;
        double averageSpeed = totalDistance / timeTaken;

        System.out.println("\n--- Travel Details ---");
        System.out.println("Name: " + name);
        System.out.println("From: " + fromCity);
        System.out.println("Via: " + viaCity);
        System.out.println("To: " + toCity);
        System.out.println("Total Distance: " + totalDistance + " miles");
        System.out.println("Time Taken: " + timeTaken + " hours");
        System.out.println("Average Speed: " + averageSpeed + " miles/hour");

        input.close();
    }
}
