/* We have to calculate the area of a rectangle, a square and a circle. Create an abstract 
class 'Shape' with three abstract methods namely 'RectangleArea' taking two 
parameters, 'SquareArea' and 'CircleArea' taking one parameter each. The 
parameters of 'RectangleArea' are its length and breadth, that of 'SquareArea' is its 
side and that of 'CircleArea' is its radius. Now create another class 'Area' containing 
all the three methods 'RectangleArea', 'SquareArea' and 'CircleArea' for printing the 
area of rectangle, square and circle respectively. Create an object of class 'Area' and 
call all the three methods.          */



abstract class Shape{
	
	abstract void RectangleArea(double length, double breadth);
	
	abstract void SquareArea(double side);
	
	abstract void CircleArea(double radius);
}


class Area extends Shape{

	@Override
	void RectangleArea(double length, double breadth) {
		
		double areaRectangle = length * breadth;
		
		System.out.println("Area of Rectangle is " + areaRectangle);
		
	}

	@Override
	void SquareArea(double side) {
		double areaSquare = side * side;
		
		System.out.println("Area of Square is " + areaSquare);
		
	}

	@Override
	void CircleArea(double radius) {
		
		float pi = 3.14f;
		double areaCircle = pi * (radius * radius);
		
		System.out.println("Area of Circle is " + areaCircle);
		
	}
	
	
	
}
public class Q32_CalculatePerimeterAndAreasOfGivenShapes {
	
	public static void main(String[] args)
	{
		Area Rectangle1 = new Area();
		Area Square1 = new Area();
		Area Circle1 = new Area();
		
		Rectangle1.RectangleArea(45, 50);
		Square1.SquareArea(5);
		Circle1.CircleArea(3);
		
		
	}

}
