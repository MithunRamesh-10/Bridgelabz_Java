package JavaConstructors.StaticThisFinalInstanceof.Level1;

import java.util.Scanner;

/**
 * Problem 5 (GCR — Java Constructors Static, This, Final and Instanceof Assignment)
 * Demonstrate static, this, final and instanceof using University Student Management.
 *
 * Author : Mithun
 * Date : 03-10-2026
 */

class Student {

    // Static variable
    static String universityName = "SRM University";

    // Static counter
    static int totalStudents = 0;

    // Instance variables
    String name;
    String grade;

    // Final variable
    final int rollNumber;

    // Constructor
    public Student(String name, int rollNumber, String grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;

        totalStudents++;
    }

    // Static method
    public static void displayTotalStudents() {
        System.out.println("Total Students: " + totalStudents);
    }

    // Display student details
    public void displayDetails() {
        System.out.println("University Name: " + universityName);
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Grade: " + grade);
    }
}

public class UniversityStudentManagement {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = input.nextLine();

        System.out.print("Enter roll number: ");
        int rollNumber = input.nextInt();

        input.nextLine();

        System.out.print("Enter grade: ");
        String grade = input.nextLine();

        Student student = new Student(name, rollNumber, grade);

        if (student instanceof Student) {
            System.out.println("\nStudent Details:");
            student.displayDetails();
        }

        System.out.println();
        Student.displayTotalStudents();

        input.close();
    }
}