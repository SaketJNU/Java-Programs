//Program to define a class Point with two fields x and y each of type double. also, a method distance(Point p1, Point p2) to calculate the distance between points p1 and p2 and return the value in double. (Hint: use Math.sqrt( ) )
import java.util.Scanner;

class Point
{
	double x;
	double y;
	double distance(Point p1,Point p2)
	{
		double res;
		return Math.sqrt((p2.x-p1.x)*(p2.x-p1.x) + (p2.y-p1.y)*(p2.y-p1.y));
	}
}

class Distance2Point
{
	public static void main(String args[])
	{
		// creating one object of Point class
		Point p1=new Point();
		// creating another object of Point class
		Point p2=new Point();
		Scanner reader = new Scanner(System.in);
		
		System.out.print("\nEnter the first point -----");
		System.out.print("\nx1 = ");
		p1.x = reader.nextDouble();
		System.out.print("\ny1 = ");
		p1.y = reader.nextDouble();
		
		System.out.print("\nEnter the second point -----");
		System.out.print("\nx2 = ");
		p2.x = reader.nextDouble();
		System.out.print("\ny2 = ");
		p2.y = reader.nextDouble();
		
		// calling distance method
		System.out.println("The distance between two points:" + p1.distance(p1,p2));
	}
}