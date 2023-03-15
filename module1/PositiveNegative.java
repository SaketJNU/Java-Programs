// Program to read a number from the user and print whether it is positive or negative.
import java.util.Scanner;

public class PositiveNegative{
	public static void main(String args[])
		{
			Scanner reader = new Scanner(System.in);
			System.out.println("Enter the number: ");
			int number = reader.nextInt();
			if(number > 0)
				{
					System.out.println("Entered number " + number + " is a postive number");
				}
			else
				{
					System.out.println("Entered number " + number + " is a negative number");
				}

		}

}

// Output:
// Enter the number: 
// -23
// Entered number -23 is a negative number
