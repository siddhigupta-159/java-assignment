// Product Inventory
// Create a class Product with fields: productId, name, quantity, price.
// Use setters to assign values. Add a method to calculate total value (quantity * price).

 class Inventry {
    private int productId;
    private String name;
    private int quantity;
    private double price;

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double TotalValue() {
        return quantity * price;
    }
    
    public void display() {
        System.out.println("Product ID: " + this.productId);
        System.out.println("Product Name: " + name);
        System.out.println("Product Quantity: " + quantity);
        System.out.println("Product Price: " + price);
        System.out.println("Total Value: " + TotalValue());
    }
}
  
    class Product{
        public static void main(String args[]){
            Inventry obj=new Inventry();
            obj.setProductId(5246);
            obj.setName("Himalya Cream");
            obj.setQuantity(2);
            obj.setPrice(108);
            obj.TotalValue();
            obj.display();
        }
    }
