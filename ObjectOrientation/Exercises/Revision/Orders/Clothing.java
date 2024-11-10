package ObjectOrientation.Exercises.Revision.Orders;

public class Clothing extends Product {

    public Clothing(int id, String name, double price) {
        super(id, name, price);
    }

    @Override
    public double calculateDiscount() {
        return this.price * 0.80;
    }
}
