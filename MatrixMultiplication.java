//Program to multiply two given matrices.
import java.util.Scanner;

public class MatrixMultiplication
{
	public static void main(String args[])
	{
		Scanner reader = new Scanner(System.in);
		System.out.print("\nEnter the row size of first matrix, row1: ");
		int row1 = reader.nextInt();
		System.out.print("\nEnter the column size of first matrix, col1: ");
		int col1 = reader.nextInt();
		System.out.print("\nEnter the row size of second matrix, row2: ");
		int row2 = reader.nextInt();
		System.out.print("\nEnter the column size of second matrix, col2: ");
		int col2 = reader.nextInt();
		if(col1 == row2)
		{
			//code to input first matrix
			int matrix1[][] = new int[row1][col1];
			System.out.print("\nEnter the first matix -----------");
			for(int i=0; i<row1; i++)
			{
				for(int j=0; j<col1 ; j++)
				{
					System.out.print("\nEnter the "+(i+1)+(j+1)+" element: ");
					matrix1[i][j] = reader.nextInt();
				}
			}
			// code to input second matrix
			int matrix2[][] = new int[row2][col2];
			System.out.print("\nEnter the second matix -----------");
			for(int i=0; i<row2; i++)
			{
				for(int j=0; j<col2 ; j++)
				{
					System.out.print("\nEnter the "+(i+1)+(j+1)+" element: ");
					matrix2[i][j] = reader.nextInt();
				}
			}
			//code to perform matrix multilpication
			int[][] matrix3 = new int[row1][col2];
			for(int i=0; i<row1; i++)
				{
			    for(int k=0;k<col2;k++)
					{   
						int	temp = 0 ;
						for(int j=0;j<col1; j++)
						{
							temp = temp + matrix1[i][j]*matrix2[j][k];
						}
						matrix3[i][k] = temp;
					}
				}
			// code to diplay the matrix and their output
			System.out.print("\nEntered First Matrix: \n");
			for(int i=0; i<row1; i++)
			{
				System.out.print("\n");
				for(int j=0;j<col1;j++)
				{
					System.out.print("\t" + matrix1[i][j]);
				}
			}

			System.out.print("\nEntered Second Matrix: \n");
			for(int i=0; i<row2; i++)
			{
				System.out.print("\n");
				for(int j=0;j<col2;j++)
				{
					System.out.print("\t" + matrix2[i][j]);
				}
			}
			System.out.print("\nRequired multiplication is: \n");
			for(int i=0; i<row1; i++)
			{
				System.out.print("\n");
				for(int j=0;j<col2;j++)
				{
					System.out.print("\t" + matrix3[i][j]);
				}
			}
		}
		else
		{
			System.out.print("\nMultiplication is not possible as matrix dimensions are not consistent.");
		}
	}
}