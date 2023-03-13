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
	     for( int i = 0; i < num ; i++)
	     {
		fact = fact*num--;
	     }
	     System.out.print("\nFactorial of " + num + " is " + fact);
	}
	else
	{
		System.out.print("\nYou have entered a wrong number");
	}

    }


}

