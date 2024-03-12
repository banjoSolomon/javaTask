package Bank;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        mainMenu();


    }

    public static void mainMenu() {
        MyBank bank = new MyBank();
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        while (choice != 6) {
            printMainMenu();
            System.out.print("Choose an option (1-6): ");
            choice = scanner.nextInt();
            if (choice == 1) {
                openAccount(bank, scanner);
            } else if (choice == 2) {
                closeAccount(bank, scanner);
            } else if (choice == 3) {
                deposit(bank, scanner);
            } else if (choice == 4) {
                withdraw(bank, scanner);
            } else if (choice == 5) {
                transfer(bank, scanner);
            } else if (choice == 6) {
                checkBalance(bank, scanner);

            } else if (choice == 7) {
                System.out.println("Thank u for banking with us");
            }
        }


    }

    public static void printMainMenu() {
        String mainMenu = """
                1: Open an Account
                2: Close Account
                3: Deposit
                4: Withdraw
                5: Transfer
                6: Check Balance
                7: Exit
                                
                                
                """;
        System.out.println(mainMenu);
    }

    public static void openAccount(MyBank bank, Scanner scanner) {
        System.out.print("Enter account name: ");
        String accountName = scanner.next();
        int pin = 0;
        boolean validPin = false;
        while (!validPin) {
            System.out.print("Enter PIN (4 digits): ");
            if (scanner.hasNextInt()) {
                pin = scanner.nextInt();
                if (String.valueOf(pin).length() == 4) {
                    validPin = true;
                } else {
                    System.out.println("PIN must be a 4-digit number.");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid integer.");
                scanner.next();
            }
        }
        int accountNumber = Account.getNextAccountNumber();
        Account account = new Account(accountName, pin, accountNumber);
        bank.addAccount(account);
        System.out.println("Account opened successfully.");
    }

    public static int generateAccountNumber() {
        return Account.getNextAccountNumber();
    }

    public static void closeAccount(MyBank bank, Scanner scanner) {
        System.out.print("Enter account name to close: ");
        String accountName = scanner.next();
        Account account = bank.findAccount(accountName);
        if (account != null) {
            bank.removeAccount(account);
            System.out.println("Account closed successfully.");
        } else {
            System.out.println("Account not found.");
        }
    }

    public static void deposit(MyBank bank, Scanner scanner) {
        System.out.print("Enter account name: ");
        String accountName = scanner.next();
        Account account = bank.findAccount(accountName);
        if (account != null) {
            System.out.print("Enter deposit amount: ");
            int amount = scanner.nextInt();
            bank.deposit(account, amount);
            System.out.println("Deposit successful. New balance: " + account.getBalance());
        } else {
            System.out.println("Account not found.");
        }
    }

    public static void withdraw(MyBank bank, Scanner scanner) {
        System.out.print("Enter account name: ");
        String accountName = scanner.next();
        Account account = bank.findAccount(accountName);
        if (account != null) {
            System.out.print("Enter withdrawal amount: ");
            int amount = scanner.nextInt();
            try {
                bank.withdraw(account, amount);
                System.out.println("Withdrawal successful. New balance: " + account.getBalance());
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        } else {
            System.out.println("Account not found.");
        }
    }

    public static void transfer(MyBank bank, Scanner scanner) {
        System.out.print("Enter sender's account name: ");
        String senderName = scanner.next();
        Account senderAccount = bank.findAccount(senderName);
        if (senderAccount != null) {
            System.out.print("Enter recipient's account name: ");
            String recipientName = scanner.next();
            Account recipientAccount = bank.findAccount(recipientName);
            if (recipientAccount != null) {
                System.out.print("Enter transfer amount: ");
                int amount = scanner.nextInt();
                try {
                    bank.transfer(senderAccount, recipientAccount, amount);
                    System.out.println("Transfer successful.");
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
            } else {
                System.out.println("Recipient account not found.");
            }
        } else {
            System.out.println("Sender account not found.");
        }
    }

    public static void checkBalance(MyBank bank, Scanner scanner) {
        System.out.print("Enter account name: ");
        String accountName = scanner.next();
        Account account = bank.findAccount(accountName);
        if (account != null) {
            System.out.println("Current balance for account " + accountName + ": " + account.getBalance());
        } else {
            System.out.println("Account not found.");
        }

    }
}