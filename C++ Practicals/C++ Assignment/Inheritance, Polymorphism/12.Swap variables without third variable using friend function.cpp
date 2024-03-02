/* Write a program to swap the two numbers using friend function
without using third variable  */ 

#include<iostream>

using namespace std;

class Swap{
	int num;
	
	public:
		Swap(int num)
		{
			this->num=num;
		}
		//Friend function
		friend void swap(Swap&, Swap&);
		
};

void swap(Swap& s1, Swap& s2)// Friend function implemented

{
	
	
	cout<<"Before Swapping: "<<s1.num<<" "<<s2.num;
	
	
	//Swapping without third variable
	s1.num = s1.num + s2.num;
	s2.num = s1.num - s2.num;
	s1.num = s1.num - s2.num;
	
	cout<<endl<<"After Swapping "<<s1.num<<" "<<s2.num;
}

int main()
{
	Swap s1(10);
	Swap s2(20);
	
	swap(s1,s2);
}
