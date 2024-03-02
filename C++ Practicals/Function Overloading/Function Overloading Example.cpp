#include<iostream>

using namespace std;

int A(int a,int b)
{
	return a+b;
}

int A(double a, double b)
{
	return a-b;
}


int main()
{
	cout<<A(15,30)<<endl;
	cout<<A(25.5,10.5)<<endl;
}
