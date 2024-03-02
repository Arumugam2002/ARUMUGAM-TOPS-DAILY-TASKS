/*4. Write a C++ program to implement a class called Circle that has private 
member variables for radius. Include member functions to calculate the
circle's area and circumference  */

#include<iostream>

using namespace std;

class Circle{
	
	private:				// radius variable is declared in private
		int r;
		
	public: 
	
		void setdata(int radius) // used setdata function to access private data member
		{
			r = radius;
		}
		
		     
		
		// Function Area is created
		double area()
		{
			return 3.14*(r*r);
		}
		
		//Function Circumference is created
		
		double circumference()
		{
			return 2 * 3.14 * r;
		}
};

int main()
{
	int radius;
	
	cout<<"Enter value of radius:- ";
	cin>>radius;
	
	Circle circle1; // Object created of circle
	
	
	circle1.setdata(radius);
	
	double areaCircle = circle1.area();
	
	double circumference = circle1.circumference();
	
	
	
	 cout<<"Area of Circle is "<<areaCircle<<endl;
	cout<<"Circumference of Circle is "<<circumference; 
}

