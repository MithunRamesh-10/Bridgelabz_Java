package javaProgrammingElements.level1;

/**
 * Problem 7 (GCR — Java Programming Elements Assignment)
 * Calculate the volume of Earth in cubic kilometers and cubic miles
 * using Earth's radius of 6378 km.
 *
 * Author : Mithun
 * Date : 19-09-2026
 */
public class EarthVolume {
    public static void main(String[] args) {

        // Store the radius of Earth in kilometers
        double radiusKm = 6378;

        // Calculate the volume of Earth in cubic kilometers
        double volumeKm = (4.0 / 3.0) * Math.PI * Math.pow(radiusKm, 3);

        // Convert the radius from kilometers to miles
        double radiusMiles = radiusKm / 1.6;

        // Calculate the volume of Earth in cubic miles
        double volumeMiles = (4.0 / 3.0) * Math.PI * Math.pow(radiusMiles, 3);

        // Display the volume in both units
        System.out.println("The volume of earth in cubic kilometers is "
                + volumeKm + " and cubic miles is " + volumeMiles);
    }
}
