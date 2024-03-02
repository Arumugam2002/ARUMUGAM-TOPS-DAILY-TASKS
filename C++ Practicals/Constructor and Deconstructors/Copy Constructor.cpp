#include<iostream>

using namespace std;

class A{
	
	int x;
	public:
	A()
	{
		cout<<"Hi Everyone"<<endl;	
	}
	
	A(int a)
	{
		x = a;
		
		cout<<a<<endl;
	}
	
	A(A &obj1)
	{
		cout<<"Hello "<<obj1.x;
	}
};

int main()
{
	A obj;
	A obj1(20);
	A obj2(obj1);
}
