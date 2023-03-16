import java.util.*;
class RightAngleTriangle
 {
    public static void main(String[] args) 
    {
	 int n,i,j;
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the Number of rows - ");
	n=sc.nextInt();
	for(i=1;i<=n;i++)
	{
		System.out.print("\n");
		for(j=1;j<=i;j++)
		{
			System.out.print(j);
		}
	}
    }
}