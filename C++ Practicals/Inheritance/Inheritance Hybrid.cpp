#include<iostream>

using namespace std;


class A{
	public: 
	
	A(){
	
		cout<<"This is a A"<<endl;
	
	}
};

class B : public A{
	
	public: 
	
	B()
	{
		cout<<"This is a B"<<endl;
	}
	
};

class C{
	
	public:
		
		C()
		{
			cout<<"This is a C"<<endl;
		}
	
};

class D : public B, public C{
	
	public:
		
		D()
		{
			cout<<"This is a D"<<endl;
		}
	
};




int main()
{
	D d1;
	
	
}
