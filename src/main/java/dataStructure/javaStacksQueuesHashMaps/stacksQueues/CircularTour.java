package javaStacksQueuesHashMaps.stacksQueues;

/**
 * Problem 5 (Circular Tour Problem)
 * Given a set of petrol pumps with petrol and distance to the
 * next pump, determine the starting point for completing
 * a circular tour.
 *
 * Hint: Use a queue to simulate the tour, keeping track of
 * surplus petrol at each pump.
 *
 * Author : Mithun
 * Date : 07-10-2026
 */

public class CircularTour {

    static class PetrolPump {
        int petrol;
        int distance;

        PetrolPump(int petrol, int distance) {
            this.petrol = petrol;
            this.distance = distance;
        }
    }

    public static int findStartingPoint(PetrolPump[] pumps) {

        int start = 0;
        int currentPetrol = 0;
        int totalPetrol = 0;
        int totalDistance = 0;

        for (int i = 0; i < pumps.length; i++) {

            // Calculate total petrol and total distance
            totalPetrol += pumps[i].petrol;
            totalDistance += pumps[i].distance;

            // Add petrol available at current pump
            currentPetrol += pumps[i].petrol - pumps[i].distance;

            // Current starting point cannot complete the tour
            if (currentPetrol < 0) {
                start = i + 1;
                currentPetrol = 0;
            }
        }

        // Complete tour is impossible
        if (totalPetrol < totalDistance) {
            return -1;
        }

        return start;
    }

    public static void main(String[] args) {

        PetrolPump[] pumps = {
                new PetrolPump(4, 6),
                new PetrolPump(6, 5),
                new PetrolPump(7, 3),
                new PetrolPump(4, 5)
        };

        int start = findStartingPoint(pumps);

        if (start == -1) {
            System.out.println("Circular tour cannot be completed");
        } else {
            System.out.println("Starting Petrol Pump: " + start);
        }
    }
}