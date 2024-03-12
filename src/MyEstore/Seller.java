package MyEstore;
import java.util.*;

public class Seller extends Admin {
    private String sellerId;

    public Seller(String userName, String password, String sellerId) {
        super(userName, password);
        this.sellerId = sellerId;
    }

    public String getSellerId() {
        return sellerId;
    }
}
