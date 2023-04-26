//Program to create a class telephone with ( ) , lift ( ) and disconnected ( ) methods as abstract methods create another class smart telephone and demonstrate polymorphism

interface telephone2
{
	void pickCall();
	void recieveCall();
}

interface phone2
{
	void call();
	void with();
	void lift();
	void disconnected();
}

class CellPhone
{
	void recording_audio()
	{
		System.out.print("\nHello hello babya baye ..");
	}
}

class Smartphone extends CellPhone implements telephone2, phone2
{
	public void call()
	{
		System.out.print("\nHello is it ....care");
	}

	public void with()
	{
		System.out.println("\nI am on a call with my friend.");
	}

	public void lift()
	{
		System.out.print("\nHello your lift is good now.");
	}

	public void disconnected()
	{
		System.out.print("\nCall is disconnected.");
	}

	public void pickCall()
	{
		System.out.print("\nHello, It's Hello");
	}

	public void recieveCall()
	{
		System.out.println("Bye ...");
	}
}

class PolymorphismExample {
	public static void main(String args[])
	{
		telephone2 tl = new Smartphone();
		tl.pickCall();
		tl.recieveCall();
	}
}