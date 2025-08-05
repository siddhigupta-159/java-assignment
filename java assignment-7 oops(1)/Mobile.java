// Mobile Phone Store
// Create a class Mobile with fields: brand, model, price.
// Use setters to set values. Create a method to check if phone is affordable (price < 20000).
 class Phone {
    private String brand;
    private String model;
    private double price;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isAffordable() {
        if (price<=28000)
            return true;
        return false;
    }

    public void display() {
        System.out.println("Mobile Brand: " + brand);
        System.out.println("Mobile Model: " + model);
        System.out.println("Mobile Price: " + price);
        System.out.println("Is Affordable: " + (isAffordable()));
    }
}
class Mobile{
    public static void main(String args[]){
        Phone obj=new Phone();
        obj.setBrand("Motorolla");
        obj.setModel("Edge 50 Fusion");
        obj.setPrice(27500);
        obj.isAffordable();
        obj.display();

    }
}
