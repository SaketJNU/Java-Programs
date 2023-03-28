//Program to compute Simple Interest
import java.util.Scanner;

class SimpleInterest
{
	public static void main(String[] args) {
		System.out.print("\nProgram to Compute Simple Interest -----\n");
		Interest interest = new Interest();
		interest.input_values();
		interest.show_interest();
	}
}

class Interest
{
	double amount, rate, time, interest;
	
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
      interest = (amount*rate*time)/100;
	}
	public void show_interest()
	{
      System.out.print("\nPrincipal Amount : " + amount );
      System.out.print("\nInterest Rate : " + rate );
      System.out.print("\nTotal Time : " + time );
      System.out.print("\nSimple Interest : " + interest);
      System.out.print("\nTotal Amount : " + (amount + interest));
	}
}