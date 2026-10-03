package JavaConstructors;

import java.util.Scanner;

/**
 * Problem 3 (GCR — Java Constructors Level 1 Assignment)
 * Create a Person class with a copy constructor that clones
 * another person's attributes.
 *
 * Author : Mithun
 * Date : 03-10-2026
 */

class Person {

    String name;
    int age;

    // Parameterized constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy constructor
    public Person(Person person) {
        this.name = person.name;
        this.age = person.age;
    }

    // Method to display person details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class PersonCopyConstructor {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter person name: ");
        String name = input.nextLine();

        System.out.print("Enter person age: ");
        int age = input.nextInt();

        // Original object
        Person person1 = new Person(name, age);

        // Copy object
        Person person2 = new Person(person1);

        System.out.println("\nOriginal Person:");
        person1.displayDetails();

        System.out.println("\nCopied Person:");
        person2.displayDetails();

        input.close();
    }
}