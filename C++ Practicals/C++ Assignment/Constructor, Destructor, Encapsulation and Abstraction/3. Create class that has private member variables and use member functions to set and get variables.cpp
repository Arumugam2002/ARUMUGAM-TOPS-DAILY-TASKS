/* Write a C++ program to create a class called Car that has private
member variables for company, model, and year. Implement member
functions to get and set these variables. */ 

#include<iostream>
#include<string>

using namespace std;

//Car class created
class Car{
	
	private: 
	string company;
	int model;
	int year;
	
	public:
		
		// Setters
		void setCompany(string com)
		{
			company = com;
		}
		
		void setModel(int mod)
		{
			model = mod;
		}
		
		void setYear(int y)
		{
			year = y;
		}
		
		//Getters
		string getCompanyName()
		{
			return company;
		}
		
		int getModel()
		{
			return model;
		}
		
		int getYear()
		{
			return year;
		}
		
		
	
};

int main()
{

	//BMW object created and functions used
	Car bmw;
	bmw.setCompany("BMW");
	bmw.setModel(745);
	bmw.setYear(1990);
	
cout<<"Your car company name is " <<bmw.getCompanyName()<<endl;
cout<<"Your car model number is "<<bmw.getModel()<<endl;
cout<<"Car manufactured in "<<bmw.getYear()<<endl;

//Audi object created and functions used
	Car Audi;
	Audi.setCompany("Audi");
	Audi.setModel(4123);
	Audi.setYear(1975);
	
cout<<endl<<"Your car company name is " <<Audi.getCompanyName()<<endl;
cout<<"Your car model number is "<<Audi.getModel()<<endl;
cout<<"Car manufactured in "<<Audi.getYear()<<endl;
	
	
	
	
	
}
