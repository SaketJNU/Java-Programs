//Program to compute the GCD of two given numbers
import java.util.Scanner;
public class GCD_2Num
{
    public static void main(String args[])
    {
        Scanner reader = new Scanner(System.in);
	System.out.print("\nEnter the first number = ");
	int num1 = reader.nextInt();
	System.out.print("\nEnter the second number = ");
	int num2 = reader.nextInt();
	int gcd = 1;
	for (int i =2; i <= num1 && i <= num2; i++)
        {
	  if (num1 % i == 0 && num2 % i == 0)
 	      {
	         gcd = i;
	      }
	}
	System.out.print("\nGCD of given number is " + gcd);
    }
}
