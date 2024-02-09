#include<iostream>

using namespace std;

float BMI(float height, float weight)
{
	float BMI = (weight/(height*height));
	
	return BMI;
}

int main()
{
	float height;
	float weight;
	
	cout<<"Enter height:- ";
	cin>>height;
	
	cout<<"Enter weight:- ";
	cin>>weight;
	
	
	
	float BMI1 = BMI(height,weight);
	
	cout<<"The value of BMI is "<<BMI1;
	
	if(BMI1 < 20)
	{
		cout<<endl<<"You are underweight";
	}
	
	else if(BMI1 >= 20 && BMI1 <= 25)
	{
		cout<<endl<<"You are healthy";
	}
	
	else if(BMI1 > 25 && BMI1 <= 32)
	{
		cout<<endl<<"You are unhealthy";
	}
	
	else if(BMI1 > 32)
	{
		cout<<endl<<"You are suffering from Obesity";
	}
}
