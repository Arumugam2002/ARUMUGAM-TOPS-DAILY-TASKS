#include<iostream>

using namespace std;

int result;
void A(int a, int b)
{
    
	cout<<(a+b)<<endl;
}


void A(double a, double b)
{
    cout<<(a-b)<<endl;
	
}

void A(int a, int b, int c)
{
     cout<<(a*b*c)<<endl;
	
} 


int main()
{
	A(20,20);
	A(75.5,45.5);
	A(10,10,10);
	
	
} 
