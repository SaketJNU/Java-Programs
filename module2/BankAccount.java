//Program that creates a class Account that stores a variable balance. The class has methods to start account, to deposit money, to withdraw money and tell the current balance amount.
import java.util.Scanner;
//import java.util.*;
class BankAccount
{
	String name;
	double balance;
	void CreateAccount(String n, double b)
	{
		name = n;
		balance = b;
		System.out.print("\nAccount Created:");
		System.out.println("\nName: " + name);
		System.out.println("\nAmount: " + balance);
	}
	
	void deposit(double d)
	{
		if(d > 0.0)
			{
				balance = balance + d;
			}
		System.out.print("\nBalance After Deposit: " + balance);
	}

	void withdraw(double w)
	{
		if(w > 0.0 && w <= balance)
		{
			balance = balance - w;
		}
		System.out.print("\nBalance After Withdrawal: " + balance);
	}

	double getBalance()
	{
		return balance;
	}

	public static void main(String args[])
	{
		BankAccount s1= new BankAccount();
		Scanner in = new Scanner(System.in);
		System.out.print("\nEnter your name: ");
		String x = in.nextLine();
		System.out.print("\nEnter Amount: ");
		double y = in.nextDouble();
		s1.CreateAccount(x,y);
		while(true)
		{
			System.out.print("\nChoose any method from the following Options ----");
			System.out.print("\nOption 1 :: To Deposit Money");
			System.out.print("\nOption 2 :: To Withdraw Money");
			System.out.print("\nOption 3 :: To Get Balance");
			System.out.print("\nOption 4 :: To Exit");
			System.out.print("\nSelect your choice: ");
			int choice= in.nextInt();
			switch(choice)
			{
				case 1:				// To deposit money
				System.out.print("\nEnter the amount you would like to deposit: ");
				double deposit = in.nextDouble();
				s1.deposit(deposit);
					break;
				case 2:				// To withdraw money
				System.out.print("\nEnter the amount you would like to withdraw: ");
				double withdraw = in.nextDouble();
				s1.withdraw(withdraw);
					break;
				case 3:				// To get balance
				System.out.print(s1.getBalance());
					break;
				case 4:
					System.exit(0);
				default:
				System.out.print("\nInvalid choice! Please make avalid choice.");
			}
		}
	}
}