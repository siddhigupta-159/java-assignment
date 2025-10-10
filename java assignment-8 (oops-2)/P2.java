// 2. Write a Java program to create a class called"Dog" with a name and breed attribute.
// Create two instances of the"Dog"class, set their attributes using the constructor and 
// modify the attributes using the setter methods and print the updated values.

class Dog {
    private String name;
    private String breed;

    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    public Dog() {

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void display() {
        System.out.println("Dog's Name: " + name);
        System.out.println("Dog's Breed: " + breed);
    }
}

class P2 {
    public static void main(String[] args) {
        Dog obj1 = new Dog();
        Dog obj2 = new Dog();
        obj1.setName("Rocky");
        obj1.setBreed("PitBull");
        obj1.display();
        obj2.setName("tusky");
        obj2.setBreed("Jarman Seford");
        obj2.display();
    }
}