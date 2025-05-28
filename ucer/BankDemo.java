class BankAccount {
    protected String accountHolder;
    protected double balance;

    public BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " deposited. New balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println( amount + " withdrawn. New balance: " + balance);
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    public void displayBalance() {
        System.out.println(accountHolder + "Balance: " + balance);
    }
}

class SavingsAccount extends BankAccount {

    public SavingsAccount(String accountHolder, double balance) {
        super(accountHolder, balance);
    }

    @Override
    public void withdraw(double amount) {
        if (balance - amount < 100) {
            System.out.println("Withdrawal denied. Balance cannot go below 100 in Savings Account.");
        } else {
            super.withdraw(amount);
        }
    }
}

class CurrentAccount extends BankAccount {
    private final double overdraftLimit = 5000;

    public CurrentAccount(String accountHolder, double balance) {
        super(accountHolder, balance);
    }

    @Override
    public void withdraw(double amount) {
        if (balance - amount < -overdraftLimit) {
            System.out.println("Withdrawal denied. Overdraft limit of 5000 exceeded in Current Account.");
        } else {
            balance -= amount;
            System.out.println(amount + " withdrawn. New balance: " + balance);
        }
    }
}

public class BankDemo {
    public static void main(String[] args) {
        // Creating instances
        SavingsAccount savings = new SavingsAccount("Alice", 1000);
        CurrentAccount current = new CurrentAccount("Bob", 2000);

        // Transactions on SavingsAccount
        System.out.println("\n--- Savings Account Transactions ---");
        savings.displayBalance();
        savings.deposit(500);
        savings.withdraw(1400); // Should fail
        savings.withdraw(200);  // Should succeed
        savings.displayBalance();

        // Transactions on CurrentAccount
        System.out.println("\n--- Current Account Transactions ---");
        current.displayBalance();
        current.withdraw(6000); // Should succeed (within overdraft)
        current.withdraw(2000); // Should fail (overdraft exceeded)
        current.deposit(3000);
        current.displayBalance();
    }
}

