package betaTwoProductClass;



public class DigitalProduct extends Product {
    private String format;
    private String downloadLink;

    public DigitalProduct() {
        // calls the parent constructor
        super();
        this.format = "N/A";
        this.downloadLink = "N/A";
    }

    public DigitalProduct(String name, double price, String sku, String format, String downloadLink) {
        // calls the parent constructor
        super(name, price, sku);
        this.format = format;
        this.downloadLink = downloadLink;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getDownloadLink() {
        return downloadLink;
    }

    public void setDownloadLink(String downloadLink) {
        this.downloadLink = downloadLink;
    }

    // other code
    public void displayNetPrice() {
        double tax = calculateSaleTax();
        double netPrice = getPrice() + tax;
        System.out.println("Net Price: $" + netPrice);
    }
}
