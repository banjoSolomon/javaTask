package MyEstore;

import java.util.Scanner;

public class CreditCard {
    public static void main(String[] args) {
        CreditCardNumber creditCard = new CreditCardNumber();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Your Credit Card Number");
        String creditCardNumber = input.nextLine();

        while (creditCardNumber.length() < 13 || creditCardNumber.length() > 16) {
            System.out.println("Enter Your Credit Card Number");
            creditCardNumber = input.nextLine();

        }

        creditCard.setCreditCardNumber(creditCardNumber);
        creditCard.getCreditCardNumber();

        int cardLength = creditCard.lenghtOfCard();
        long[] cardNumber = creditCard.creditCardLongNumberArray();
        String card = creditCard.typeOfCard(cardNumber);

        long doubleNumber = creditCard.longDoubleNumbers(cardNumber);
        long oddNumber = creditCard.longOddNumbers(cardNumber);

        String validNumber = creditCard.creditCardValidity(doubleNumber, oddNumber);


        System.out.println("*****************************************");
        System.out.println("**Credit Card Type : " + card);
        System.out.println("**Credit Card Number: " + creditCard.getCreditCardNumber());
        System.out.println("**Credit Card Digit Length: " + cardLength);
        System.out.println("**Credit Card Validity Status: " + validNumber);
        System.out.println("*****************************************");


    }
}
