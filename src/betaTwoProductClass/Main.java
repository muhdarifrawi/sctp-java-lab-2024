package betaTwoProductClass;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static ArrayList<Product> productList = new ArrayList<>();
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
            if (choice >= 1 && choice <= 3) {
                break;
            }
        }
        return choice;
    }

    private static void addNewProduct() {
        System.out.println("Enter the name of the product: ");
        String name = scanner.nextLine();
        System.out.println("Enter the price of the product: ");
        double price = scanner.nextDouble();
        scanner.nextLine(); // consume the newline character remaining in the buffer
        System.out.println("Enter the SKU of the product: ");
        String sku = scanner.nextLine();

        while(true) {
            System.out.println("Choose the type of product: ");
            System.out.println("1. Physical Product");
            System.out.println("2. Digital Product");
            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.println("Enter the size of the physical product: ");
                String size = scanner.nextLine();
                System.out.println("Enter the weight of the physical product: ");
                double weight = scanner.nextDouble();
                scanner.nextLine(); // consume the newline character remaining in the buffer
                System.out.println("Enter the color of the physical product: ");
                String color = scanner.nextLine();

                PhysicalProduct physicalProduct = new PhysicalProduct(name, price, sku, size, weight, color);
                productList.add(physicalProduct);
                System.out.println("Physical product added successfully!");
                break;
            } else if (choice == 2) {
                System.out.println("Enter the format of the digital product: ");
                String format = scanner.nextLine();
                System.out.println("Enter the download link of the digital product: ");
                String downloadLink = scanner.nextLine();

                DigitalProduct digitalProduct = new DigitalProduct(name, price, sku, format, downloadLink);
                productList.add(digitalProduct);
                System.out.println("Digital product added successfully!");
                break;
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }
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
