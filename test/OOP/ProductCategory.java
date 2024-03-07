package OOP;

public enum ProductCategory {
    ELECTRONICS("Laptops", "Telephone", "Radios", "Television", "HeadPhone", "PlayStation 5", "DvD"),
    GROCERIES("Bread", "Meat", "Oils", "Soups", "Frozen Foods", "Cheese", "Egg", "Pasta/Rice", "Sea Food"),
    UTENSILS("Knife", "Spoon", "Fork", "Plate", "Mixing Bowls", "Pexels", "Glass Cup", "Stainless Steel"),
    CLOTHING("Sweaters", "Shirts", "Costume", "Garments", "Casual Wear", "Formal Wear", "Blouses", "Tank Tops");
    private String[] Products;

    public void setProducts(String...products) {
        Products = products;
    }

    public String[] getProducts() {
        return Products;
    }

    ProductCategory(String... Products) {
        this.Products = Products;


    }

}