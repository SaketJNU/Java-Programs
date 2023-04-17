//Program to read and print a given string using different methods.

import java.util.*;
class ReadStringMethod {
public static void main(String args[])
{
	Scanner sc = new Scanner(System.in);
		//Using nextLine() method
	System.out.print("\nReading a String by using nextLine() method ----------");
	System.out.print("\nEnter a string: ");
	String s = sc.nextLine();
	System.out.print("\nThe entered string is: "+s);
		//Using format() method
	System.out.print("\nReading a String by using format() method ----------");
	String str1 = String.format("%s", "Hello welcome for Java Programs.");
	System.out.print("\nThe String is: "+str1);
}
}
