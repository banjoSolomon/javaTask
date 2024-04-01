package MyEstore;

public class CreditCardNumber {
    private String creditCardNumber;

    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;

    }

    public long[] creditCardLongNumberArray() {
        long creditCardLong = Long.parseLong(creditCardNumber);

        long[] creditCard = new long[creditCardNumber.length()];
        int index = creditCardNumber.length() - 1;


        for (int i = 0; i < creditCardNumber.length(); i++) {
            creditCard[index] = creditCardLong % 10;

            creditCardLong = creditCardLong / 10;

            index--;

        }
        return creditCard;

    }

    public String typeOfCard(long[] creditCard) {
        String cardType = "INVALID CARD";
        if (creditCard[0] == 4) {
            cardType = "Visa Cards";
        }

        if (creditCard[0] == 5) {
            cardType = "Master Card";
        }

        if (creditCard[0] == 6) {
            cardType = "Discover Cards";
        }
        if (creditCard[0] == 3 && creditCard[1] == 7) {
            cardType = "American Express";
        }
        return cardType;
    }


    public int lenghtOfCard() {
        int lengthOfCard = creditCardNumber.length();
        return lengthOfCard;
    }


    public long longDoubleNumbers(long[] creditCardLongNumberArray) {
        int index = creditCardLongNumberArray.length - 2;
        long total = 0;
        for (; index >= 0; index -= 2) {

            long separate = creditCardLongNumberArray[index] * 2;
            if (separate > 9) {
                separate = (separate % 10) + 1;

            }

            total += separate;

        }
        return total;
    }

    public long longOddNumbers(long[] creditCardLongNumberArray) {
        int index = creditCardLongNumberArray.length - 1;
        long total = 0;
        for (; index >= 0; index -= 2) {
            total += creditCardLongNumberArray[index];

        }
        return total;
    }

    public String creditCardValidity(long sum1, long sum2) {
        long sumTotal = sum1 + sum2;
        String validityStatus = "INVALID ";

        if (sumTotal % 10 == 0) {
            validityStatus = "Valid";
        }

        return validityStatus;
    }


}

