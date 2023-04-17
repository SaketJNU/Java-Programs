//Program to reverse the words in a string.
import java.util.Scanner;
class ReverseString
{
	public static void main(String args[])
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("\nEnter the string: ");
		String originalStr = scanner.nextLine();
		scanner.close();
		//String words[] = originalStr.split("\\s");
		String reversedString = "";
			//Reverse each word’s position
		for (int i = 0; i < originalStr.length(); i++) 
		{
			reversedString = originalStr.charAt(i) + reversedString;
		}
			// Displaying the string after reverse
		System.out.print("Reversed string : " + reversedString);
	}
}
