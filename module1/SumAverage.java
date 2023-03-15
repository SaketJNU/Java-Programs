// Program to input 5 numbers from keyboard and find their sum and average.

import java.util.Scanner;

public class SumAverage
{
	public static void main(String args[])
	{
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int n1 = reader.nextInt();
		System.out.println("Enter second number: ");
		int n2 = reader.nextInt();
		System.out.println("Enter third number: ");
		int n3 = reader.nextInt();
		System.out.println("Enter fourth number: ");
		int n4 = reader.nextInt();
		System.out.println("Enter fifth number: ");
		int n5 = reader.nextInt();
		int sum = n1 + n2 + n3 + n4 + n5;
		float avg = (n1 + n2 + n3 + n4 + n5)/5;
		System.out.println("Sum of " + n1 + ", " + n2 + ", " + n3 + ", " + n4 + ", " + n5 + " = " + sum);
		System.out.println("Average of " + n1 + ", " + n2 + ", " + n3 + ", " + n4 + ", " + n5 + " = " + avg);
	}
}
//Output:
//Enter first number:
//2
//Enter second number:
//3
//Enter third number:
//4
//Enter fourth number:
//5
//Enter fifth number:
//6
//Sum of 2, 3, 4, 5, 6 = 20
//Average of 2, 3, 4, 5, 6 = 4.0
