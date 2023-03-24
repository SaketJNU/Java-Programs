//Program to compute compound interest
import java.util.Scanner;
import java.lang.Math;
class CompoundInterest
{
	public static void main(String[] args) {
		System.out.print("\nProgram to Compute Compound Interest -----\n");
		Interest ca = new Interest();
		ca.input_values();
		ca.show_interest();
	}
}

class Interest
{
	double amount, rate, time, total_amount;
	
	public void input_values()
	{
  		Scanner reader = new Scanner(System.in);
  		System.out.print("\nEnter the principal amount = ");
  		amount = reader.nextDouble();
  		System.out.print("\nEnter the interest rate = ");
  		rate = reader.nextDouble();
  		System.out.print("\nEnter the total time = ");
  		time = reader.nextDouble();
  		compute_interest();

	}
	public void compute_interest()
	{
      total_amount = amount*Math.pow(1 + (rate/100.0), time);
	}
	public void show_interest()
	{
      System.out.print("\nPrincipal Amount : " + amount );
      System.out.print("\nInterest Rate : " + rate );
      System.out.print("\nTotal Time : " + time );
      System.out.print("\nTotal Amount : " + total_amount);
      System.out.print("\nSimple Interest : " + (total_amount - amount));
	}
}
