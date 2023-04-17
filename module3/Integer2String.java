//Program to convert a given integer array of size n into string.
import java.io.*;
import java.util.*;
class Integer2String
{
public static void main(String args[])
{
	Scanner s = new Scanner(System.in);
	System.out.println("Enter number of elements in the array: ");
	int size = s.nextInt();
	int array[] = new int[size];
	System.out.println("Enter "+ size + " elements ");
	for(int i=0; i < size; i++)
	{
		array[i] = s.nextInt();
	}
	System.out.println("Integer Array to String representation is:" + Arrays.toString(array));
}
}
