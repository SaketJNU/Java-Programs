//Program to read the comman line arguments and print the total number of arguments and 
//its values.

class CommandLineAgu
{
	public static void main(String args[])
	{
		System.out.print("\nTotal number of command line arguments: " + args.length);
		System.out.print("\nTheir values are ------\n");
		for (int i=0 ; i < args.length; i++)
		{
			System.out.print("\n"+args[i]);
		}
	}
}