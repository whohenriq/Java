package ObjectOrientation.Exercises.Revision.Orders;

public class Electronic extends Product {

    public Electronic(int id, String name, double price) {
        super(id, name, price);
    }

    @Override
    public double calculateDiscount() {
        return this.price * 0.90;
    }
}
