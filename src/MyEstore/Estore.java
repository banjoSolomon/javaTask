package MyEstore;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Estore {
    private String userName;
    private String password;
    private List<Product> products = new ArrayList<>();
    private List<Product> cart = new ArrayList<>();

    public Estore(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean verifyUser(String password) {
        return password.equals(this.password);
    }

    public boolean VerificationInvalid(String enteredPassword) {
        return !enteredPassword.equals(this.password);
    }

    public List<Product> getProduct() {
        return products;

    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void updateProduct(int productId, double newPrice, String newDescription) {
        if (products != null) {
            for (Product product : products) {
                if (product.getProductId() == productId) {
                    product.setPrice(newPrice);
                    product.setProductDescription(newDescription);
                    break;

                }
            }
        }
    }

    public Product getProductById(int productId) {
        if (products != null) {
            for (Product product : products) {
                if (product.getProductId() == productId) {
                    return product;
                }
            }
        }
        return null;
    }

    public void addToCart(Product product) {
        cart.add(product);

    }

    public List<Product> getCartProducts() {
        return new ArrayList<>(cart);
    }

    public void removeFromCart(Product product) {
        cart.remove(product);
    }

    public boolean checkOut() {
        if (cart.isEmpty()) return false;
        cart.clear();
        return true;
    }


}
