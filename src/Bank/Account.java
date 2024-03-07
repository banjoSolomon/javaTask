package Bank;

public class Account {
    private  int balance;
    private String accountName;
    private  static int  nextAccountNumber = 1;
    private int accountNumber;
    private static final int PIN_LENGTH = 4;
    private boolean pin;

    public Account(String accountName, String pin, String balance, int accountNumber) {
        this.accountNumber = nextAccountNumber++;
        this.balance = 0;
        this.accountName = accountName;
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int depositAmount) {
        balance += depositAmount;
    }

    public void withdraw(int amount) {

        if(balance >= amount)
            balance -= amount;
        else throw new IllegalArgumentException("Insufficient funds");
    }


    public String getName() {
        return accountName;
    }

    public void setPin(String expectedPin) {
        if(expectedPin.length() != PIN_LENGTH)throw new IllegalArgumentException("PIN should be four digit number");
    }



    public int getAccountNumber() {
        return accountNumber;
    }


}
