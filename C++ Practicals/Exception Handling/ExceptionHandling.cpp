//Exception Handling:- To handle the runtime errors

#include<iostream>

using namespace std;


float div(float a, float b)
{
	
	if(b == 0)
	{
		throw "Cannot divide by 0";
		
	}
	
	else
	{
		return a/b;
	}
	
	
}

int main()
{
	float x,y;
	
	cout<<"Enter first value:- "<<endl;
	cin>>x;
	
	cout<<"Enter second value:- "<<endl;
	cin>>y;
	
	
	try{
	    cout<<div(x,y);
	}
	
	catch(const char *c){
	    cout<<"Zero Division Error:- "<<c;
	}
	
	   	
}
