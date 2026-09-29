import java.util.*;

public class ProductInventory {

    static Map<Integer, String> products = new LinkedHashMap<>();

    static Map<Integer, Integer> stock = new LinkedHashMap<>();

    public static void addProduct(int id, String name, int quantity) {
        products.put(id, name);
        stock.put(id, quantity);
    }

    public static void updateStock(int id, int quantity) {
        if (products.containsKey(id)) {
            stock.put(id, quantity);
            System.out.println("Stock updated successfully.");
        } else {
            System.out.println("Product not found.");
        }
    }

    public static void removeProduct(int id) {
        if (products.containsKey(id)) {
            products.remove(id);
            stock.remove(id);
            System.out.println("Product removed successfully.");
        } else {
            System.out.println("Product not found.");
        }
    }


    public static boolean checkProduct(int id) {
        return products.containsKey(id);
    }

    public static void displayProducts() {
        for (Integer id : products.keySet()) {
            System.out.println(
                "ID: " + id +
                ", Name: " + products.get(id) +
                ", Quantity: " + stock.get(id)
            );
        }
    }

    // Driver code
    public static void main(String[] args) {

        addProduct(101, "Laptop", 10);
        addProduct(102, "Mouse", 25);
        addProduct(103, "Keyboard", 15);
        addProduct(104, "Monitor", 8);

        System.out.println("----- Product Inventory -----");
        displayProducts();

        System.out.println("\nChecking Product 102:");
        if (checkProduct(102)) {
            System.out.println("Product is available.");
        } else {
            System.out.println("Product is not available.");
        }

        System.out.println("\nUpdating stock of Product 102:");
        updateStock(102, 40);

        System.out.println("\nRemoving Product 103:");
        removeProduct(103);

        System.out.println("\n----- Updated Product Inventory -----");
        displayProducts();
    }
}