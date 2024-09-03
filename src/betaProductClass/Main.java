package betaProductClass;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<Product> productList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        do {
            int choice = displayMenu();
            if (choice == 1) {
                addNewProduct();
            } else if (choice == 2) {
                displayProducts();
            } else if (choice == 3) {
                break;
            }
        } while (true);
    }

    private static int displayMenu() {
        int choice = 0;

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Add a product");
            System.out.println("2. List all products");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); //consume the newline character in the buffer
            if (choice >= 1 && choice <=3) {
                break;
            }
        }
        return choice;
    }

    private static void addNewProduct() {

        System.out.print("Enter the name of the product: ");
        String name = scanner.nextLine();
        System.out.print("Enter the price of the product: ");
        double price = scanner.nextDouble();
        scanner.nextLine(); // consume the newline character in the buffer
        System.out.print("Enter the SKU of the product: ");
        String sku = scanner.nextLine();

        Product product = new Product(name, price, sku);

        productList.add(product);
        System.out.println("Product added successfully!");
    }

    private static void displayProducts() {
        System.out.println("List of Products:");
        for (Product product : productList) {
            System.out.println("Name: " + product.getName());
            System.out.println("Price: $" + product.getPrice());
            System.out.println("SKU: " + product.getSku());
            System.out.println("-------------------");
        }
    }
}
