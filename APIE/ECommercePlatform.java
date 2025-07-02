
import java.util.*;

interface Taxable {
    double calculateTax();
    String getTaxDetails();
}

abstract class Product {
    private int productId;
    private String name;
    private double price;

    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    public int getProductId() { return productId; }
    public String getName() { return name; }
    public double getPrice() { return price; }

    public abstract double calculateDiscount();

    public double getFinalPrice() {
        return price + (this instanceof Taxable ? ((Taxable) this).calculateTax() : 0) - calculateDiscount();
    }
}

class Electronics extends Product implements Taxable {
    public Electronics(int id, String name, double price) { super(id, name, price); }

    public double calculateDiscount() { return getPrice() * 0.10; }
    public double calculateTax() { return getPrice() * 0.18; }
    public String getTaxDetails() { return "18% GST on Electronics"; }
}

class Clothing extends Product {
    public Clothing(int id, String name, double price) { super(id, name, price); }

    public double calculateDiscount() { return getPrice() * 0.20; }
}

class Groceries extends Product {
    public Groceries(int id, String name, double price) { super(id, name, price); }

    public double calculateDiscount() { return getPrice() * 0.05; }
}

public class ECommercePlatform {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Electronics(1, "Laptop", 50000));
        products.add(new Clothing(2, "Shirt", 2000));
        products.add(new Groceries(3, "Rice", 1000));

        for (Product p : products) {
            System.out.println("Product: " + p.getName() + ", Final Price: " + p.getFinalPrice());
        }
    }
}
