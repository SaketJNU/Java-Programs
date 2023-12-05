// Program to check wheter a given number is an even or an odd number

import java.util.Scanner;

public class EvenOdd
{
   public static void main(String args[])
     {
         System.out.print("Enter the number: ");
         Scanner reader = new Scanner(System.in);
         int num = reader.nextInt();
         reader.close();
         if( num%2 == 0)
	   {
             System.out.print("\nEntered number " + num + " is an Even number.");
           }
         else
	   {
             System.out.print("\nEntered number " + num + " is an Odd number.");           
           }    
     }
}