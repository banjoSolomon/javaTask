package EstoreApp;

import MyEstore.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class EstoreAppTest {
    private Estore e_store;
    private Product product;
    private Admin admin;
    private User user;
    private Seller seller;

    @BeforeEach
    public void setUp() {
        e_store = new Estore("Banjo Solomon", "2468");
        product = new Product("Laptop", 799.99, 289, "This is a high performance gaming laptop.");
        admin = new Admin("Pete Jackson", "4578");
        user = new User("Damsel Dee", "235", 24, "Damseldee@gmail.com", "7, adebare Street Ogudu lagos");
        seller = new Seller("Ore", "2245", "S12345");
    }

    @Test
    public void testUserHasAUserName() {
        assertEquals("Banjo Solomon", e_store.getUserName());

    }

    @Test
    public void testUserHasAage() {
        user = new User("Damsel Dee", "235", 24, "Damseldee@gmail.com", "7, adebare Street Ogudu lagos");
        assertEquals(24, user.getAge());

    }

    @Test
    public void testUserHasAPhoneNumber() {
        user = new User("Damsel Dee", "235", 24, "Damseldee@gmail.com", "7, adebare Street Ogudu lagos");
        assertEquals("Damseldee@gmail.com", user.getEmail());

    }

    @Test
    public void testUserHasHomeAddress() {
        user = new User("Damsel Dee", "235", 24, "Damseldee@gmail.com", "7, adebare Street Ogudu lagos");
        assertEquals("7, adebare Street Ogudu lagos", user.getHomeAddress());

    }



    @Test
    public void testUserNameHasAPassword() {
        e_store = new Estore("Banjo Solomon", "2468");
        user = new User("Damsel Dee", "235", 24, "Damseldee@gmail.com", "7, adebare Street Ogudu lagos");
        String password = "2468";
        e_store.setPassword(password);
        String actualPassword = e_store.getPassword();
        assertEquals(password, actualPassword);

    }

    @Test
    public void testUserVerificationValid() {
        e_store = new Estore("Banjo Solomon", "2468");
        user = new User("Damsel Dee", "235", 24, "Damseldee@gmail.com", "7, adebare Street Ogudu lagos");
        String enteredPassword = "2468";
        boolean isVerificationValid = e_store.verifyUser(enteredPassword);
        assertTrue(isVerificationValid);


    }

    @Test
    public void testUserLoginWithValidCredentials() {
        e_store = new Estore("Banjo Solomon", "2468");
        user = new User("Damsel Dee", "235", 24, "Damseldee@gmail.com", "7, adebare Street Ogudu lagos");
        boolean isLoginSuccessful = e_store.verifyUser("2468");
        assertTrue(isLoginSuccessful, "login should be successful with correct password");
        assertEquals("Banjo Solomon", e_store.getUserName());


    }

    @Test
    public void testUserVerificationInvalid() {
        e_store = new Estore("Banjo Solomon", "2468");
        user = new User("Damsel Dee", "235", 24, "Damseldee@gmail.com", "7, adebare Street Ogudu lagos");
        String enteredPassword = "2567";
        boolean isVerificationInvalid = e_store.VerificationInvalid(enteredPassword);
        assertTrue(isVerificationInvalid);

    }

    @Test
    public void testAddProductToStore() {
        e_store = new Estore("Banjo Solomon", "2468");
        user = new User("Damsel Dee", "235", 24, "Damseldee@gmail.com", "7, adebare Street Ogudu lagos");
        product = new Product("Laptop", 799.99, 289, "This is a high performance gaming laptop.");
        e_store.addProduct(product);
        List<Product> products = e_store.getProduct();
        assertEquals(1, products.size());
        assertEquals(product, products.get(0));

    }

    @Test
    public void testGetProductName() {
        user = new User("Damsel Dee", "235", 24, "Damseldee@gmail.com", "7, adebare Street Ogudu lagos");
        e_store = new Estore("Banjo Solomon", "2468");
        product = new Product("Laptop", 799.99, 289, "This is a high performance gaming laptop.");
        assertEquals("Laptop", product.getProductName());

    }

    @Test
    public void testGetProductPrice() {
        user = new User("Damsel Dee", "235", 24, "Damseldee@gmail.com", "7, adebare Street Ogudu lagos");
        e_store = new Estore("Banjo Solomon", "2468");
        product = new Product("Laptop", 799.99, 289, "This is a high performance gaming laptop.");
        assertEquals(799.99, product.getPrice());

    }

    @Test
    public void testProductHasA_Id() {
        user = new User("Damsel Dee", "235", 24, "Damseldee@gmail.com", "7, adebare Street Ogudu lagos");
        e_store = new Estore("Banjo Solomon", "2468");
        product = new Product("Laptop", 799.99, 289, "This is a high performance gaming laptop.");
        assertNotNull(product.getProductId());
        assertTrue(product.getProductId() > 0);


    }

    @Test
    public void testProductDescription() {
        String expectedDescription = "This is a high performance gaming laptop with advance features.";
        product = new Product("Laptop", 799.99, 289, "This is a high performance gaming laptop.");
        product.setProductDescription(expectedDescription);
        assertEquals(expectedDescription, product.getProductDescription());

    }

    @Test
    public void testForInvalid_Id() {
        try {
            product = new Product("Invalid Laptop", 799.99, -1, "This is an invalid product.");
            fail("Expected InvalidProductIdException was not thrown");


        } catch (InvalidProductIdException solomon) {
            assertEquals("Invalid product ID", solomon.getMessage());
        }

    }

    @Test
    public void testForProductCategory() {
        e_store = new Estore("Banjo Solomon", "2468");
        Product laptop = new Product("Laptop", 888.99, 289, "This is a high performance gaming laptop.");
        Product phone = new Product("Phone", 799.99, 289, "This is a high performance I-Phone.");
        Product seaFood = new Product("seaFood", 399.99, 289, "very rich in taste.");
        Product spoon = new Product("spoon", 199.99, 289, "very good quality.");
        Product Blouses = new Product("Blouses", 699.99, 289, "very good quality dress.");

        spoon.setCategory(ProductCategory.UTENSILS.name());
        seaFood.setCategory(ProductCategory.GROCERIES.name());
        laptop.setCategory(ProductCategory.ELECTRONICS.name());
        phone.setCategory(ProductCategory.ELECTRONICS.name());
        Blouses.setCategory(ProductCategory.CLOTHING.name());
        e_store.addProduct(laptop);
        e_store.addProduct(phone);
        e_store.addProduct(seaFood);
        e_store.addProduct(spoon);
        e_store.addProduct(Blouses);

        assertEquals(ProductCategory.ELECTRONICS.name(), laptop.getCategory());
        assertEquals(ProductCategory.ELECTRONICS.name(), phone.getCategory());
        assertEquals(ProductCategory.GROCERIES.name(), seaFood.getCategory());
        assertEquals(ProductCategory.UTENSILS.name(), spoon.getCategory());
        assertEquals(ProductCategory.CLOTHING.name(), Blouses.getCategory());


    }

    @Test
    public void testUpdatingProductWithoutExistingProduct() {
        e_store = new Estore("Banjo Solomon", "2468");
        int notExistingProductId = 123;
        double newPrice = 999.99;
        String newDescription = "Update description";
        e_store.updateProduct(notExistingProductId, newPrice, newDescription);
        Product notExistingProduct = e_store.getProductById(notExistingProductId);
        assertNull(notExistingProduct);


    }

    @Test
    public void testUpdateProduct() {
        e_store = new Estore("Banjo Solomon", "2468");
        product = new Product("Laptop", 799.99, 289, "This is a high performance gaming laptop.");
        e_store.addProduct(product);

        String newDescription = "This is an updated Gaming laptop.";
        double newPrice = 929.99;
        e_store.updateProduct(product.getProductId(), newPrice, newDescription);
        Product updatedProduct = e_store.getProductById(product.getProductId());
        assertEquals(newDescription, updatedProduct.getProductDescription());
        assertEquals(newPrice, updatedProduct.getPrice());
    }

    @Test
    public void testAddToCart() {
        e_store = new Estore("Banjo Solomon", "2468");
        Product laptop = new Product("Laptop", 799.99, 289, "This is a high performance gaming laptop.");
        e_store.addToCart(laptop);
        List<Product> cartProducts = e_store.getCartProducts();

        assertEquals(1, cartProducts.size());
        assertEquals(laptop, cartProducts.get(0));

    }

    @Test
    public void testAddTwoInToTheCart() {
        e_store = new Estore("Banjo Solomon", "2468");
        Product laptop = new Product("Laptop", 888.99, 289, "This is a high performance gaming laptop.");
        Product iphone = new Product("I-Phone", 799.99, 289, "This is a high performance I-Phone.");
        e_store.addToCart(laptop);
        e_store.addToCart(iphone);
        List<Product> cartProducts = e_store.getCartProducts();
        assertEquals(2, cartProducts.size());
        assertEquals(laptop, cartProducts.get(0));
        assertEquals(iphone, cartProducts.get(1));

    }

    @Test
    public void testInvalidProductVerification() {
        e_store = new Estore("Banjo Solomon", "2468");

        try {

            product = new Product("Invalid Laptop", -799.99, -1, "This is an invalid product.");
            fail("Expected InvalidProductIdException or NegativeProductPriceException was not thrown");
        } catch (InvalidProductIdException | NegativeProductPriceException e) {
            assertTrue(true);
        } catch (Exception e) {
            fail("Unexpected exception was thrown: " + e.getClass().getSimpleName());
        }

        assertEquals(0, e_store.getProduct().size());
    }

    @Test
    public void testCheckOutWithoutProductsInTheCart() {
        e_store = new Estore("Banjo Solomon", "2468");
        boolean checkoutResult = e_store.checkOut();
        assertFalse(checkoutResult, "Checkout should fail when there are no products in the cart");
        assertEquals(0, e_store.getCartProducts().size());


    }


    @Test
    public void testCheckOutWithValidData() {
        e_store = new Estore("Banjo Solomon", "2468");
        user = new User("Damsel Dee", "235", 24, "Damseldee@gmail.com", "7, adebare Street Ogudu lagos");
        Product laptop = new Product("Laptop", 888.99, 289, "This is a high performance gaming laptop.");
        Product iphone = new Product("I-Phone", 799.99, 289, "This is a high performance I-Phone.");
        e_store.addToCart(laptop);
        e_store.addToCart(iphone);

        boolean isCheckoutSuccessful = e_store.checkOut();
        assertTrue(isCheckoutSuccessful);
        List<Product> cartProductsAfterCheckout = e_store.getCartProducts();
        assertTrue(cartProductsAfterCheckout.isEmpty());

    }


    @Test
    public void testRemoveFromCart() {
        e_store = new Estore("Banjo Solomon", "2468");
        Product laptop = new Product("Laptop", 888.99, 289, "This is a high performance gaming laptop.");
        Product iphone = new Product("I-Phone", 799.99, 289, "This is a high performance I-Phone.");
        e_store.addToCart(laptop);
        e_store.addToCart(iphone);
        List<Product> cartProductsBeforeRemoval = e_store.getCartProducts();
        assertEquals(2, cartProductsBeforeRemoval.size());
        assertTrue(cartProductsBeforeRemoval.contains(laptop));
        assertTrue(cartProductsBeforeRemoval.contains(iphone));

        e_store.removeFromCart(laptop);
        List<Product> cartProductsAfterRemoval = e_store.getCartProducts();
        assertEquals(1, cartProductsAfterRemoval.size());
        assertFalse(cartProductsAfterRemoval.contains(laptop));
        assertTrue(cartProductsAfterRemoval.contains(iphone));

    }

    @Test
    public void testAdminHasAUserName() {
        assertEquals("Pete Jackson", admin.getUserName());

    }

    @Test
    public void testSellerHasAnId() {
        seller = new Seller("Ore", "2245", "S12345");
        assertEquals("S12345", seller.getSellerId());

    }


}








