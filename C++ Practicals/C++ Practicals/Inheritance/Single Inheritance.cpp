#include<iostream>

using namespace std;

class A{
	public: 
	void function()
	{
		cout<<"You are Hired";
	}
};

class B : public A{
	
};

int main()
{
	B b;
	
	b.function();
}
