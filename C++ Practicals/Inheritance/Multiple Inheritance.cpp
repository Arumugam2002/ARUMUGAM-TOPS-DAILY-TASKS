#include<iostream>

using namespace std;

class A{
	public: 
	
	void func1()
	{
		cout<<"Function 1 is printed"<<endl;
	}
};

class B{
	
	public:
		
	void func2()
	{
		cout<<"Function 2 is printed";
	}
};

class C : public A, public B{
	
};

int main()

{
	C c1;
	
	c1.func1();
	c1.func2();
	
}


