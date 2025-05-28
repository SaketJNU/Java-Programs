class BankAccount {
    private int balance = 1000;

    // Synchronized method to avoid race condition
    public synchronized void withdraw(int amount, String threadName) {
        System.out.println(threadName + " is trying to withdraw $" + amount);

        if (balance >= amount) {
            System.out.println(threadName + " is about to withdraw...");
            try {
                Thread.sleep(100); // simulate time delay
            } catch (InterruptedException e) {
                System.out.println("Interrupted!");
            }
            balance -= amount;
            System.out.println(threadName + " completed withdrawal. Remaining balance: $" + balance);
        } else {
            System.out.println("Not enough balance for " + threadName + " to withdraw $" + amount);
        }
    }
}

class WithdrawThread extends Thread {
    private BankAccount account;
    private int amount;

    public WithdrawThread(BankAccount account, int amount, String name) {
        super(name); // Set thread name
        this.account = account;
        this.amount = amount;
    }

    public void run() {
        account.withdraw(amount, Thread.currentThread().getName());
    }
}

class ThreadSyncDemo {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        // Two threads trying to withdraw money from the same account
        WithdrawThread t1 = new WithdrawThread(account, 700, "Thread-1");
        WithdrawThread t2 = new WithdrawThread(account, 500, "Thread-2");

        t1.start();
        t2.start();
    }
}

