//Program to implement a Book class that stores the details of a book such as its code, title and price (Use constructors to initialize the objects).
import java.util.*;
class BookDetails
{
	public String title;
	public String isbnnumber;
	public double price;
	
	public BookDetails(String t,String n,double p)
	{
		title=t.trim();
		isbnnumber=n.trim();
		price=p;
	}

	public void getTitle()
	{
		System.out.print("\nTitle of Book: " + title);
	}

	public void getIsbnnumber()
	{
		System.out.print("\nISBN number of Book: " + isbnnumber);
	}

	public void getPrice()
	{
		System.out.print("\nPrice of Book: " + price);
	}

	public void setTitle()
	{
		this.title = title;
	}

	public void setISBNnumber(String isbnnumber)
	{
		this.isbnnumber = isbnnumber;
	}

	public void setCost(int price)
	{
		this.price=price;
	}

	public void show()
	{
		getTitle();
		getIsbnnumber();
		getPrice();
	}

	public static void main(String args[])
	{
		BookDetails b1 = new BookDetails("Machine Learning", "IBN20000", 500.00);
		b1.show();
		
		BookDetails b2 = new BookDetails("Python Programmimg", "ISBN2018", 475.00);
		b2.show();
	}
}