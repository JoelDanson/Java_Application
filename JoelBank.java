import java.util.HashMap;
import java.util.Scanner;

class Account {
    private String accountNumber;
    private String ownerName;
    private double balance;

    public Account(String accountNumber, String ownerName) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = 0.0;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful.");
        } else {
            System.out.println("Invalid amount. Deposit failed.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful.");
        } else {
            System.out.println("Invalid amount or insufficient balance.");
        }
    }

    public void transfer(Account recipient, double amount) {
        if (recipient == null) {
            System.out.println("Recipient account does not exist.");
        } else if (amount > 0 && amount <= balance) {
            balance -= amount;
            recipient.balance += amount;
            System.out.println("Transfer successful.");
        } else {
            System.out.println("Invalid amount or insufficient balance for transfer.");
        }
    }
}

public class JoelBank {

    private static HashMap<String, Account> accounts = new HashMap<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to Joel Bank!");

        while (true) {
            System.out.println("\nChoose an operation:");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Check Balance");
            System.out.println("5. Transfer");
            System.out.println("6. Exit");

            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume leftover newline

            switch (choice) {
                case 1:
                    createAccount();
                    break;
                case 2:
                    deposit();
                    break;
                case 3:
                    withdraw();
                    break;
                case 4:
                    checkBalance();
                    break;
                case 5:
                    transfer();
                    break;
                case 6:
                    System.out.println("Thank you for banking with Joel Bank!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please select again.");
            }
        }
    }

    private static void createAccount() {
        System.out.print("Enter account number: ");
        String accNumber = scanner.nextLine();
        if (accounts.containsKey(accNumber)) {
            System.out.println("Account already exists!");
            return;
        }
        System.out.print("Enter owner's name: ");
        String owner = scanner.nextLine();
        Account newAccount = new Account(accNumber, owner);
        accounts.put(accNumber, newAccount);
        System.out.println("Account created successfully!");
    }

    private static void deposit() {
        System.out.print("Enter account number: ");
        String accNumber = scanner.nextLine();
        Account account = accounts.get(accNumber);
        if (account == null) {
            System.out.println("Account not found.");
            return;
        }
        System.out.print("Enter amount to deposit: ");
        double amount = scanner.nextDouble();
        account.deposit(amount);
    }

    private static void withdraw() {
        System.out.print("Enter account number: ");
        String accNumber = scanner.nextLine();
        Account account = accounts.get(accNumber);
        if (account == null) {
            System.out.println("Account not found.");
            return;
        }
        System.out.print("Enter amount to withdraw: ");
        double amount = scanner.nextDouble();
        account.withdraw(amount);
    }

    private static void checkBalance() {
        System.out.print("Enter account number: ");
        String accNumber = scanner.nextLine();
        Account account = accounts.get(accNumber);
        if (account == null) {
            System.out.println("Account not found.");
            return;
        }
        System.out.println("Account Owner: " + account.getOwnerName());
        System.out.println("Current Balance: $" + account.getBalance());
    }

    private static void transfer() {
        System.out.print("Enter your account number: ");
        String fromAcc = scanner.nextLine();
        Account sender = accounts.get(fromAcc);
        if (sender == null) {
            System.out.println("Your account not found.");
            return;
        }
        System.out.print("Enter recipient account number: ");
        String toAcc = scanner.nextLine();
        Account recipient = accounts.get(toAcc);
        System.out.print("Enter amount to transfer: ");
        double amount = scanner.nextDouble();
        sender.transfer(recipient, amount);
    }
}
