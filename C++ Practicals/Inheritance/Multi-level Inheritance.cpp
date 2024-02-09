#include<iostream>

using namespace std;

class A {
	public: 
	
	void print1()
	{
		cout<<endl<<"What's your name?"<<endl;
	}
};

class B : public A{
	public: 
	
	void print2()
	{
		cout<<"If you know my atleast give me your number";
	}
};

class C : public B{
	
};

int main()
{
	C cheetah;
	
	cheetah.print1();
	cheetah.print2();
/*	
	B ball;
	
	ball.print1();
	ball.print2(); */ 
	
}
