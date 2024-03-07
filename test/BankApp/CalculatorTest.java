package BankApp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    @Test
    public void testThatFunctionReturnsAllowanceForEachPercentageRange(){
        Calculator myCalculator = new Calculator();
        assertEquals(45_000, myCalculator.calculateDelivery(80));
        assertEquals(9_000, myCalculator.calculateDelivery(25));
        assertEquals(16_000, myCalculator.calculateDelivery(55));
        assertEquals(22_000, myCalculator.calculateDelivery(68));
  }
}