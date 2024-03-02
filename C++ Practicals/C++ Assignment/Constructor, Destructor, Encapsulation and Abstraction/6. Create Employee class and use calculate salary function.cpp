/*  Write a C++ program to implement a class called Employee that has
private member variables for name, employee ID, and salary. Include
member functions to calculate and set salary based on employee
performance. Using of constructor */ 

#include<iostream>

using namespace std;


//Class Employee created
class Employee{
	
	private:
		
		string emp_name;
		int emp_id;
		double salary;
		
	public: 
	
	
	//Constructor
		Employee(string name, int id, double sal)
		{
			emp_name = name;
			emp_id = id;
			salary = sal;
		}
		//CalculateSalary function created
		void calculateSalary(double score)
		{
			if(score>50)
			{
				salary = salary * 1.5;
			}
			
			else if(score<50)
			{
				salary = salary * 0.5;
			}
		}
		
		
		//Setters
		void setSalary(double updateSalary)
		{
			salary = updateSalary;
		}
		//Getters
		void getEmployeeInfo()
		{
			cout<<endl<<"Employee Name:- "<<emp_name<<endl;
			cout<<"Employee ID:- "<<emp_id<<endl;
			cout<<"Employee's Salary:- "<<salary<<endl;
		}
	
		
};

int main()
{
    Employee emp1("Arumugam", 52014, 25000);
    
    Employee emp2("Rahul", 41235, 50000);
    
    emp1.getEmployeeInfo();
    
    emp1.calculateSalary(75);
    
    cout<<endl<<"After calculating Salary based on performance\n"<<endl;
    emp1.getEmployeeInfo();
    
    emp2.getEmployeeInfo();
    
    emp1.calculateSalary(45);
    
    cout<<endl<<"After calculating Salary based on performance\n"<<endl;
    emp2.getEmployeeInfo();
    
}
