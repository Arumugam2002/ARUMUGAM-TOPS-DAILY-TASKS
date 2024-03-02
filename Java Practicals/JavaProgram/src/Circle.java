import java.util.Scanner;


public class Circle {
		
	public double radius;
	
	public static double Area(double radius)
	{
		return 3.14 * radius * radius;
	}
	
	public static double Circumference(double radius)
	{
		return 2 * 3.14 * radius;
	}
	
	
	
	public static void main(String[] args)
	{
		
		
		System.out.println("Enter radius of a circle:- ");
		
		Scanner num = new Scanner(System.in);
		
		double r = num.nextInt();
		
		num.close();
		
		
		
		
		System.out.println("Area of Circle is " + Area(r));
		System.out.println("Circumference of Circle is " + Circumference(r));
		
	}
		
		
		
	
}
