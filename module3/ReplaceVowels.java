//Program to read a string and replace all the vowels with a @ symbol.
import java.util.Scanner;
class ReplaceVowels
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str= sc.nextLine(); //reads string
		System.out.print("The string after replacing vowels: ");
		str = str.replaceAll("[aeiouAEIOU]", "@");  // Replace Vowels by $
		System.out.println(str);
	}
}
