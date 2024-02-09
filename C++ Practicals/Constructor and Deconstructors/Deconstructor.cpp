#include<iostream>

using namespace std;
class A{
	public:
		
		//Constructor
		A()
		{
			cout<<"This is A"<<endl;
		}
		//Deconstructor
		~A()
		{
			cout<<"This is B"<<endl;
		}
		
		
};


int main()
{
	A obj;
}
