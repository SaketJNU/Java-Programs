// Base class
class BankAccount {
    protected double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited ₹" + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew ₹" + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    public void displayBalance() {
        System.out.println("Current Balance: ₹" + balance);
    }
}

// SavingsAccount subclass
class SavingsAccount extends BankAccount {
    public SavingsAccount(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public void withdraw(double amount) {
        if (balance - amount < 100) {
            System.out.println("Cannot withdraw ₹" + amount + ". Minimum balance of ₹100 required.");
        } else {
            super.withdraw(amount);
        }
    }
}

// CurrentAccount subclass
class CurrentAccount extends BankAccount {
    public CurrentAccount(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public void withdraw(double amount) {
        if (balance - amount < -5000) {
            System.out.println("Cannot withdraw ₹" + amount + ". Overdraft limit of ₹5000 exceeded.");
        } else {
            balance -= amount;
            System.out.println("Withdrew ₹" + amount);
        }
    }
}

// Main class to test accounts
public class BankOperation{
    public static void main(String[] args) {
        System.out.println("=== Savings Account ===");
        SavingsAccount savings = new SavingsAccount(1000);
        savings.displayBalance();
        savings.withdraw(950);  // Should fail due to ₹100 min balance
        savings.withdraw(800);  // Should succeed
        savings.displayBalance();

        System.out.println("\n=== Current Account ===");
        CurrentAccount current = new CurrentAccount(2000);
        current.displayBalance();
        current.withdraw(6000);  // Should succeed (within overdraft)
        current.withdraw(2000);  // Should fail (overdraft exceeded)
        current.deposit(3000);   // Deposit to reduce overdraft
        current.displayBalance();
    }
}
