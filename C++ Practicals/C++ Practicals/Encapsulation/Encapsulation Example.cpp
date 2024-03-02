#include<iostream>
#include<string>

using namespace std;

class A{
	
	private:
		int data;
		
	public:
		void setData(int d)
		{
			data = d;
		}
		
		int getData()
		{
			return data;
		}
	
	
};


int main()
{
	int salary;
	
	A object;
	
	cout<<"Enter your salary:- ";
	cin>>salary;
	
	object.setData(salary);
	cout<<"Your Salary is "<<object.getData();
}
