import java.util.Scanner;


public class AreaofTriangle {

	
	
	public static double Area(double b, double h)
	{
		return 0.5 * b * h;
	}
	
	
	public static void main(String[] args)
	
	{
		double base, height;
		
		System.out.println("Enter the base of triangle:- ");
		
		Scanner n = new Scanner(System.in);
		
		base = n.nextDouble();
		
		System.out.println("Enter the height of triangle:- ");
		
		height = n.nextDouble();
		
		n.close();
		
		System.out.println("Area of triangle is " + Area(base, height));
		
		
		
	}
	
}
