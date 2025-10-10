// Problem 6: Zoo Animal Management

// Abstract class Animal:

// name, age

// abstract methods eat(), makeSound()

// concrete method showInfo()

// Subclasses:

// Lion

// Elephant

// Parrot

// Interface Flyable with fly() method.

// Only Parrot implements Flyable.

import java.util.*;

interface Flyable {
    public void fly();
}

abstract class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    abstract void eat();

    abstract void makeSound();

    public void showInfo() {
        System.out.println("Animal Name: " + name);
        System.out.println("Age: " + age + " years");

    }
}

class Lion extends Animal {

    public Lion(String name, int age) {
        super(name, age);
    }

    public void eat() {
        System.out.println(getName() + " eats meat (carnivore).");
    }

    public void makeSound() {
        System.out.println(getName() + " roars loudly! ");
    }
}

class Elephant extends Animal {

    public Elephant(String name, int age) {
        super(name, age);
    }

    public void eat() {
        System.out.println(getName() + " eats grass and fruits (herbivore).");
    }

    public void makeSound() {
        System.out.println(getName() + " trumpets with its trunk! ");
    }
}

class Parrot extends Animal implements Flyable {

    public Parrot(String name, int age) {
        super(name, age);
    }

    public void eat() {
        System.out.println(getName() + " eats seeds and fruits.");
    }

    public void makeSound() {
        System.out.println(getName() + " chirps and mimics sounds! ");
    }

    public void fly() {
        System.out.println(getName() + " is flying high in the sky! ");
    }
}

class ZooAnimalManagement {
    public static void main(String[] args) {
        Lion lion = new Lion("Simba", 5);
        Elephant elephant = new Elephant("Gajraj", 10);
        Parrot parrot = new Parrot("Mithu", 2);

        System.out.println("Zoo Animal Management System :");

        System.out.println("Lion :-");
        lion.showInfo();
        lion.eat();
        lion.makeSound();

        System.out.println("Elephant :-");
        elephant.showInfo();
        elephant.eat();
        elephant.makeSound();

        System.out.println(" Parrot :-");
        parrot.showInfo();
        parrot.eat();
        parrot.makeSound();
        parrot.fly();
    }
}
