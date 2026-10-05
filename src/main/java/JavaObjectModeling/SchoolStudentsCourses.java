package javaObjectModeling;

import java.util.ArrayList;

/**
 * Problem 4: School and Students with Courses
 *
 * Demonstrates association between Student and Course
 * and aggregation between School and Student.
 *
 * Author : Mithun
 * Date : 01-10-2026
 */
public class SchoolStudentsCourses {

    static class Course {
        String courseName;
        ArrayList<Student> students = new ArrayList<>();

        Course(String courseName) {
            this.courseName = courseName;
        }

        void addStudent(Student student) {
            students.add(student);
        }

        void displayStudents() {
            System.out.println("Students enrolled in " + courseName + ":");

            for (Student student : students) {
                System.out.println("- " + student.name);
            }
        }
    }

    static class Student {
        String name;
        ArrayList<Course> courses = new ArrayList<>();

        Student(String name) {
            this.name = name;
        }

        void enrollCourse(Course course) {
            courses.add(course);
            course.addStudent(this);
        }

        void displayCourses() {
            System.out.println(name + "'s courses:");

            for (Course course : courses) {
                System.out.println("- " + course.courseName);
            }
        }
    }

    static class School {
        String schoolName;
        ArrayList<Student> students = new ArrayList<>();

        School(String schoolName) {
            this.schoolName = schoolName;
        }

        void addStudent(Student student) {
            students.add(student);
        }

        void displayStudents() {
            System.out.println("School: " + schoolName);
            System.out.println("Students:");

            for (Student student : students) {
                System.out.println("- " + student.name);
            }
        }
    }

    public static void main(String[] args) {

        // Create courses
        Course java = new Course("Java");
        Course database = new Course("Database");

        // Create students
        Student student1 = new Student("Hemang");
        Student student2 = new Student("Rahul");

        // Create school
        School school = new School("ABC School");

        // Add students to school
        school.addStudent(student1);
        school.addStudent(student2);

        // Students enroll in courses
        student1.enrollCourse(java);
        student1.enrollCourse(database);
        student2.enrollCourse(java);

        // Display school and student details
        school.displayStudents();
        System.out.println();

        student1.displayCourses();
        System.out.println();

        java.displayStudents();
    }
}