//Operator Overloading Example   


#include<iostream>

using namespace std;

class A{
	
	public:
		int x;
		int y=0;
		
		A(int a)
		{
			x=a;
		}
		
		int operator +(A obj)
		{
			return x+obj.x;
		}
	
};

int main()
{
	A obj1(50);
	A obj2(50);
	
	cout<<"Result is "<<obj1+obj2;
}
