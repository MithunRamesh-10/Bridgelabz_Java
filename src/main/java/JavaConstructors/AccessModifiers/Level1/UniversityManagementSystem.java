package JavaAccessModifiers.Level1;

import java.util.Scanner;

/**
 * Problem 1 (GCR — Java Access Modifiers Level 1 Assignment)
 * Create a Student class with public, protected, and private members.
 * Demonstrate access to protected members through a subclass and
 * access to private CGPA through public methods.
 *
 * Author : Mithun
 * Date : 03-10-2026
 */

class Student {

    // Public member - accessible from anywhere
    public int rollNumber;

    // Protected member - accessible within package and subclasses
    protected String name;

    // Private member - accessible only within Student
    private double CGPA;

    // Public method to set private CGPA
    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }

    // Public method to get private CGPA
    public double getCGPA() {
        return CGPA;
    }
}

// Subclass demonstrating protected member access
class PostgraduateStudent extends Student {

    public void displayStudentDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + getCGPA());
    }
}

public class UniversityManagementSystem {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        PostgraduateStudent student = new PostgraduateStudent();

        System.out.print("Enter roll number: ");
        student.rollNumber = input.nextInt();

        input.nextLine();

        System.out.print("Enter student name: ");
        student.name = input.nextLine();

        System.out.print("Enter CGPA: ");
        double CGPA = input.nextDouble();

        student.setCGPA(CGPA);

        System.out.println("\nStudent Details:");
        student.displayStudentDetails();

        input.close();
    }
}