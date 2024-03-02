//1.WAP to create simple calculator using class

#include<iostream>

using namespace std;

class Calculator{
	public:
	double a,b;
	
	public:
	
	double add(double a, double b) // Addition Function
	{
		return a+b;
	}
	
	double subtract(double a, double b) // Subtraction Function
	{
		return a-b;
	}
	
	double multiply(double a, double b) // Multiplication Function
	{
		return a*b;
	}
	
	double divide(double a, double b) // Division Function
	{
		return a/b;
	}
	
	int modulo(int a, int b) // Modulo or Remainder Function
	{
		return a%b;
	}
	
	
	
	
};

int main()
{
	Calculator task1; // Object created
	
	cout<<task1.add(90,30)<<endl;
	cout<<task1.subtract(50,30)<<endl;
	cout<<task1.multiply(60,5)<<endl;
	cout<<task1.divide(80,3)<<endl;
	cout<<task1.modulo(82,30);
	
}
