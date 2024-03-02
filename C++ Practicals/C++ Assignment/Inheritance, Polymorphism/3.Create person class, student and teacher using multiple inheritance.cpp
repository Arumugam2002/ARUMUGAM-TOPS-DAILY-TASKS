	/*Create a class person having members name and age. Derive a class student
	having member percentage. Derive another class teacher having member
	salary. Write necessary member function to initialize, read and write data.
	Write also Main function (Multiple Inheritance)*/ 	
	
#include<iostream>
#include<string>

using namespace std;
//Person class created
class Person{
	
	public:
		
	string name;
	int age;
	
	//input data function created
	void inputData()
	{
		cout<<"Enter your name:- ";
		cin>>name;
		
		cout<<"Enter Age:- ";
		cin>>age;
		
	}
	//display data function created
	void printData()
	{
		cout<<endl<<"Your Age and Name is "<<name<<" "<<age<<endl;
	}
};


//Student class created
class Student{
	
public:
		
		int percentage;
		
		public:
			
			void inputData()
			{
				cout<<"Enter percentage:- ";
				cin>>percentage;
			}
			
			void printData()
			{
				cout<<endl<<"Your Percentage is "<<percentage<<endl;
			}
			
};
//Multiple Inheritance used
class Teacher: public Student, public Person{
	private:
		
		double salary;
		
		public:
			
			
		void inputData()
		{
			Person::inputData();
			Student::inputData();
			cout<<"Enter Teacher's Salary:- ";
			cin>>salary;
		}
		
		void printData()
		{
			Person::printData();
			Student::printData();
			cout<<"Teacher's Salary is "<<salary;
		}
		
};


int main()
{
	Teacher t1;
	
	t1.inputData();
	t1.printData();
}
