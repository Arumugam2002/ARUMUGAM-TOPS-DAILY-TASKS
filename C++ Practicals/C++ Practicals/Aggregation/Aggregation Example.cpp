
#include<iostream>

using namespace std;
class Address{
	
	public:
		
		string city;
		string state;
		int pincode;
		
		 Address(string city, string state, int pincode)
		{
			this->city=city;
			this->state=state;
			this->pincode=pincode;
		}
		
	
};


class Employee
{
    public:
    int emp_id;
    string emp_name;
    Address *address;
    
    Employee(int emp_id, string emp_name, Address *address)
    {
        this->emp_id=emp_id;
        this->emp_name=emp_name;
        this->address = address;
    }
    
    void displayE()
    {
        cout<<"\n\n\n -----Employee Details ------ \n"<<endl;
        
        cout<<"Employee ID:- "<< emp_id<<endl;
        cout<<"Employee Name:- "<<emp_name<<endl;
        cout<<"State:- "<<address->state<<endl;
        cout<<"City:- "<<address->city<<endl;
        cout<<"Pincode:- "<<address->pincode<<endl;
    }
    
    
    
    
};

class Student{
    
    public:
    
    int stu_id;
    string stu_name;
    Address *address;
    
    Student(int stu_id, string stu_name, Address *address)
    {
        this->stu_id=stu_id;
        this->stu_name=stu_name;
        this->address=address;
        
    }
    
    void displayS()
    {
         cout<<"\n\n\n ----- Student Details ------ \n"<<endl;
        
        cout<<"Student ID:- "<< stu_id<<endl;
        cout<<"Student Name:- "<<stu_name<<endl;
        cout<<"State:- "<<address->state<<endl;
        cout<<"City:- "<<address->city<<endl;
        cout<<"Pincode:- "<<address->pincode<<endl;
    }
    
    
};



int main()
{
	 Address add1("Ahmedabad", "Gujarat", 380008);
	 
	 Employee emp1(1, "Arumugam", &add1);
	 
	 emp1.displayE();
	 
	 Student student1(10, "Rahul", &add1);
	 
	 student1.displayS();
	 
	 
	 
}
