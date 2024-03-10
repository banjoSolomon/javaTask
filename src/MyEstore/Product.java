package MyEstore;

import EstoreApp.InvalidProductIdException;
import EstoreApp.NegativeProductPriceException;

public class Product {
    private static int nextProductId = 1;
    private int productId;
    private String productName;
    private Double price;
    private String productDescription;
    private String category;

    public Product(String productName, double price, int productId, String productDescription) {
        if (productId <= 0) {
            throw new InvalidProductIdException("Invalid product ID");
        }

        this.productDescription = productDescription;
        this.productName = productName;
        this.price = price;
        this.productId = ++nextProductId;
    }


    public String getProductName() {
        return productName;
    }

    public double getPrice() {

        return price;
    }

    public void setPrice(double newPrice) {
        price = newPrice;
    }

    public int getProductId() {
        return productId;
    }

    public String getProductDescription() {
        return productDescription;


    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
