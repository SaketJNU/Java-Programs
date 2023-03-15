//Program in Java to display the multiplication table of a given integer.

import java.util.Scanner;

public class MultiplicationTable
{
	public static void main (String args[])
	{
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter the number for which table is required. Number = ");
		int num = reader.nextInt();
		for (int i=1; i<11; i++)
		{
			System.out.print(num + " x " + i + "  = " + num*i + "\n");
		}
	}
}


//Output:
//Enter the number for which table is required. Number = 5
//5 x 1  = 5
//5 x 2  = 10
//5 x 3  = 15
//5 x 4  = 20
//5 x 5  = 25
//5 x 6  = 30
//5 x 7  = 35
//5 x 8  = 40
//5 x 9  = 45
//5 x 10  = 50
