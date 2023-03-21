//Program that performs arithmetic with values of type char.

import java.util.Scanner;

public class AddCharacter
{
    public static void main(String args[])
    {
      System.out.print("Characters artemetic operations -------");
      CharAdd ch = new CharAdd();
      ch.get_char();
      ch.simple_add();
      ch.arth_add();
    }
}

class CharAdd
{
   char ch1, ch2;

   public void get_char()
   {
      Scanner reader = new Scanner(System.in);
      System.out.print("\nEnter the first character, ch1: ");
      ch1 = reader.next().charAt(0);
      System.out.print("\nEnter the second character, ch2: ");
      ch2 = reader.next().charAt(0);
   }
  public void simple_add()
  {
      System.out.print("\nSimple addition of two characters are  " + ch1+ch2);
  }
  public void arth_add()
  {
      int temp = ch1 + 2;
      System.out.print("\nAdding 2 to ch1 results: " + (char)temp);
      temp = ch2 + 3;
      System.out.print("\nAdding 3 to ch2 results: " + (char)temp);
  }
}