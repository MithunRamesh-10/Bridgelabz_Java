package javaInheritance.multilevelInheritance;

/**
 * Problem 2: Educational Course Hierarchy
 * Demonstrates multilevel inheritance.
 *
 * Author : Mithun
 * Date : 02-10-2026
 */

class Course {

    String courseName;
    int duration;

    // Constructor to initialize course details
    Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }
}

class OnlineCourse extends Course {

    String platform;
    boolean isRecorded;

    OnlineCourse(String courseName, int duration,
                 String platform, boolean isRecorded) {
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }
}

class PaidOnlineCourse extends OnlineCourse {

    double fee;
    double discount;

    PaidOnlineCourse(String courseName, int duration,
                     String platform, boolean isRecorded,
                     double fee, double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    // Display complete course details
    void displayCourseDetails() {

        double finalFee = fee - (fee * discount / 100);

        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " hours");
        System.out.println("Platform: " + platform);
        System.out.println("Recorded: " + isRecorded);
        System.out.println("Fee: " + fee);
        System.out.println("Discount: " + discount + "%");
        System.out.println("Final Fee: " + finalFee);
    }
}

public class EducationalCourse {

    public static void main(String[] args) {

        // Create object of the lowest-level subclass
        PaidOnlineCourse course = new PaidOnlineCourse(
                "Java Full Stack",
                40,
                "BridgeLabz",
                true,
                10000,
                20
        );

        // Display course details
        course.displayCourseDetails();
    }
}