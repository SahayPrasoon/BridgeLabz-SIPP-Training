class Product {
    
    final int productID;
    String productName;
    double price;
    int quantity;

    
    static double discount = 10.0; 
    static int idCounter = 1;      
    
    Product(String productName, double price, int quantity) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.productID = idCounter++; 
    }

    
    static void updateDiscount(double newDiscount) {
        discount = newDiscount;
        System.out.println("Discount updated to " + discount + "%");
    }

    
    void displayProductDetails() {
        double discountedPrice = price - (price * discount / 100);
        System.out.println("\n--- Product Details ---");
        System.out.println("Product ID   : " + productID);
        System.out.println("Product Name : " + productName);
        System.out.println("Price        : " + price);
        System.out.println("Discounted   : " + discountedPrice);
        System.out.println("Quantity     : " + quantity);
    }

    
    static void processProduct(Object obj) {
        if (obj instanceof Product) {
            Product p = (Product) obj;
            p.displayProductDetails();
        } else {
            System.out.println("The object is not a Product.");
        }
    }
}
public class ShoppingCartSystem {
    public static void main(String[] args) {
        
        Product item1 = new Product("Bluetooth Speaker", 1500.0, 2);
        Product item2 = new Product("Wireless Mouse", 700.0, 1);

        
        item1.displayProductDetails();
        item2.displayProductDetails();

        
        Product.updateDiscount(15.0);

        
        Product.processProduct(item1);

       
        String notAProduct = "Hello";
        Product.processProduct(notAProduct);
    }
}
