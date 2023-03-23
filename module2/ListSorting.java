//Program for sorting a given list of names in ascending order
import java.util.Scanner;

public class ListSorting
{
     public static void main(String args[])
     {
           System.out.print("Code for sorting the input name in ascending order ---");
           NameList nl = new NameList();
           nl.sort_names();
     }
}

class NameList
{
    void sort_names()
    {
        Scanner reader = new Scanner(System.in);
        System.out.print("\nEnter the numbers of names: ");
        int num = reader.nextInt();
        String[] names = new String[num];
        System.out.print("\nEnter the names -----------");
        for (int i = 0; i < num; i++  )
        {
            System.out.print("\nEnter the name "+(i+1) + ":  ");
            names[i] = new String(reader.next());
        }
        // Code for sorting names
        for (int i = 0; i<num; i++)
        {
            for (int j=i+1; j<num; j++)
            {
                if (names[i].compareTo(names[j]) > 0)
                {
                    String temp = names[i];
                    names[i] = names[j];
                    names[j] = temp;
                }
            }
        }
        // End of Sorting codes
        System.out.print("\nSorted names are ---");
        for (int i=0; i<num; i++)
        {
            System.out.print("\n" + names[i]);
        }

    }

}