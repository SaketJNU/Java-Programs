//Program that keeps a number from the user and generates an integer between 1 and 7 and displays the name of the weekday.

import java.util.Scanner;

public class Weekday
{
	public static void main(String args[])
	{
		Scanner reader = new Scanner(System.in);
		System.out.print("Please eneter a number: ");
		int num = reader.nextInt();
		int rem = num %7;
		if (rem == 0)
		{
			System.out.print("\nIt is Sunday");
		}
		else if (rem == 1)
		{
			System.out.print("\nIt is Monday");
		}
		else if (rem == 2)
		{
			System.out.print("\nIt is Tuesday");
		}
		else if (rem == 3)
		{
			System.out.print("\nIt is Wednesday");
		}
		else if (rem == 4)
		{
			System.out.print("\nIt is Thursday");
		}
		else if (rem == 5)
		{
			System.out.print("\nIt is Friday");
		}
		else if (rem == 6)
		{
			System.out.print("\nIt is Saturday");
		}

	}
}