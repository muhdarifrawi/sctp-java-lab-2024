package betaTwoProductClass;

public class Product {
    private String name;
    private double price;
    private String sku;

    public Product() {
        // Default constructor
        this.name = "N/A";
        this.price = 0.0;
        this.sku = "N/A";
    }

    public Product(String name, double price, String sku) {
        this.name = name;
        this.price = price;
        this.sku = sku;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        } else {
            throw new IllegalArgumentException("Invalid price. Please provide a non-negative value.");
        }
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        if (sku != null && !sku.isEmpty()) {
            this.sku = sku;
        } else {
            throw new IllegalArgumentException("Invalid SKU. Please provide a non-empty string.");
        }
    }

    protected double calculateSaleTax() {
        double taxRate = 0.08;
        return price * taxRate;
    }
}
