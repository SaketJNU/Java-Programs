//Program that reverses an array and stores it in the same array.
import java.util.Scanner;

class ReverseArray
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
		// Code to Reverse the array
		int start = 0;
		int end = size-1;
		int temp = 0;
		while(start < end)
		{
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start = start + 1;
			end = end - 1;
		}
		System.out.print("\nReverse array is: ");
		for(int i=0; i<size;i++)
			{
				System.out.print("\t" + arr[i]);
			}
	}
}