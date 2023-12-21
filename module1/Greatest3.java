//Program to find the greatest among three numbers by using the ternary operation
import java.util.Scanner;
class ThreeG
{
  public static void main(String args[])
  {
    Scanner reader = new Scanner(System.in);
    System.out.print("\nEnter the first number = ");
    int fn = reader.nextInt();
    System.out.print("\nEnter the second number = ");
    int sn = reader.nextInt();
    System.out.print("\nEnter the third number = ");
    int tn = reader.nextInt();
    reader.close();
    int result = (fn > sn ? (fn > tn ? fn: tn) : (sn > tn? sn : tn ));
    System.out.print("\nGreatest number among three is " + result);


  }
}
