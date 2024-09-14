package epsilonAbstractAndInterface;

import java.util.Scanner;

public class PhysicalProduct extends Product {
    private String size;
    private double weight;
    private String color;

    public PhysicalProduct() {
        // calls the parent constructor
        super();
        this.size = "N/A";
        this.weight = 0.0;
        this.color = "N/A";
    }

    public PhysicalProduct(String name, double price, String sku, String size, double weight, String color) {
        // calls the parent constructor
        super(name, price, sku);
        this.size = size;
        this.weight = weight;
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Physical Product Size: " + getSize());
        System.out.println("Physical Product Weight: " + getWeight());
        System.out.println("Phyical Product Color: " + getColor());
    }

    @Override
    public void editDetails() {
        super.editDetails();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the new size: ");
        String newSize = scanner.nextLine();
        this.setSize(newSize);

        System.out.print("Enter the new weight: ");
        double newWeight = scanner.nextDouble();
        this.setWeight(newWeight);

        scanner.nextLine();
        System.out.print("Enter the new color: ");
        String newColor = scanner.nextLine();
        this.setColor(newColor);
    }

}
