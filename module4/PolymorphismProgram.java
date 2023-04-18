//Program to design a vehicle class hierarchy in Java, and develop a program to demonstrate Polymorphism.
class Vehicle
{
	String regno;
	int model;
	Vehicle(String r, int m)
	{
		regno	=	r;
		model	=	m;
	}

	void display()
	{
		System.out.print("\nRegistration no: "+regno);
		System.out.print("\nModel no: "+model);
	}
}

class Twowheeler extends Vehicle
{
	int noofwheels;
	Twowheeler(String r, int m, int n)
	{
		super(r,m);
		noofwheels = n;
	}

	void display()
	{
		System.out.print("\nTwo wheeler tvs");
		super.display();
		System.out.print("\nNo. of wheels: " + noofwheels);
	}
}

class Threewheeler extends Vehicle
{
	int noofwheels;

	Threewheeler(String r,int m,int n)
	{
		super(r,m);
		noofwheels = n;
	}

	void display()
	{
		System.out.print("\nThree wheeler auto");
		super.display();
		System.out.print("\nNo. of wheels: " +noofwheels);
	}
}

class Fourwheeler extends Vehicle
{
	int noofwheels;
	
	Fourwheeler(String r,int m,int n)
	{
		super(r,m);
		noofwheels=n;
	}

	void display()
	{
		System.out.print("\nFour wheeler car");
		super.display();
		System.out.print("\nNo. of wheels: " + noofwheels);
	}
}

class PolymorphismProgram
{
	public static void main(String arg[])
	{
		Twowheeler t1 = new Twowheeler("KA74 12345", 1,2);
		Threewheeler th1 = new Threewheeler("KA74 54321", 4,3);
		Fourwheeler f1 = new Fourwheeler("KA34 45677",5,4);
		t1.display();
		th1.display();
		f1.display();
	}
}