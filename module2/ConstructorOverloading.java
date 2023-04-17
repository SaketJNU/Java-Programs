//Program to show the overloading of constructures.
class ConstructorOverloading 
{
	// Non-Parameterized Constructor.
   ConstructorOverloading() 
   { 
     System.out.println("Hello, I am a Constructor with no parameter.");
   }
	// Parameterized Constructor.
   ConstructorOverloading(String name) 
   {
     System.out.println("Hello, I am a Constructor with one parameter, name = " + name);	
   }

public static void main(String[] args) 
	{
  		ConstructorOverloading p1 = new ConstructorOverloading(); // Non-parameterized constructor.
  		ConstructorOverloading p2 = new ConstructorOverloading("Dr. Saket"); // One parameterized constructor.
	}
}  