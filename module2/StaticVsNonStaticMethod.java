//Program to differentiate between static and non-static methods.

class StaticNonStaticMethod
{
	int count=0;
	static int obCount;
	public static int objectCount()
	{
		// Returning number of object created
	return ++obCount;
	}

	public void increaseCount()
	{
		count++;
	}
	public void printCount()
	{
		System.out.println("\nThe number of object created = "+StaticNonStaticMethod.obCount );
		System.out.println("\nThe value of count = " +count );
	}
}

class StaticVsNonStaticMethod
{
	public static void main(String args[])
	{
		// declaration of static and non-static variables
		StaticNonStaticMethod ob1= new StaticNonStaticMethod();
		StaticNonStaticMethod.objectCount();
		ob1.increaseCount();
		ob1.increaseCount();
		ob1.increaseCount();
		ob1.printCount(); 
		StaticNonStaticMethod ob2= new StaticNonStaticMethod();
		StaticNonStaticMethod.objectCount();
		ob2.increaseCount();
		ob2.increaseCount();
		ob2.increaseCount();
		ob2.increaseCount();
		ob2.printCount(); 
	}
}