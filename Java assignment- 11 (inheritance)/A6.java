// Problem 5: Smart Home System

// Abstract class Appliance:

// name, power

// abstract methods turnOn(), turnOff()

// concrete method showStatus()

// Subclasses:

// Fan

// Light

// WashingMachine

// Interface SmartDevice with method connectWifi().

// Only Light and WashingMachine are smart devices.

// In main method, turn on/off appliances and connect smart ones to WiFi.

import java.util.*;

interface SmartDevice {
    public void connectWifi();
}

abstract class Appliance {
    private String name;
    private int power;
    private boolean isOn;

    public Appliance(String name, int power) {
        this.name = name;
        this.power = power;
        this.isOn = false;
    }

    public String getname() {
        return name;
    }

    public int getPower() {
        return power;
    }

    public boolean getIsOn() {
        return isOn;
    }

    public void setIsOn(boolean isOn) {
        this.isOn = isOn;
    }

    abstract void turnOn();

    abstract void turnOff();

    public void showStatus() {
        String status = isOn ? "ON" : "OFF";
        System.out.println(name + " is currently " + status + " (Power: " + power + "W)");
    }
}

class Fan extends Appliance {

    public Fan(String name, int power) {
        super(name, power);
    }

    public void turnOn() {
        setIsOn(true);
        System.out.println(getname() + " is now ON. Enjoy the cool air");
    }

    public void turnOff() {
        setIsOn(false);
        System.out.println(getname() + " is now OFF.");
    }
}

class Light extends Appliance implements SmartDevice {

    public Light(String name, int power) {
        super(name, power);
    }

    public void turnOn() {
        setIsOn(true);
        System.out.println(getname() + " is now ON. The room is bright!");
    }

    public void turnOff() {
        setIsOn(false);
        System.out.println(getname() + " is now OFF.");
    }

    public void connectWifi() {
        System.out.println(getname() + " connected to Wi-Fi successfully ");
    }
}

class WashingMachine extends Appliance implements SmartDevice {

    WashingMachine(String name, int power) {
        super(name, power);
    }

    public void turnOn() {
        setIsOn(true);
        System.out.println(getname() + " is now ON. Starting the wash cycle!");
    }

    public void turnOff() {
        setIsOn(false);
        System.out.println(getname() + " is now OFF. Washing complete!");
    }

    public void connectWifi() {
        System.out.println(getname() + " connected to Wi-Fi successfully 📶");
    }
}

class SmartHomeSystem {
    public static void main(String[] args) {

        Fan fan = new Fan("Ceiling Fan", 75);
        Light light = new Light("Smart LED Light", 15);
        WashingMachine wm = new WashingMachine("Smart Washing Machine", 500);

        System.out.println("Fan :");
        fan.turnOn();
        fan.showStatus();
        fan.turnOff();
        fan.showStatus();

        System.out.println(" Light :");
        light.turnOn();
        light.connectWifi();
        light.showStatus();
        light.turnOff();
        light.showStatus();

        System.out.println(" Washing Machine :");
        wm.turnOn();
        wm.connectWifi();
        wm.showStatus();
        wm.turnOff();
        wm.showStatus();
    }
}
