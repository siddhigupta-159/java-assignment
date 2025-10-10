// Car Info Manager
// Create a class Car with fields: brand, model, and year.
// Use setters to assign values. Create a method to print full car info.

class Fields {
    private String brand;
    private String model;
    private int year;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void display() {
        System.out.println("Car Brand: " + brand);
        System.out.println("Car Model: " + model);
        System.out.println("Car Year: " + year);
    }
}

class Car {
    public static void main(String[] args) {
        Fields obj=new Fields();
        obj.setBrand("fortunar");
        obj.setModel("GRS");
        obj.setYear(2022);
        obj.display();
    }
}
