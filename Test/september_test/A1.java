// 1. Constructor Problem

// Car Inventory System

// Create a class Car with fields: brand, model, price.

// Implement:

// A default constructor (sets "Unknown" values and price = 0).

// A parameterized constructor to initialize all fields.

// A copy constructor to clone another Car.

// Write a test class to create cars using all three constructors and print their details./

class Car{
    private String brand;
    private String model;
    private int price;

    public Car(){
        this.brand = "Unknown";
        this.model = "Unknown";
        this.price = 0;
    }

    
    public Car(String brand, String model, int price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    
    public Car(Car otherCar) {
        this.brand = otherCar.brand;
        this.model = otherCar.model;
        this.price = otherCar.price;
    }


    public void printDetails() {
        System.out.println("Brand: " + brand + ", Model: " + model + ", Price: " + price);
    }
}



 class Testmain {
    public static void main(String[] args) {
        
        Car car1 = new Car();

        
        Car car2 = new Car("Toyota", "Camry", 2500000);

        
        Car car3 = new Car(car2);

        System.out.println("Car 1 (Default):");
        car1.printDetails();

        System.out.println("Car 2 (Parameterized):");
        car2.printDetails();

        System.out.println("Car 3 (Copy):");
        car3.printDetails();
    }
}
    
    
 

