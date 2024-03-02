// MUltiple Inheritance

#include<iostream>

using namespace std;

class A{
    
    public: 
	
	void func1()
	{
		cout<<"This is a class of A"<<endl;
	}
	
};

class B{
    
    public:
	
	void func1()
	{
		cout<<"This is a class of B"<<endl;
	}
	
};

class C: public B, public A{
    
	
};

int main()
{
	C obj1;
	
	obj1.func1();
	
	
	
}
