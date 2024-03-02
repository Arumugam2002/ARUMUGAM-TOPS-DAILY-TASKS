#include<iostream>
#include<string.h>

using namespace std;

class A{
	public:
	string name;
	int passingyear;
	int eno;
	
};

int main()
{
	A obj;
	
	obj.name = "XYZ";
	obj.eno = 540;
	obj.passingyear = 2022;
	
A obj1;
	
	obj1.name = "ABC";
	obj1.eno = 6015;
	obj1.passingyear = 2025;
	
	cout<<obj.name<<" "<<obj.eno<<" "<<obj.passingyear<<endl;
	cout<<endl<<obj1.name<<" "<<obj1.eno<<" "<<obj1.passingyear;
}


