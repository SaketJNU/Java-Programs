/* 
 Program to check wheter a given number is positive or negative using ternary operator        [expression ? true option : false option]
 Multi line comment */

// This is a single line comment
/** 
 * doc string comment
 * @author Dr. Saket
 * */

import java.util.Scanner;

public class Positive
{
   public static void main(String args[])
     {
        System.out.print("\nEnter a number: ");
	Scanner reader = new Scanner(System.in);
	int num = reader.nextInt();
	String result = num > 0 ? "Positive number" : "Negative number"; // Ternary operator
	System.out.print("Entered number is a " + result );
     }
}
