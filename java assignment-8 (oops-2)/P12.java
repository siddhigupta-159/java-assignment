// 12. Write a Java program to create a class called "Airplane" with a flight number, destination, and 
// departure time attributes, and methods to check flight status and delay.

class Airplane {
    private int flightnumber;
    private String destination;
    private double departuretime;
    private double currenttime;

    public Airplane(int flightnumber, String destination, double departuretime, double currenttime) {
        this.flightnumber = flightnumber;
        this.destination = destination;
        this.departuretime = departuretime;
        this.currenttime = currenttime;
    }

    public void getDetails() {
        System.out.println("Flight Number :" + this.flightnumber + " " + "Destination :" + this.destination + " "
                + "Departure Timer :" + this.departuretime);
    }

    public void checkflightStatus() {
        if (departuretime == currenttime) {
            System.out.println("flight is on time");
        } else if (departuretime >= currenttime) {
            System.out.println("flight is delay");
        } else {
            System.out.println("flight is early");
        }
    }
}

class P12 {
    public static void main(String[] args) {
        Airplane A = new Airplane(2252, "Dubai", 5.29, 4.30);
        Airplane B = new Airplane(2310, "Goa", 2.30, 2.30);
        Airplane C = new Airplane(2256, "PUNE", 2.30, 3.30);
        A.checkflightStatus();
        B.checkflightStatus();
        C.checkflightStatus();
    }
}
