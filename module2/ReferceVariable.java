// Program to create a reference variable
import java.util.Scanner;
class Area
{
  double length;
  double weadth;

  public void inputValues()
  {
    Scanner reader = new Scanner(System.in);
    System.out.print("\nEnter the length: ");
    length = reader.nextDouble();
    System.out.print("\nEnter the weadth: ");
    weadth = reader.nextDouble();
  }
  public double showArea()
  {
    return length*weadth;
  }
}
public class ReferceVariable
{
  public static void main(String args[])
  {
     Area obj1 = new Area();
     Area obj2 = obj1;             // Refernce Variable
     obj1.inputValues();
     System.out.print("\nThe area is " + obj2.showArea());
  }
}
