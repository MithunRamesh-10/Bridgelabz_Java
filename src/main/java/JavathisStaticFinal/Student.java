package javaThisStaticFinal;

/**
 * Problem 5 (GCR — this, static, final keywords and instanceof Operator)
 * Create a Student class using static, this, final and instanceof.
 *
 * Author : Mithun
 * Date : 30-09-2026
 */
public class Student {

    // Static variable shared by all students
    static String universityName = "SRM University";

    // Instance variables
    String name;
    String grade;

    // Final roll number cannot be changed
    final int rollNumber;

    // Static variable to count students
    static int totalStudents = 0;

    // Constructor
    Student(String name, int rollNumber, String grade) {

        // this initializes instance variables
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;

        // Increase student count
        totalStudents++;
    }

    // Static method to display total students
    static void displayTotalStudents() {
        System.out.println("Total Students: " + totalStudents);
    }

    // Display student details
    void displayStudentDetails() {
        System.out.println("University : " + universityName);
        System.out.println("Name       : " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Grade      : " + grade);
    }

    public static void main(String[] args) {

        // Create Student objects
        Student student1 =
                new Student("Hemang", 101, "A");

        Student student2 =
                new Student("Rahul", 102, "B");

        // Check object type
        if (student1 instanceof Student) {
            System.out.println("Student 1 is a Student.");
            student1.displayStudentDetails();
        }

        System.out.println();

        if (student2 instanceof Student) {
            System.out.println("Student 2 is a Student.");
            student2.displayStudentDetails();
        }

        System.out.println();

        // Display total students
        Student.displayTotalStudents();
    }
}