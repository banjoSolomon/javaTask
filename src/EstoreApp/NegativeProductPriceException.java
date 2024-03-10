package EstoreApp;

public class NegativeProductPriceException extends RuntimeException {
    public NegativeProductPriceException(String message) {
        super(message);
    }
}
