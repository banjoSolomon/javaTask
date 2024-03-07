package BankApp;

public class Calculator {


    public int calculateDelivery(int successfulDeliveries) {
        int result = 0;
        if (successfulDeliveries < 50) {
            result = (successfulDeliveries * 160) + 5000;
        }

        if (successfulDeliveries > 50 && successfulDeliveries <= 59) {
            result = (successfulDeliveries * 200)+ 5000;
        }
        if (successfulDeliveries > 60 && successfulDeliveries <= 69) {
            result = (successfulDeliveries * 250)+ 5000;
        }
        if (successfulDeliveries >= 70) {
            result = (successfulDeliveries * 500) + 5000;
        }
        return result;

   }

}