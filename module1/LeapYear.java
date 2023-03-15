//Program that takes a year from user and print whether that year is a leap year or not.
import java.util.Scanner;

public class LeapYear
{
	public static void main(String args[])
	{
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter the Year = ");
		int year = reader.nextInt();
		if (year % 400 == 0)
		{
			System.out.print("\nEntered year is a Leap Year.");
		}
		else if (year %4 == 0 && year %100 !=0)
		{
			System.out.print("\nEntered year is a Leap Year");
		}
		else
		{
			System.out.print("\nEntered year is not a Leap Year.");
		}
	}
	
}
