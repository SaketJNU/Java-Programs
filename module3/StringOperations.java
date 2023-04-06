//Program to implement all String methods on a Input String
import java.util.Scanner;

public class StringOperations 
{  
public static void main(String[] args)  
{
	Scanner reader = new Scanner(System.in);  
   	System.out.print("Enter the first String: ");
   	String str1 = reader.nextLine();
   	System.out.print("Enter the second String: ");
   	String str2 = reader.nextLine();

	System.out.println("Upper case of string 1 is: " + str1.toUpperCase());
	System.out.println("Lower case of string 2 is: " + str2.toLowerCase());
	System.out.println("Str1 is uincahnged as : " + str1);

	System.out.print("Enter the String which has spaces: ");
   	String str3 = reader.nextLine();
   	System.out.println("Str3 after trimming is : " + str3.trim());
   	System.out.println("Str1 has character at 3rd place as : " + str1.charAt(2));
   	System.out.println("Length of the Str1 is: " + str1.length());
}  
}  
