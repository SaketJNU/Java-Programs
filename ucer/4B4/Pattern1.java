/* Program to print the following pattern
 *
 * 	*
 * 	*	*
 * 	*	*	*
 */

import java.util.Scanner;
public class Pattern1{
public static void main(String args[])
    {
	System.out.print("How many line you want to display: ");
	Scanner reader = new Scanner(System.in);
	int nl = reader.nextInt();
	for(int i= 0; i < nl; i++)
	{ 
	    for(int j= 0; j <= i; j++)
		{
		   System.out.print("*\t");
		}
	    System.out.print("\n");
        }
    }
}
