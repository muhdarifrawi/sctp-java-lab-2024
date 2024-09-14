package deltaPolymorphism;

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
                displayProducts(productList);
            } else if (choice == 3) {
                break;
            }
        } while (true);
    }

    private static int displayMenu() {
        int choice = 0;

        while (true) {
            System.out.println("==================");
            System.out.println("+ Menu           +");
            System.out.println("==================");
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
            System.out.println("Enter your choice: ");
            int choice = scanner.nextInt();

            if (choice == 1) {
                scanner.nextLine();
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
                scanner.nextLine();
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

    public static void displayProducts(ArrayList<Product> productList) {
        for (int i = 0; i < productList.size(); i++) {
            Product p = productList.get(i);
            // print out the index
            System.out.println("====================");
            System.out.println("Product Index # " + i);
            System.out.println("====================");
            p.displayDetails();
            System.out.println();
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose an option:");
        System.out.println("1. Exit");
        System.out.println("2. Edit a product");
        System.out.println("3. Delete a product");
        System.out.println("Enter option: ");
        int option = scanner.nextInt();

        if (option == 2) {
            System.out.print("Enter the index of the product you want to edit: ");
            int index = scanner.nextInt();
            if (index >= 0 && index < productList.size()) {
                Product productToEdit = productList.get(index);
                editProduct(productToEdit);
            } else {
                System.out.println("Invalid index.");
            }
        } else if (option == 3) {
            System.out.print("Enter the index of the product you want to delete: ");
            int index = scanner.nextInt();
            if (index >= 0 && index < productList.size()) {
                productList.remove(index);
                System.out.println("Product deleted.");
            } else {
                System.out.println("Invalid index.");
            }
        }
    }



    public static void editProduct(Product p){
        p.editDetails();
    }


}