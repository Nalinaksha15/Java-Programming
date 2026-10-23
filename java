```java
import java.util.*;

class Product {
    int productId;
    String productName;
    int quantity;
    int minLevel;

    Product(int productId, String productName, int quantity, int minLevel) {
        this.productId = productId;
        this.productName = productName;
        this.quantity = quantity;
        this.minLevel = minLevel;
    }
}

public class InventorySystem {
    static Scanner input = new Scanner(System.in);
    static ArrayList<Product> itemsList = new ArrayList<>();

    public static void main(String[] args) {
        int option;

        do {
            System.out.println("\n=== Inventory Management ===");
            System.out.println("1. Add Product");
            System.out.println("2. Show Products");
            System.out.println("3. Issue Product");
            System.out.println("4. Reorder Check");
            System.out.println("5. Exit");

            System.out.print("Choose option: ");
            option = input.nextInt();

            switch (option) {
                case 1:
                    addProduct();
                    break;

                case 2:
                    displayProducts();
                    break;

                case 3:
                    issueProduct();
                    break;

                case 4:
                    checkStockLevel();
                    break;

                case 5:
                    System.out.println("Program ended...");
                    break;

                default:
                    System.out.println("Wrong choice!");
            }
        } while (option != 5);
    }

    // method to add new product
    static void addProduct() {
        System.out.print("Enter Product ID: ");
        int id = input.nextInt();
        input.nextLine();

        System.out.print("Enter Product Name: ");
        String name = input.nextLine();

        System.out.print("Enter Quantity: ");
        int qty = input.nextInt();

        System.out.print("Enter Minimum Level: ");
        int level = input.nextInt();

        itemsList.add(new Product(id, name, qty, level));

        System.out.println("Product added successfully!");
    }

    // method to display all products
    static void displayProducts() {
        if (itemsList.isEmpty()) {
            System.out.println("No products found!");
            return;
        }

        for
```
