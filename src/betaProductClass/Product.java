package betaProductClass;

public class Product {
    private String name;
    private double price;
    private String sku;

    /** This is the constructor
     */
    public Product(){
        this.name = "N/A";
        this.price = 0.0;
        this.sku = "N/A";
    }

    /** This is the overload constructor
     */
    public Product(String name, double price, String sku){
        this.name = name;
        this.price = price;
        this.sku = sku;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws IllegalArgumentException {
        if (name != null && !name.isEmpty() && name.contains(" ")) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("Invalid name. Please provide a non-empty string.");
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) throws IllegalArgumentException {
        if (price >= 0) {
            this.price = price;
        } else {
            throw new IllegalArgumentException("Invalid price. Please provide a non-negative value.");
        }
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) throws IllegalArgumentException {
        if (sku != null && !sku.isEmpty() && sku.contains(" ")) {
            this.sku = sku;
        } else {
            throw new IllegalArgumentException("Invalid SKU. Please provide a non-empty string.");
        }
    }

}
