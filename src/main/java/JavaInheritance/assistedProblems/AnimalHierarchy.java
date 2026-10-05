package javaInheritance.assistedProblems;

/**
 * Problem 1: Animal Hierarchy
 * Demonstrates inheritance, method overriding and polymorphism.
 *
 * Author : Mithun
 * Date : 02-10-2026
 */

class Animal {

    String name;
    int age;

    // Constructor to initialize animal details
    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to be overridden by subclasses
    void makeSound() {
        System.out.println("Animal makes a sound.");
    }
}

class Dog extends Animal {

    Dog(String name, int age) {
        super(name, age);
    }

    // Override makeSound for Dog
    @Override
    void makeSound() {
        System.out.println(name + " says: Woof!");
    }
}

class Cat extends Animal {

    Cat(String name, int age) {
        super(name, age);
    }

    // Override makeSound for Cat
    @Override
    void makeSound() {
        System.out.println(name + " says: Meow!");
    }
}

class Bird extends Animal {

    Bird(String name, int age) {
        super(name, age);
    }

    // Override makeSound for Bird
    @Override
    void makeSound() {
        System.out.println(name + " says: Chirp!");
    }
}

public class AnimalHierarchy {

    public static void main(String[] args) {

        // Parent class references holding child class objects
        Animal dog = new Dog("Bruno", 3);
        Animal cat = new Cat("Kitty", 2);
        Animal bird = new Bird("Tweety", 1);

        // Runtime polymorphism
        dog.makeSound();
        cat.makeSound();
        bird.makeSound();
    }
}