/* Write a C++ Program to find Area of Rectangle using inheritance */ 

#include<iostream>

using namespace std;
//Class Rectangle created
class Rectangle{
	
	public:
		double length;
		double breadth;
		
	public:
		void inputData()
		{
			cout<<"Enter length of Rectangle:- ";
			cin>>length;
			
			cout<<"Enter breadth of Rectangle:- ";
			cin>>breadth;
		}
};

//Inheritance used
class AreaRectangle: public Rectangle{
	
		private:
			double area;
	
		public:
			double AreaofRectangle(double length, double breadth)
			{
				area = length * breadth;
			}
			
			
			
};

int main()
{
	double length, breadth;
	
			cout<<"Enter length of Rectangle:- ";
			cin>>length;
			
			cout<<"Enter breadth of Rectangle:- ";
			cin>>breadth;
			
	AreaRectangle rect1;
	
	rect1.AreaofRectangle(length, breadth);
	
	cout<<endl<<"Area of Rectangle is "<<rect1.AreaofRectangle(length, breadth);
	
}
