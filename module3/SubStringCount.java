//Program to count the number of occurrences of a search string in a given text string.
import java.io.*;
import java.util.Scanner;
class SubStringCount 
{
 	static int countOccurrences(String str, String word)
	{
		String a[] = str.split(" ");
		int count = 0;
		for (int i = 0; i < a.length; i++)
		{
			if (word.equals(a[i]))
				count++;
		}
	return count;
}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter a string:");
		String str = sc.nextLine();
		System.out.println("\nEnter a word to check for occurences:");
		String word = sc.nextLine();
		System.out.print(countOccurrences(str, word));
	}
}		