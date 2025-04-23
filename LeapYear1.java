//WAP in Java to check whether a given year is a Leap year by using nested if-else

import java.util.Scanner;

class LeapYear{
  public static void main(String args[])
  {
    Scanner reader = new Scanner(System.in);
    System.out.print("\nEnter the year: ");
    int year = reader.nextInt();

    if (year%4 == 0)
    {
      if (year%100 == 0)
      {
        if (year % 400 == 0)
	{
          System.out.print("\nLeap year");
	}
	else
	{
      	  System.out.print("\nNot a Leap Year");
	}

      }
      else
      {
 	System.out.print("Leap Year");
      }
    }
    else
    {
	    System.out.print("\nNot a Leap Year");
    }
  }
}
