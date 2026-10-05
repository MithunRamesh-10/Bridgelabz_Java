package javaInheritance.hierarchicalInheritance;

/**
 * Problem 2: School System with Different Roles
 * Demonstrates hierarchical inheritance.
 *
 * Author : Mithun
 * Date : 02-10-2026
 */

class Person {

    String name;
    int age;

    // Constructor to initialize person details
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Display common person details
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Teacher extends Person {

    String subject;

    Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    // Display teacher role
    void displayRole() {
        System.out.println("Role: Teacher");
        displayDetails();
        System.out.println("Subject: " + subject);
    }
}

class Student extends Person {

    String grade;

    Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }

    // Display student role
    void displayRole() {
        System.out.println("Role: Student");
        displayDetails();
        System.out.println("Grade: " + grade);
    }
}

class Staff extends Person {

    String department;

    Staff(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    // Display staff role
    void displayRole() {
        System.out.println("Role: Staff");
        displayDetails();
        System.out.println("Department: " + department);
    }
}

public class SchoolSystem {

    public static void main(String[] args) {

        // Create objects of different subclasses
        Teacher teacher = new Teacher("Anita", 35, "Mathematics");

        Student student = new Student("Rahul", 20, "A");

        Staff staff = new Staff("Suresh", 40, "Administration");

        // Display role details
        teacher.displayRole();

        System.out.println();

        student.displayRole();

        System.out.println();

        staff.displayRole();
    }
}