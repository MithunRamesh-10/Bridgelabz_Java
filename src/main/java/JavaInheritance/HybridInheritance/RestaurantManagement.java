package javaInheritance.hybridInheritance;

/**
 * Problem 1: Restaurant Management System
 * Demonstrates hybrid inheritance using inheritance and interface.
 *
 * Author : Mithun
 * Date : 02-10-2026
 */

class Person {

    String name;
    int id;

    // Constructor to initialize person details
    Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Display common person details
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}

interface Worker {

    // Define duty that worker must perform
    void performDuties();
}

class Chef extends Person implements Worker {

    Chef(String name, int id) {
        super(name, id);
    }

    // Implement chef duties
    @Override
    public void performDuties() {
        System.out.println("Chef prepares food.");
    }
}

class Waiter extends Person implements Worker {

    Waiter(String name, int id) {
        super(name, id);
    }

    // Implement waiter duties
    @Override
    public void performDuties() {
        System.out.println("Waiter serves customers.");
    }
}

public class RestaurantManagement {

    public static void main(String[] args) {

        // Create Chef and Waiter objects
        Chef chef = new Chef("Rahul", 101);
        Waiter waiter = new Waiter("Amit", 102);

        // Display Chef details and duties
        chef.displayDetails();
        chef.performDuties();

        System.out.println();

        // Display Waiter details and duties
        waiter.displayDetails();
        waiter.performDuties();
    }
}