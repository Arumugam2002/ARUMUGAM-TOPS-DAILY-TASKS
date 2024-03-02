#include<iostream>
#include<string>

using namespace std;

class A{
	
	public: 
	
	void function()
	{
		cout<<"This is a class of A"<<endl;
	}
};

class B{
	
	public: 
	
	void function()
	{
		cout<<"This is a class of B"<<endl;
	}
};

class C{
	
	public: 
	
	void function()
	{
		cout<<"This is a class of C"<<endl;
	}
};


int main()
{
	A object;
	B object1;
	C object2;
	
	object.function();
	object1.function();
	object2.function();
}
