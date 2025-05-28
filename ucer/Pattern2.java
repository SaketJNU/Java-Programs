/* Program to print the following pattern
 1
 2 	3
 4 	5	6
 7 	8	9	10
 */

import java.util.Scanner;
public class Pattern2{
public static void main(String args[])
    {
	System.out.print("How many line you want to display: ");
	Scanner reader = new Scanner(System.in);
	int nl = reader.nextInt();
	int temp = 0;
	for(int i= 0; i < nl; i++)
	{ 
	    for(int j= 0; j <= i; j++)
		{
      		   temp++;
		   System.out.print(temp + "\t");
		}
	    System.out.print("\n");
        }
    }
}
