//Program to delete duplicate elements from an array of size 5.
import java.util.Scanner;

class RemoveDuplicate
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
		// Code to Remove Duplicates
		int[] arr1 =  new int[arr.length];
		arr1[0] = arr[0];
		int count = 1;
		boolean test = true;
		for(int i = 1; i< arr.length; i++)
		{     int j = 0;
			for (; j < count; j++)
			{
				if (arr[i] == arr1[j])
				{
					test = false;
					break;
				}
			}
				if(test == true)
				{
					arr1[j] = arr[i];
					count   = count + 1;
					test = true;

				}
		}
		System.out.print("\nArray after removal of duplicates is: ");
		for(int i=0; i<count;i++)
			{
				System.out.print("\t" + arr1[i]);
			}
	}
}