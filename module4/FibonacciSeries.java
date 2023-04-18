//Program to generate Fibonacci Series by using Constructor to initialize the Data Members.
import java.util.Scanner;

class FibonacciSeries
{
	int n1,n2;
	FibonacciSeries()  		// Constructor
	{
		n1 = 0;
		n2 = 1;
	}

	void series(int n)
	{
		int i, next;
		System.out.print(n1 + "\t" + n2);
		for(i=1; i <= n-2; i++)
		{
			next = n1 + n2;
			System.out.print("\t " + next);
			n1 = n2;
			n2 = next;
		}
	}

	public static void main(String args[])
	{
		FibonacciSeries fib = new FibonacciSeries();
		Scanner reader = new Scanner(System.in);
		System.out.print("\nEnter value for n: ");
		int n = reader.nextInt();
		System.out.println("\nThe Fibonacci series for " + n + " is -----\n");
		fib.series(n);
}
}