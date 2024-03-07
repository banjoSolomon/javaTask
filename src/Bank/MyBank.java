package Bank;

import java.util.ArrayList;
import java.util.List;

public class MyBank {
    private String name;
    private List<Account> accounts;
    private int customerCount;

    public MyBank(){
        this.accounts = new ArrayList<>();
        this.customerCount = 0;
    }
    public void setName(String expectedName) {
        this.name = expectedName;

    }

    public String getName() {
        return name;
    }

    public void addAccount(Account account) {
        this.accounts.add(account);

    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void deposit(Account account, int depositAmount) {
        account.deposit(depositAmount);
    }

    public void transfer(Account accountSending, Account accountReceiving, int amount) {
        if(accountSending.getBalance() >= amount){
            accountSending.withdraw(amount);
            accountReceiving.deposit(amount);
        }else{
            throw new IllegalArgumentException("Insufficient funds for transfer");
        }
    }

    public void registerCustomer(String firstName, String lastName, String pin) {
         ++customerCount;

    }



    public int getCustomerCount() {
        return customerCount;
    }

    public void removeAccount(Account account) {
        this.accounts.remove(account);
    }

    public Account findAccount(String accountName) {
        for(Account account : accounts)
            if(account.getName().equals(accountName))
                return account;


        return null;
    }

    public void withdraw(Account myAccount, int withdrawalAmount) {
        myAccount.withdraw(withdrawalAmount);
    }
}
