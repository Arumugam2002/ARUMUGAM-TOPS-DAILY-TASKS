/* Write a program to calculate the area of circle, rectangle and triangle
using Function Overloading
Rectangle: Area * breadth
Triangle: ½ *Area* breadth
Circle: Pi * Area *Area  */ 

#include <iostream>


using namespace std;

//Multiple functions used with same name it is called function overloading
double calculateArea(double radius) 
{
    float pi = 3.14;
    return pi * radius * radius;
}


double calculateArea(float length, float breadth) 
{
    return length * breadth;
}


double calculateArea(double base, double height)
 {
    return 0.5 * base * height;
}

int main() 
{
    
	double radius; 
	double length; 
	double breadth; 
	double base; 
	double height;
    
    
    cout<<"Enter the radius of the circle: ";
    cin>>radius;
    
    cout<<endl<<"Area of the circle is: "<<calculateArea(radius)<<endl;
    
    
    cout<<endl<<"Enter the length of the rectangle: ";
    cin>>length;
    cout<<"Enter the breadth of the rectangle: ";
    cin>>breadth;
    cout<<endl<<"Area of the rectangle is: "<<calculateArea(length, breadth)<<endl;
    
    
    cout<<endl<<"Enter the base of the triangle: ";
    cin>>base;
    cout<<"Enter the height of the triangle: ";
    cin>>height;
    cout<<endl<<"Area of the triangle is: "<<calculateArea(base, height)<<endl;

    return 0;
}

