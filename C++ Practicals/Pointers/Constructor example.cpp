#include<iostream>
#include<string>

using namespace std;

class one{
	
	public: 
	string abc;
	string pqr;
	int xyz;
	
	one(string a, string x, int p);
	    
	
};

one::one(string a, string x, int p)
	{
		abc = a;
		xyz = p;
		pqr = x;
	}



int main()
{
	one one1("hello ", "World ", 123);
	one two1("How ", "are you? ", 456);
	
	cout<<one1.abc<<one1.pqr<<one1.xyz<<endl;
	cout<<two1.abc<<two1.pqr<<two1.xyz<<endl;
	
}
