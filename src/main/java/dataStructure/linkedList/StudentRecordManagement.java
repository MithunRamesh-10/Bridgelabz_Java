package dataStructure.linkedList;

/**
 * Problem 1: Student Record Management
 *
 * Demonstrates singly linked list operations
 * for managing student records.
 *
 * Operations:
 * - Add at beginning
 * - Add at end
 * - Add at specific position
 * - Delete by Roll Number
 * - Search by Roll Number
 * - Display all records
 * - Update student's grade
 *
 * Author : Mithun
 * Date : 08-10-2026
 */
public class StudentRecordManagement {

    // Node class representing a student
    static class Student {
        private int rollNumber;
        private String name;
        private int age;
        private char grade;
        private Student next;

        Student(int rollNumber, String name,
                int age, char grade) {

            this.rollNumber = rollNumber;
            this.name = name;
            this.age = age;
            this.grade = grade;
        }

        public int getRollNumber() {
            return rollNumber;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public char getGrade() {
            return grade;
        }

        public void setGrade(char grade) {
            this.grade = grade;
        }
    }

    private Student head;

    // Add at beginning
    public void addAtBeginning(int rollNumber,
                               String name,
                               int age,
                               char grade) {

        Student newStudent =
                new Student(rollNumber, name, age, grade);

        newStudent.next = head;
        head = newStudent;
    }

    // Add at end
    public void addAtEnd(int rollNumber,
                         String name,
                         int age,
                         char grade) {

        Student newStudent =
                new Student(rollNumber, name, age, grade);

        if (head == null) {
            head = newStudent;
            return;
        }

        Student current = head;

        while (current.next != null) {
            current = current.next;
        }

        current.next = newStudent;
    }

    // Add at specific position
    public void addAtPosition(int position,
                              int rollNumber,
                              String name,
                              int age,
                              char grade) {

        if (position <= 1) {
            addAtBeginning(
                    rollNumber, name, age, grade
            );
            return;
        }

        Student current = head;

        for (int i = 1;
             i < position - 1 && current != null;
             i++) {

            current = current.next;
        }

        if (current == null) {
            System.out.println("Invalid position.");
            return;
        }

        Student newStudent =
                new Student(
                        rollNumber, name, age, grade
                );

        newStudent.next = current.next;
        current.next = newStudent;
    }

    // Delete by Roll Number
    public void deleteByRollNumber(int rollNumber) {

        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        if (head.getRollNumber() == rollNumber) {
            head = head.next;
            return;
        }

        Student current = head;

        while (current.next != null) {

            if (current.next.getRollNumber()
                    == rollNumber) {

                current.next = current.next.next;
                return;
            }

            current = current.next;
        }

        System.out.println("Student not found.");
    }

    // Search by Roll Number
    public void searchByRollNumber(int rollNumber) {

        Student current = head;

        while (current != null) {

            if (current.getRollNumber() == rollNumber) {
                displayStudent(current);
                return;
            }

            current = current.next;
        }

        System.out.println("Student not found.");
    }

    // Update grade
    public void updateGrade(int rollNumber,
                            char newGrade) {

        Student current = head;

        while (current != null) {

            if (current.getRollNumber() == rollNumber) {
                current.setGrade(newGrade);
                return;
            }

            current = current.next;
        }

        System.out.println("Student not found.");
    }

    // Display all records
    public void display() {

        Student current = head;

        while (current != null) {
            displayStudent(current);
            current = current.next;
        }
    }

    private void displayStudent(Student student) {

        System.out.println(
                "Roll Number: " + student.getRollNumber()
        );

        System.out.println(
                "Name: " + student.getName()
        );

        System.out.println(
                "Age: " + student.getAge()
        );

        System.out.println(
                "Grade: " + student.getGrade()
        );

        System.out.println("--------------------");
    }

    public static void main(String[] args) {

        StudentRecordManagement list =
                new StudentRecordManagement();

        list.addAtBeginning(
                101, "Mithun", 21, 'A'
        );

        list.addAtEnd(
                102, "Rahul", 20, 'B'
        );

        list.addAtEnd(
                104, "Arun", 21, 'A'
        );

        list.addAtPosition(
                3, 103, "Karthik", 20, 'B'
        );

        System.out.println("Student Records:");
        list.display();

        System.out.println("Searching Roll Number 103:");
        list.searchByRollNumber(103);

        list.updateGrade(102, 'A');

        System.out.println("After Grade Update:");
        list.display();

        list.deleteByRollNumber(101);

        System.out.println("After Deletion:");
        list.display();
    }
}