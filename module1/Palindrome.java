//Program to check whether a given number is a Palindrome number
import java.util.Scanner;
public class Palindrome
{
    public static void main(String args[])
        {
	    Scanner reader = new Scanner(System.in);
	    System.out.print("\nEnter the number: ");
	    int num = reader.nextInt();
	    int numcopy = num;
	    int reversenum = 0;
	    while(num > 0)
	    {
	       reversenum = reversenum*10 + num%10;
	       num = num/10;
	    }
	    if(reversenum == numcopy)
	    {
	       System.out.print("\nEntered number is a Palindrome number.");
	    }
	    else
	    {
	        System.out.print("\nEntered number is not a Palindrome number.");
	    }
	}
}
