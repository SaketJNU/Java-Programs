//Program to design a class to overload a method compare() to return the greater of two as follows:
//		void compare(int, int)
//		void compare(char, char)
//		void compare(String, String)

import java.util.Scanner;

public class CompareMethod
{
	public static void main(String args[])
	{
		System.out.print("\nProgram to demonstate the Overloading of methods");
		MethodOverloaded mo = new MethodOverloaded();
		Scanner reader = new Scanner(System.in);
		System.out.print("\n\nEnter two integers: ");
		System.out.print("\nFirst: ");
		int num1 = reader.nextInt();
		System.out.print("\nSecond: ");
		int num2 = reader.nextInt();
		mo.compare(num1, num2);
		
		System.out.print("\n\nEnter two characters: ");
		System.out.print("\nFirst: ");
		char c1 = reader.next().charAt(0) ;
		System.out.print("\nSecond: ");
		char c2 = reader.next().charAt(0) ;
		mo.compare(c1, c2);	

		System.out.print("\n\nEnter two Strings: ");
		System.out.print("\nFirst: ");
		String s1 = reader.next();
		System.out.print("\nSecond: ");
		String s2 = reader.next();
		mo.compare(s1, s2);
	}
}

class MethodOverloaded
{
  public void compare(int x, int y)
  {
  	if (x > y)
  	{
  		System.out.print("\nFirst number is greater.");
  	}
  	else
  	{
  		System.out.print("\nSecond number is greater");
  	}
  }

  public void compare(char ch1, char ch2)
  {
  	int x = (int) ch1;
  	int y = (int) ch2;
  	 if (x > y)
  	{
  		System.out.print("\nFirst character is greater.");
  	}
  	else
  	{
  		System.out.print("\nSecond character is greater");
  	}
  }

  public void compare(String str1, String str2)
  {
  	if(str1.compareTo(str2) > 0)
  	{
  		System.out.print("\nFirst String is greater.");
  	}
  	else
  	{
  		System.out.print("\nSecond String is greater");
  	}	
  }
}
