/* 


	Template:- it is a data type in c++
	
	template are very simple yet powerful tool in c++
	
	use for versatile data type to your variables
	
	>>>How to declare template variable
	
		Syntax: template <class/typename template_variable_name>
		
*/

#include<iostream>

using namespace std;

template <class D>

D add(D a, D b)
{
	return a+b;
}

int main()
{
	cout<<add<int>(5,10)<<endl;
	cout<<add<float>(14.5,10.2)<<endl;
}
