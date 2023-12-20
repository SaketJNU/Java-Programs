import java.util.Scanner;
public class Factorial
{
    public static void main(String args[])
    {
    	Scanner reader = new Scanner(System.in);
	System.out.print("\nEnter a number: ");
	int num = reader.nextInt();
	int fact = 1;
	if(num == 0)
	{
	     System.out.print("Factorial of " + num + " is " + fact);
	}
	else if (num > 0)
	{
	     for( int i = 1; i <= num ; i++)
	     {
		fact = fact*i;
	     }
	     System.out.print("\nFactorial of the given number is " + fact);
	}
	else
	{
		System.out.print("\nEntered a wrong number");
	}
    }
}
