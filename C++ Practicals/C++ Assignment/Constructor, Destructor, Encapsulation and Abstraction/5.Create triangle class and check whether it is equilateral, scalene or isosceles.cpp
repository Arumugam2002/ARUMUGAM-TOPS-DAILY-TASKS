/* Write a C++ program to create a class called Triangle that has private
member variables for the lengths of its three sides. Implement member
functions to determine if the triangle is equilateral, isosceles, or scalene */ 

#include<iostream>

using namespace std;

//Triangle class created
class Triangle{
	private:
		float side1, side2, side3;
		
	public:
		Triangle(float s1, float s2, float s3)
		
		{
			side1= s1;
			side2 = s2;
			side3 = s3;	
		}
		
		//To check triangle is equilateral
		bool isEquilateral()
		{
			return (side1 == side2 && side2 == side3 && side3 == side1);
		}
		//To check triangle is Isosceles
		
		bool isIsosceles()
		{
			return (side1 == side2 || side1 == side3 || side2 == side3);
		}
		//To check triangle is Scalene
		
		bool isScalene()
		{
			return (!isEquilateral() && !isIsosceles());
		}
		
};


int main()
{
	
	float s1, s2, s3;
	
	cout<<"Enter the sides of the triangle:- ";
	cin>>s1>>s2>>s3;
	
	Triangle t1(s1,s2,s3);
	
	if(t1.isEquilateral())
	{
		cout<<"Triangle is equivalent";
	}
	
	else if(t1.isScalene())
	{
		cout<<"Triangle is Scalene";
	}
	
	else if(t1.isIsosceles())
	{
		cout<<"Triangle is Isosceles";
	}
	
	else
	{
		cout<<"Invalid";
	}
}
