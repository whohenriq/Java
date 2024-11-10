package ObjectOrientation.Exercises.Revision.Orders;

public abstract class Product {
    public int id;
    public String name;
    public double price;

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    // Methods

    public abstract double calculateDiscount();

}
