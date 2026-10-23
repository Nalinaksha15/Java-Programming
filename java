```java
import java.util.ArrayList;
import java.util.Scanner;

class Product {
    int id;
    String name;
    int quantity;
    int reorderLevel;

    Product(int id, String name, int quantity, int reorderLevel) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.reorderLevel = reorderLevel;
    }

    void display() {
        System.out.printf("%-10d %-20s %-12d %-15d%n",
                id, name, quantity, reorderLevel);
    }
}

public class WarehouseInventory {

    static ArrayList<Product> products = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        // Sample products
        products.add(new Product(101, "Laptop", 15, 5));
        products.add(new Product(102, "Keyboard", 4, 10));
        products.add(new Product(103, "Mouse", 20, 8));

        int choice;

        do {
            System.out.println("\n===== WAREHOUSE INVENTORY SYSTEM =====");
            System.out.println("1. Add Product");
            System.out.println("2. View All Products");
            System.out.println("3. Check Low Stock");
            System.out.println("4. Reorder Stock");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = readInt();

            switch (choice) {
                case 1:
                    addProduct();
                    break;

                case 2:
                    viewProducts();
                    break;

                case 3:
                    checkLowStock();
                    break;

                case 4:
                    reorderStock();
                    break;

                case 5:
                    System.out.println("Thank you for using the system!");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 5);

        sc.close();
    }

    static int readInt() {
        while (!sc.hasNextInt()) {
            System.out.print("Enter a valid number: ");
            sc.next();
        }
        return sc.nextInt();
    }

    static void addProduct() {
        System.out.print("Enter Product ID: ");
        int id = readInt();

        if (findProduct(id) != null) {
            System.out.println("Product ID already exists!");
            return;
        }

        sc.nextLine();

        System.out.print("Enter Product Name: ");
        String name = sc.nextLine().trim();

        if (name.isEmpty()) {
            System.out.println("Product name cannot be empty.");
            return;
        }

        System.out.print("Enter Quantity: ");
        int quantity = readInt();

        System.out.print("Enter Reorder Level: ");
        int level = readInt();

        if (quantity < 0 || level < 0) {
            System.out.println("Quantity and reorder level cannot be negative.");
            return;
        }

        products.add(new Product(id, name, quantity, level));
        System.out.println("Product added successfully!");
    }

    static void viewProducts() {
        if (products.isEmpty()) {
            System.out.println("No products available.");
            return;
        }

        System.out.printf("%-10s %-20s %-12s %-15s%n",
```
