#include<iostream>

using namespace std;

class A{
	
	private: 
	int l = 50;
	int b = 10;
	friend void one(A);
	
};

void one(A obj)
{
	
	int area = obj.l * obj.b;
	cout<<"Area of Rectangle is "<<area;
}

int main()
{
	A obj;
	one(obj);
}
