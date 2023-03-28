//Program that copies contents of one array to another using length member
//Program that reverses an array and stores it in the same array.
import java.util.Scanner;

class CopyArray
{
	public static void main(String args[])
	{
		Scanner reader = new Scanner(System.in);
		System.out.print("\nEnter the size of array: ");
		int size = reader.nextInt();
		int[] arr = new int[size];
		System.out.print("\nEnter the array -----------------");
		for (int i = 0; i<size; i++)
		{
			System.out.print("\n Enter the " + (i+1) + " element: ");
			arr[i] = reader.nextInt();
		}
		System.out.print("\nEntered array is: ");
		for(int i=0; i<size;i++)
			{
				System.out.print("\t" + arr[i]);
			}
		// Code to copy the array into new array
		int[] arr1 = new int[arr.length];			//Create a new array with same size
		for (int i=0; i < arr.length; i++)
		{
			arr1[i] = arr[i];
		}

		System.out.print("\nCopied array is: ");
		for(int i=0; i<size;i++)
			{
				System.out.print("\t" + arr1[i]);
			}
	}
}