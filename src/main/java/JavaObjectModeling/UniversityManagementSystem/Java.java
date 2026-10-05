package javaObjectModeling;

import java.util.ArrayList;

/**
 * Problem 8: University Management System
 *
 * Demonstrates association and aggregation between
 * Student, Professor, and Course objects.
 *
 * Author : Mithun
 * Date : 01-10-2026
 */
public class UniversityManagementSystem {

    static class Student {
        String studentName;
        ArrayList<Course> courses = new ArrayList<>();

        Student(String studentName) {
            this.studentName = studentName;
        }

        void enrollCourse(Course course) {
            courses.add(course);
            course.addStudent(this);

            System.out.println(
                    studentName + " enrolled in " + course.courseName
            );
        }

        void displayCourses() {
            System.out.println(studentName + "'s Courses:");

            for (Course course : courses) {
                System.out.println("- " + course.courseName);
            }
        }
    }

    static class Professor {
        String professorName;
        ArrayList<Course> courses = new ArrayList<>();

        Professor(String professorName) {
            this.professorName = professorName;
        }

        void assignCourse(Course course) {
            courses.add(course);
            course.assignProfessor(this);

            System.out.println(
                    professorName + " assigned to " + course.courseName
            );
        }
    }

    static class Course {
        String courseName;
        Professor professor;
        ArrayList<Student> students = new ArrayList<>();

        Course(String courseName) {
            this.courseName = courseName;
        }

        void addStudent(Student student) {
            students.add(student);
        }

        void assignProfessor(Professor professor) {
            this.professor = professor;
        }

        void displayCourseDetails() {
            System.out.println("Course: " + courseName);

            if (professor != null) {
                System.out.println(
                        "Professor: " + professor.professorName
                );
            }

            System.out.println("Students:");

            for (Student student : students) {
                System.out.println("- " + student.studentName);
            }
        }
    }

    public static void main(String[] args) {

        // Create students
        Student student1 = new Student("Hemang");
        Student student2 = new Student("Rahul");

        // Create professor
        Professor professor = new Professor("Dr. Sharma");

        // Create courses
        Course java = new Course("Java Programming");
        Course database = new Course("Database Management");

        // Students enroll in courses
        student1.enrollCourse(java);
        student1.enrollCourse(database);
        student2.enrollCourse(java);

        // Professor teaches courses
        professor.assignCourse(java);
        professor.assignCourse(database);

        // Display student courses
        System.out.println();
        student1.displayCourses();

        System.out.println();

        // Display course details
        java.displayCourseDetails();

        System.out.println();

        database.displayCourseDetails();
    }
}