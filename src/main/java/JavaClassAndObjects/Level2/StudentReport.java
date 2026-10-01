package JavaClassesAndObjects.Level2;

import java.util.Scanner;

/**
 * Problem 1 (GCR — Java Classes and Objects Level 2 Assignment)
 * Program to simulate a student report.
 *
 * Create a Student class with attributes name, rollNumber, and marks.
 * Add methods to calculate the grade based on marks and display
 * the student's details and grade.
 *
 * Author : Mithun
 * Date : 01-10-2026
 */

class Student {

    String name;
    int rollNumber;
    double marks;

    // Method to calculate grade
    public char calculateGrade() {

        if (marks >= 90) {
            return 'A';
        } else if (marks >= 80) {
            return 'B';
        } else if (marks >= 70) {
            return 'C';
        } else if (marks >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }

    // Method to display student details and grade
    public void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + calculateGrade());
    }
}

public class StudentReport {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Student student = new Student();

        System.out.print("Enter student name: ");
        student.name = input.nextLine();

        System.out.print("Enter roll number: ");
        student.rollNumber = input.nextInt();

        System.out.print("Enter marks: ");
        student.marks = input.nextDouble();

        System.out.println("\nStudent Report:");
        student.displayDetails();

        input.close();
    }
}