	/*  Write a program to print the area and perimeter of a triangle having sides of 3, 4 and 
	5 units by creating a class named 'Triangle' without any parameter in its constructor.      */


class Triangle{
	
	
	double side1 = 3;
	double side2 = 4;
	double side3 = 5;
	
	public Triangle()
	{
		// No parameters is initialized
	}
	
	public void AreaTriangle(){
		
		
		//Using heron's For Triangle as it requires three sides.
		double s = (side1 + side2 + side3)/2;
		
		double area = Math.sqrt(s*(s - side1) * (s - side2) * (s - side3)); 
		
		System.out.println("Area of Triangle is " + area);
		
	}
	
	public void PerimeterTriangle(){
		
		double perimeter = side1 + side2 + side3;
		
		System.out.println("Perimeter of Triangle is " + perimeter);
		
	}
}


public class Q26_CreateTriangleClassAndPrintAreaPerimeterWithoutParameters {

	public static void main(String[] args)
	{
		Triangle t1 = new Triangle();
		
		t1.AreaTriangle();
		t1.PerimeterTriangle();
	}
	
	
}
