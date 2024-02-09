#include<iostream>

using namespace std;

class Circle{
	private: 
	
	int r=15;
	
	friend void one(Circle);
	
};

void one(Circle obj)
{
	float area;
	area = 3.14 * (obj.r * obj.r);
	cout<<"Area of Circle is "<<area;
}




int main()
{
	Circle obj;
	one(obj);
	
}
