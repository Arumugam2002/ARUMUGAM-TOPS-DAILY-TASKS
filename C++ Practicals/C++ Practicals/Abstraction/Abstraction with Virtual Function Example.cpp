#include<iostream>

using namespace std;

class A{
	public:
	virtual void abc() = 0;
	
};

class B : public A{
	public:
	void abc()
	{
		cout<<"This is B"<<endl;
	}
	
};

class C : public A{
	public:
	void abc()
	{
		cout<<"This is C"<<endl;
	}
};

int main()
{
	B obj;
	obj.abc();
	
	C obj1;
	obj1.abc();
}
