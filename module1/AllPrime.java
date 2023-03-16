//Program to display all prime numbers in between two given numbers.
import java.util.Scanner;

public class AllPrime
{
	public static void main(String args[])
	{
		Scanner reader =  new Scanner(System.in);
		System.out.print("\nEnter the Start Number: ");
		int startNum = reader.nextInt();
		System.out.print("\nEnter the End Number: ");
		int endNum = reader.nextInt();
		int primeCount = 0;
		for (int i = startNum; i <= endNum; i++)
		{
			boolean test = false;
			for (int j = 2; j <i; j++)
			{
				if (i % j == 0)
				{
					test = true;
					break;
				}
			}
			if (test == false)
			{
				System.out.print("\nPrime number = " + i);
				primeCount++;
			}
		}
		System.out.print("\nTotal number of primes are " + primeCount);
	}
}
