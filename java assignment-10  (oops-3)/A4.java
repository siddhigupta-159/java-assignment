
// queestion- 16 = Create a class Person with properties (name and age) with following features.
//  Default age of person should be 18.
//  A person object can be initialized with name and age.
//  Method to display name and age of person.

import java.util.Scanner;

class Person {
    String name;
    int age;

    public Person() {
        this.name = "Unknown";
        this.age = 18;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

class TestMain {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person("Alice", 25);

        person1.display();
        person2.display();
    }
}
