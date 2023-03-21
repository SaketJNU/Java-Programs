// Program to read numbers and add them using class
import java.util.Scanner;

public class Add2Num
{
  public static void main(String args[])
   {
    System.out.print("\n Program to add two numbers using class -----");
    Num2 n1 = new Num2();   // Default construct and n1 is an object
    n1.get_numbers();
    n1.add_print();
   }
}

class Num2
{
  int num1, num2, sum;
  public void get_numbers()
  {
       Scanner reader = new Scanner(System.in);
       System.out.print("\nEnter the first number: ");
       num1 = reader.nextInt();
       System.out.print("\nEnter the second number: ");
       num2 = reader.nextInt();
  }
  public void add_print()
   {
      sum = num1 +  num2;
      System.out.print("\nRequired Sum: " + sum);
   }
}