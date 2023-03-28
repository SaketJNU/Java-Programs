//Program to read two numbers and perform artimetic operation using method and class

import java.util.Scanner;

public class Add2NumClass
{
	public static void main(String args[])
	{
	  System.out.print("\nProgram to add 2 numbers ------------------");
	  Num2 n = new Num2();
	  n.get_numbers();
	  n.add_numbers();

	}
}

class Num2
{
	int num1, num2, sum;

	public void get_numbers()
	{
		Scanner reader = new Scanner(System.in);
		System.out.print("\nEnter the first number = ");
		num1 = reader.nextInt();
		System.out.print("\nEnter the second number = ");
		num2 = reader.nextInt();
	}
	public void add_numbers()
	{
		sum = num1 + num2;
		System.out.print("\nRequired Sum = " + sum);
	}
		
}
