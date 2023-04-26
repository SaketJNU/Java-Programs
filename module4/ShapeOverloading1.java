//Program to create a class named 'Shape' with a method to print This is This is shape. Then create two other classes named Rectangle, Circle inheriting the Shape class, both having a method to print This is rectangular shape and This is circular shape respectively. Create a subclass Square of Rectangle having a method to print Square is a rectangle. Now call the method of Shape and Rectangle class by the object of Square class.
class Shape
{
	public void print_shape()
	{
		System.out.print("\nThis is shape.");
	}
}

class Rectangle extends Shape 		// Rectangle class is subclass of Shape class
{
	public void print_rect()
	{
		System.out.print("\nThis is rectangular shape.");
	}
}

class Circle extends Shape 		 // Circle class is subclass of Shape class
{
	public void print_circle()
	{
		System.out.print("\nThis is circular shape.");
	}
}

class Square extends Rectangle
{
	public void print_square() 			// Square class is subclass of Rectangle class
	{
		System.out.print("\nSquare is a rectangle.");
	}
}

class ShapeOverloading1
{
	public static void main(String[] args)
	{
		Square sq = new Square(); 		//Creating object of Square class
		sq.print_shape(); 				//Object of Square class calling function of Shape class
		sq.print_rect(); 				//Object of Square class calling function of Rectangle class
	}
}