package JavaConstructors.InstanceVsClassVariablesAndMethods.Level1;

import java.util.Scanner;

/**
 * Problem 2 (GCR — Instance vs Class Variables and Methods Level 1 Assignment)
 * Create a Course class with instance variables courseName, duration,
 * and fee. Use a class variable instituteName common to all courses.
 *
 * Author : Mithun
 * Date : 03-10-2026
 */

class Course {

    // Instance variables
    String courseName;
    int duration;
    double fee;

    // Class variable
    static String instituteName = "ABC Institute";

    // Constructor
    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    // Instance method
    public void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " months");
        System.out.println("Fee: " + fee);
        System.out.println("Institute Name: " + instituteName);
    }

    // Class method
    public static void updateInstituteName(String newInstituteName) {
        instituteName = newInstituteName;
    }
}

public class OnlineCourseManagement {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter course name: ");
        String courseName = input.nextLine();

        System.out.print("Enter course duration in months: ");
        int duration = input.nextInt();

        System.out.print("Enter course fee: ");
        double fee = input.nextDouble();

        input.nextLine();

        Course course = new Course(courseName, duration, fee);

        System.out.println("\nCourse Details:");
        course.displayCourseDetails();

        System.out.print("\nEnter new institute name: ");
        String newInstituteName = input.nextLine();

        // Update shared class variable
        Course.updateInstituteName(newInstituteName);

        System.out.println("\nUpdated Course Details:");
        course.displayCourseDetails();

        input.close();
    }
}