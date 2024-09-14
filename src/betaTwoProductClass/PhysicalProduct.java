package betaTwoProductClass;



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

    public void displayNetPrice() {
        double tax = calculateSaleTax();
        double netPrice = getPrice() + tax;
        System.out.println("Net Price: $" + netPrice);
    }
}
