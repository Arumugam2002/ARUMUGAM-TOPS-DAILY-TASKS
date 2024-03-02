#include<iostream>


using namespace std;


// Addition class created
class Addition{
	
	
		
		public: 
		//Constructor created
		Addition(double num1, double num2);
		
};


Addition::Addition(double num1, double num2)
{
   
    
	cout<<"Addition of two numbers are "<<num1+num2<<endl;
}
//Subtraction class created
class Subtraction{
	
		
		public:
		//Constructor created
		Subtraction(double num1, double num2);
		
	
};

Subtraction::Subtraction(double num1, double num2)
{
	{
		cout<<"Subtraction of two numbers are "<<num1-num2<<endl;
	}
}

//Multiplication class created
class Multiplication{
	

	
	public:
		
	Multiplication(double num1, double num2);
	
};

Multiplication::Multiplication(double num1, double num2)
{
	cout<<"Multiplication of two numbers are "<<num1*num2<<endl;
}


class Division{

	
	public:
		
	Division(double num1, double num2);
	
};

Division::Division(double num1, double num2)
{
	cout<<"Division of two numbers are "<<num1/num2;
}

int main()
{
	
	double a,b;
	
	cout<<"Enter two numbers:- ";
	cin>>a>>b;
	
		Addition add1(a,b);
		Subtraction subtract1(a,b);
		Multiplication multiply1(a,b);
		Division div1(a,b);
		
		
}
