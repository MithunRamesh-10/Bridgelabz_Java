package javaProgrammingElements.level2;

import java.util.Scanner;

/**
 * Problem 8 (GCR — Java Programming Elements Assignment)
 * Rewrite the Sample Program 2 with user inputs.
 *
 * Author : Mithun
 * Date : 19-09-2026
 */
public class TravelComputation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take the name
        System.out.print("Enter name: ");
        String name = input.nextLine();

        // Take the city details
        System.out.print("Enter from city: ");
        String fromCity = input.nextLine();

        System.out.print("Enter via city: ");
        String viaCity = input.nextLine();

        System.out.print("Enter to city: ");
        String toCity = input.nextLine();

        // Take the distances
        System.out.print("Enter distance from " + fromCity + " to " + viaCity + ": ");
        double distanceFromToVia = input.nextDouble();

        System.out.print("Enter distance from " + viaCity + " to " + toCity + ": ");
        double distanceViaToFinalCity = input.nextDouble();

        // Take the travel times in minutes
        System.out.print("Enter time from " + fromCity + " to " + viaCity + " in minutes: ");
        int timeFromToVia = input.nextInt();

        System.out.print("Enter time from " + viaCity + " to " + toCity + " in minutes: ");
        int timeViaToFinalCity = input.nextInt();

        // Calculate total distance and total time
        double totalDistance = distanceFromToVia + distanceViaToFinalCity;
        int totalTime = timeFromToVia + timeViaToFinalCity;

        // Display the travel details
        System.out.println("The Total Distance travelled by " + name +
                " from " + fromCity + " to " + toCity +
                " via " + viaCity + " is " + totalDistance +
                " km and the Total Time taken is " + totalTime + " minutes");

        input.close();
    }
}
