// 1. Write a Java program to create a class called "Person" with a name and age attribute. 
// Create two instances of the "Person" class, set their attributes using the constructor, and print their name and age.

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void display() {
        System.out.println("Person's Name: " + name);
        System.out.println("Person's Age: " + age);
    }
}

class P1 {
    public static void main(String[] args) {
        Person obj1 = new Person();
        Person obj2 = new Person();
        obj1.setName("siddhi");
        obj1.setAge(21);
        obj1.display();
        obj2.setName("Anshu");
        obj2.setAge(20);
        obj2.display();
    }
}
