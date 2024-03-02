import java.util.Scanner;


public class Rectangle {
		
	public double length, breadth;
	
	public static double Area(double length, double breadth)
	{
		return length * breadth;
	}
	
	public static double Perimeter(double length, double breadth)
	{
		return 2 * (length + breadth);
	}
	
	
	
	public static void main(String[] args)
	{
		
		
		System.out.println("Enter length of a Rectangle:- ");
		
		Scanner num = new Scanner(System.in);
		
		double len = num.nextInt();
		
		System.out.println("Enter breadth of a Rectangle:- ");
		
		double bred = num.nextInt();
		
		num.close();
		
		
		
		
		System.out.println("Area of Circle is " + Area(len, bred));
		System.out.println("Circumference of Circle is " + Perimeter(len, bred));
		
	}
		
		
		
	
}
