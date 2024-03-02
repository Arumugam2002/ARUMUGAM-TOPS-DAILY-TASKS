/* Write a C++ program to create a class called Person that has private
member variables for name, age and country. Implement member
functions to set and get the values of these variables. */ 

#include<iostream>
#include<string>

using namespace std;


//Person class was created
class Person{		
	
	private:				//name, age and country variables are declared in private specifier
			
		string name;
		int age;
		string country;
		
		
		
	
	public:			
		
			// setname, setage and setcountry function is created
		void setname(string n)	// 
		{
			name = n;
		}
		
		void setage(int agevalue)
		{
			age = agevalue;
		}
		
		void setcountry(string countryname)
		{
			country = countryname;
		}
		
		
		// getname, getage, getcountry is created
		string getname()
		{
			return name;
		}
		
		int getage()
		{
			return age;
			
		}
		
		string getcountry()
		{
			return country;
		}
		
		
};

int main()
{
	
	Person person1;  //Object is created of class Person
	
	int age;
	string name, country;
	
	cout<<"Enter your name:- ";
	cin>>name;
	
	cout<<"Enter age:- ";
	cin>>age;
	
	cout<<"Enter your country name:- ";
	cin>>country;
	
	person1.setname(name);
	person1.setage(age);
	person1.setcountry(country);
	
	cout<<endl<<"Your name is "<<person1.getname()<<endl;
	cout<<"Your age is "<<person1.getage()<<endl;
	cout<<"Your country name is "<<person1.getcountry();
	
	
}
