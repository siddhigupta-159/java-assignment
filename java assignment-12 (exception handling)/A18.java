// 8. Shopping Cart
// While calculating total price, one product’s price is missing (null).
// What exception will occur?
// How would you handle it? (Default price, error message, or skip item?)

class Testmain {
    public static void main(String[] args) {
        Double[] prices = { 100.0, null, 250.0, 50.0 };
        double total = 0;

        for (int i = 0; i < prices.length; i++) {
            try {

                total += prices[i];
            } catch (NullPointerException e) {
                e.printStackTrace();
                System.out.println("Price missing for product at index " + i + ". Using default price 0.");
                total += 0;
            }
        }

        System.out.println("Total price: " + total);
        System.out.println("Program continues...");
    }
}
