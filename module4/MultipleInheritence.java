//Program to demonstrate multiple inheritance through interface.

interface AnimalEat 
{
	void eat();
}

interface AnimalTravel 
{
	void travel();
}

class Animal implements AnimalEat, AnimalTravel 
{
	public void eat() 
	{
		System.out.print("\nAnimal is eating.");
	}

	public void travel() 
	{
		System.out.print("\nAnimal is travelling.");
	}
}

public class MultipleInheritence
{
	public static void main(String args[]) 
	{
		Animal a = new Animal();
		a.eat();
		a.travel();
	}
}