//Program for a class Shape is defined with two overloading constructors in it. Another class Test1 is partiallydefined which inherits the class Shape. The class Test1 should include two overloading constructors as appropriate for some object instantiation. You should define the constructors using the super class constructors. Also, override the method calculate() in Test1 to calculate the volume of a Shape.
import java.util.Scanner;

class Shape
{
	double length, breadth;
	Shape(double l, double b) 					// Constructor with two arguments
	{
		length = l;
	breadth= b;
	}

	Shape(double len)							// Constructor with one arguments
	{
		length = breadth = len;
	}

	double calculate()							// To calculate the area of a shape object
	{ 
		return length * breadth ;
	}
}

class Test1 extends Shape 			
{
	double height;
	
	Test1(double l, double h)					//Derived class constructor which can call the one parametrized constructor of the base class
	{
		super(l);
		this.length = l;
		this.height = h;
	}


	Test1(double l, double b, double h) //Derived class constructor which can call the two parametrized constructor of the base class
	{
		super(l,b);
		this.length=l;
		this.breadth=b;
		this.height=h;
	}


	double calculate() //Override the method calculate() in the derived class to find the volume of a shape instead of finding the area of a shape
	{
		return length*breadth*height;
	}
}

class ShapeOverloading
{
	public static void main(String args[])
	{
		System.out.println("\nEnter the length, breadth and height\n");
		Scanner sc = new Scanner(System.in);			//Create an object to read input
		double l=sc.nextDouble(); //Read length
		double b=sc.nextDouble(); //Read breadth
		double h=sc.nextDouble(); //Read height
		
		Test1 myshape1 = new Test1(l,h);
		Test1 myshape2 = new Test1(l,b,h);
		double volume1;
		double volume2;
		volume1 = myshape1.calculate();
		volume2=myshape2.calculate();
		System.out.print("\nThe volume using length and height is: "+volume1);
		System.out.print("\nThe volume using all 3 parameters is: "+volume2);
}
}