// Problem Statement 
// You are building a transportation system for a logistics company.
// Requirements:
// Every Vehicle should have:
// a registration number,
// a method to start,
// a method to stop.
// Some vehicles run on Fuel (like Car, Truck), while others run on Electricity (like ElectricBike, ElectricCar).
// Create an interface Chargeable that forces all electric vehicles to implement:
// chargeBattery() method.
// Create an abstract class Vehicle that:
// Stores the registration number.
// Has abstract methods start() and stop().
// Has a concrete method displayInfo() to show vehicle details.
// Create subclasses:
// Car (inherits from Vehicle) → Fuel based.
// Truck (inherits from Vehicle) → Fuel based.
// ElectricBike (inherits from Vehicle and implements Chargeable).
// ElectricCar (inherits from Vehicle and implements Chargeable).
// In the main class (TransportSystem),
// Create objects of all types of vehicles.
// Call their methods (start, stop, chargeBattery where required).
// Expected Output Example
// Car KA01AB1234 starting with petrol engine...
// Car KA01AB1234 stopped.
// Truck KA02XY9876 starting with diesel engine...
// Truck KA02XY9876 stopped.
// Electric Bike KA03EL5678 starting silently...
// Electric Bike KA03EL5678 battery charging...
// Electric Bike KA03EL5678 stopped.
// Electric Car KA04EV4321 starting silently...
// Electric Car KA04EV4321 battery charging...
// Electric Car KA04EV4321 stopped.

interface Chargeable {

    public void chargeBattery();

}

abstract class Vehicle {
    private String registrationNo;

    public Vehicle(String registrationNo) {
        this.registrationNo = registrationNo;
    }

    abstract public void start();

    abstract public void stop();

    public void diplayDetails() {
        System.out.println("Registration no.: " + this.registrationNo);
    }

}

class Car extends Vehicle {
    private String registrationNo;

    public Car(String registrationNo) {
        super(registrationNo);
        this.registrationNo = registrationNo;

    }

    public void start() {
        System.out.println("Car " + " " + this.registrationNo + " " + "starting with petrol engine...");
    }

    public void stop() {
        System.out.println("Car" + " " + this.registrationNo + " " + "stopped.");
    }
}

class Truck extends Vehicle {
    private String registrationNo;

    public Truck(String registrationNo) {
        super(registrationNo);
        this.registrationNo = registrationNo;

    }

    public void start() {
        System.out.println("Truck" + " " + this.registrationNo + " " + "starting with petrol engine...");
    }

    public void stop() {
        System.out.println("Truck" + " " + this.registrationNo + " " + "stopped.");
    }
}

class ElectricBike extends Vehicle implements Chargeable {
    private String registrationNo;

    public ElectricBike(String registrationNo) {
        super(registrationNo);
        this.registrationNo = registrationNo;

    }

    public void start() {
        System.out.println("Electric Bike" + " " + this.registrationNo + " " + "starting silently...");
    }

    public void chargeBattery() {
        System.out.println("Electric Bike" + " " + this.registrationNo + " " + "battery charging...");
    }

    public void stop() {
        System.out.println("Electric Bike" + " " + this.registrationNo + " " + "stopped.");
    }

}

class ElectricCar extends Vehicle implements Chargeable {
    private String registrationNo;

    public ElectricCar(String registrationNo) {
        super(registrationNo);
        this.registrationNo = registrationNo;

    }

    public void start() {
        System.out.println("Electric Car" + " " + this.registrationNo + " " + "starting silently...");
    }

    public void chargeBattery() {
        System.out.println("Electric Car" + " " + this.registrationNo + " " + "battery charging...");
    }

    public void stop() {
        System.out.println("Electric Car" + " " + this.registrationNo + " " + "stopped.");
    }

}

class TransportSystem {
    public static void main(String args[]) {
        Car c = new Car("KA01AB1234");
        c.start();
        c.stop();

        Truck T = new Truck("KA02XY9876");
        T.start();
        T.stop();

        ElectricBike B = new ElectricBike("KA03EL5678");
        B.start();
        B.chargeBattery();
        B.stop();

        ElectricCar C = new ElectricCar("KA04EV4321");
        C.start();
        C.chargeBattery();
        C.stop();
    }
}