// Program to swap two given numbers

import java.util.Scanner;

public class SwapTwo
{
    public static void main(String args[])
      {
          Scanner reader = new Scanner(System.in);
          System.out.print("\nEnter the first number: ");
          int fn = reader.nextInt();    
          System.out.print("\nEnter the second number: ");
          int sn = reader.nextInt();
          reader.close();
	  int temp = fn;
          fn = sn;
          sn = temp;
          System.out.print("Swaped numbers are: First number = " + fn + " Second number: " + sn);    
      }
}