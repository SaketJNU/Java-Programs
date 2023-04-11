import java.util.Scanner;
class IrregularArray
{
public static void main(String[] args)
 {
 System.out.print("\nEnter the number of rows: ");
  Scanner reader = new Scanner(System.in);
  int r = reader.nextInt();

 // Declaring 2-D array with r rows
 int arr[][] = new int[r][];

 // Creating a 2D array such that first row
 // has 1 element, second row has two
 // elements and so on.
int col [] = new int[r];
 for (int i = 0; i < arr.length; i++)
 {  
     System.out.print("\nEnter the number of elements in row "+ (i+1));
     col[i] = reader.nextInt();
     arr[i] = new int[col[i]];
 }
 // Initializing array
 int count = 0;
 for (int i = 0; i < arr.length; i++)
 for (int j = 0; j < arr[i].length; j++)
 arr[i][j] = count++;

 // Displaying the values of 2D Jagged array
 System.out.println("Contents of 2D Jagged Array");
 for (int i = 0; i < arr.length; i++) {
 for (int j = 0; j < arr[i].length; j++)
 System.out.print(arr[i][j] + " ");
 System.out.println();
 }
 }
} 
