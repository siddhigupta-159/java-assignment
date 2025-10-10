// Write a Java program to create class called "TrafficLight" with attributes for color and duration,
//  and methods to change the color and check for red or green.

class TrafficLight {

    private String color;
    private int duration;

    public TrafficLight(String color, int duration) {
        this.color = color;
        this.duration = duration;
    }

    public void getDetails() {
        System.out.println("Color: " + this.color + " " + "Duration :" + this.duration);
    }

    public void ChangeColor(String color, int duration) {
        this.color = color;
        this.duration = duration;
    }

    public void CheckColor() {
        if (color.equals("green")) {
            System.out.println("YOU CAN GO");
        } else if (color.equals("red")) {
            System.out.println("STOP");
        } else if (color.equals("yellow")) {
            System.out.println("READY TO GO");
        } else {
            System.out.println("INVALID COLOR");
        }
    }

}

class P8 {
    public static void main(String[] args) {
        TrafficLight green = new TrafficLight("green", 45);
        TrafficLight red = new TrafficLight("red", 30);
        TrafficLight yellow = new TrafficLight("yellow", 30);
        green.CheckColor();
        yellow.CheckColor();
        red.CheckColor();

    }
}
