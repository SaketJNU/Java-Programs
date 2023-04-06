//Program to find element from an sorted array using binary search
import java.util.Scanner;

class BinarySearch
{
	public static void main(String args[])
	{
		Scanner reader = new Scanner(System.in);
		System.out.print("\nEnter the size of array: ");
		int size = reader.nextInt();
		int[] arr = new int[size];
		System.out.print("\nEnter the sorted array -----------------");
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



		// Code for binary search
		System.out.print("\nEnter the number  which you want to search: ");
		int key = reader.nextInt();
		int first = 0;
		int last = arr.length - 1;

		int mid = (first + last)/2;  
   		while( first <= last )
   		{  
      		if ( arr[mid] < key )
      		{  
        		first = mid + 1;     
      		}
      		else if ( arr[mid] == key )
      		{  
        		System.out.println("Element is found at index: " + mid);  
        		break;  
      		}
      		else
      		{  
         		last = mid - 1;  
      		}  
      		mid = (first + last)/2;  
   		}  
   		if ( first > last )
   		{  
      		System.out.println("Element is not found!");  
   		}  
	}
}