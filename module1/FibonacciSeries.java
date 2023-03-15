//Program to print Fibonacci series upto a given number.
import java.util.Scanner;

public class FibonacciSeries
{
    public  static void main(String args[])
	 {
	   
	        Scanner reader = new Scanner(System.in);
		System.out.print("\nEnter the number of terms of the Series:  ");
		int num = reader.nextInt();
		int term1 = 0;
		int term2 = 1;
		int temp = 0;
		System.out.print("\nThe Fibonacci Series is -----------------\n");
		for(int i = 1; i<= num; i++)
		{
			System.out.println("\t" + term1);
			temp = term1 + term2;
			term1 = term2;
			term2 = temp;
		}
		
	 }
}
