/* Write a C++ program to create a class called Rectangle that has private
member variables for length and width. Implement member functions to
calculate the rectangle's area and perimeter */ 

#include<iostream>

using namespace std;

class Rectangle{
	
	private:			// length and breadth variable is declared in private
		
		int length;
		int breadth;
		
	public:
		
		void setlength(int l)	/*		function setlength and setbreadth is used to access
										private data members  */	
		{
			length = l;
		}
		
		void setbreadth(int b)
		{
			breadth = b;
		}
		
		double areaRectangle()		// For calculation of areaRectangle is created for area of rectangle //
		{
			return length * breadth;
		}
		
		double perimeterRectangle()  // For calculation of perimeter Rectangle is created for perimeter of rectangle //
		{
			return 2 * (length + breadth);
		}
	
};

int main()
{
	
	int length;
	int breadth;
	
	cout<<"Enter length of Rectangle:- ";
	cin>>length;
	
	cout<<"Enter breadth of Rectangle:- ";
	cin>>breadth;
	
	Rectangle rectangle1; // rectangle object created
	
	rectangle1.setlength(length);
	
	rectangle1.setbreadth(breadth);
	
	double area = rectangle1.areaRectangle();
	
	double perimeter = rectangle1.perimeterRectangle();
	
	
	cout<<"Area of Rectangle is "<<area<<endl;
	cout<<"Perimeter of Rectangle is "<<perimeter<<endl;
	
	
	
}
