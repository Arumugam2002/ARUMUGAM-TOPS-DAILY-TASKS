/* Write a C++ Program to illustrates the use of Constructors in multilevel
inheritance */ 

#include<iostream>

using namespace std;

class A{
	
	public: 
	
	A()
	{
		cout<<"This is a class of A"<<endl;
	}
	
};

class B: public A{
	
	public:
		B()
		{
			cout<<"This is a class of B"<<endl;
		}
	
};

class C: public B{
	
	public:
		
		C()
		{
			cout<<"This is a class of C"<<endl;
		}
};

int main()
{
	C c1;
	
	
}
