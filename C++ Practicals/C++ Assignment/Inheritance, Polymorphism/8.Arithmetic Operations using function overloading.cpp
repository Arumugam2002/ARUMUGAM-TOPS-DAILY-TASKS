/* Write a program to Mathematic operation like Addition, Subtraction,
Multiplication, Division Of two number using different parameters and
Function Overloading */ 

#include<iostream>

using namespace std;

//Multiple functions created using same name
int add(double a, double b){
	return a+b;
}
int add(double a, double b, double c){
	return a+b+c;
}


int subtract(double a, double b){
	return a-b;
}
int subtract(double a, double b, double c){
	return a-b-c;
}

int multiply(double a, double b){
	return a*b;
}
int multiply(double a, double b, double c){
	return a*b*c;
}


int div(double a, double b)
{
	return a/b;
}


int main()
{
	cout<<add(30,40)<<endl;
	
	cout<<add(30,40,80)<<endl;
	
	cout<<subtract(40,30)<<endl;

	cout<<subtract(40,30,5)<<endl;
		
	cout<<multiply(40,20)<<endl;
	
	cout<<multiply(40,20,10)<<endl;
	
	cout<<div(20,20)<<endl;
	

}





