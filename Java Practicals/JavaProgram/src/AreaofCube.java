import java.util.Scanner;


public class AreaofCube {
	
	public static double Cube(double len)
	{
		return len * len * len;
	}
	
		public static void main(String[] args)
		{
			double length;
			
			System.out.println("Enter the length for cube:- ");
			Scanner num = new Scanner(System.in);
			
			length = num.nextInt();
			
			System.out.println("Area of cube:- " + Cube(length));
			
			
			
			
			
		}
}
