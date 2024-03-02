/* Write a program to concatenate the two strings using Operator Overloading */ 

#include<iostream>
#include<string>

using namespace std;


//Class words created
class Words{
	public:
		
		string str1;
	
		
		
		Words(string a)
		{
			str1=a;
		}
		
		//Operater overloading created
		string operator +(Words obj)
		{
			return str1+obj.str1; // Concatenation 
		}
	
};


	

int main()
{
	Words obj1("Aru");
	Words obj2("mugam");
	
	cout<<"Result is "<<obj1+obj2;
}
