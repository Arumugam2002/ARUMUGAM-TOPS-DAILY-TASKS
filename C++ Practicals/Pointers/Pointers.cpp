#include<iostream>
#include<string>

using namespace std;

int main()
{
	string car = "Porsche";
	string *ptr = &car;
	
	cout<<car<<endl;
	cout<<&car<<endl;
	
	cout<<ptr;
}
