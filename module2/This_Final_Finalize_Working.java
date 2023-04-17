//Program to illustrate the usage of this, final and finalize.
class Student
{
	//declaring final variable
	final String university="GITAM Bengaluru";
	String name;
	public void getInput(String name)
	{
		this.name=name;
	}

	public void display() 
	{
		System.out.print("\nName: "+ name + "\n University: " + university);
	}
}

class This_Final_Finalize_Working
{
	public static void main(String args[])
	{
		Student st= new Student();
		st.getInput("Saket");
		st.display();
		// printing the hashcode
		System.out.print("\nHashcode is: " + st.hashCode());
		st = null; //dangling reference
		// calling the garbage collector using gc()
		System.gc();
		System.out.print("\nEnd of the garbage collection");
	}
	
	protected void finalize()
	{
		System.out.print("\nCalled the finalize() method");
	}
}