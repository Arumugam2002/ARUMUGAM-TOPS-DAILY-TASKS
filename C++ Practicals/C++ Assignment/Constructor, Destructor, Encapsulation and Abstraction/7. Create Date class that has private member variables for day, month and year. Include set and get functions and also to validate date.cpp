/* Write a C++ program to implement a class called Date that has private
member variables for day, month, and year. Include member functions to
set and get these variables, as well as to validate if the date is valid */

#include<iostream>

using namespace std;


//Date class created
class Date{
	private:
		
		int day;
		int month;
		int year;
		
	public:
		//Constructor created with default values
		Date() : day(1), month(1), year(2000) {}
		//Setters
		void setDay(int d)
		{
			if(isValidDate(month,year,d))
			{
				day = d;	
			}
			else
			{
				cout<<"Invalid input"<<endl;
			}
			
		}
	
		void setMonth(int mon)
		{
			if(isValidDate(mon,year,day))
			{
				month = mon;
			}
			else
			{
				cout<<"Invalid Input"<<endl;
			}
			
		}
		
		void setYear(int y)
		{
			if(isValidDate(month,y,day))
			{
				year = y;
			}
			else
			{
				cout<<"Invalid Input"<<endl;
			}
			
		}
		
		
		//Getters
		int getDay()
		{
			return day;
		}
		
		int getMonth()
		{
			return month;
		}
		
		int getYear()
		{
			return year;
		}
		
		// To validate the date
		bool isValidDate(int month, int year, int day)
		{
			if(month<1 || month>12)
			{
				return false;
			}
			else if(day<1 || day>howManyDaysInMonth(month,year))
			
			{
				return false;
			}
			
			return true;
		}
		
		
		//days per month function created
		int howManyDaysInMonth(int m, int y)
		{
			if(m==2)
			{
				if(y%4==0)
				{
					return 29;
					
				}
				else
				return 28;
			}
			else if(m==4 || m==6||m==9||m==11)
			{
				return 30;
			}
			else
			{
				return 31;
			}
		}
		
		
	
};

int main()
{
	Date date1;
	
	date1.setDay(20);
	date1.setMonth(7);
	date1.setYear(2002);
	
	cout<<"Date: "<<date1.getDay()<<" - "<<"Month: "<<date1.getMonth()<<" - "<<"Year:- "<<date1.getYear()<<endl;
	
	
	Date date2;
	
	date2.setDay(35);
	date2.setMonth(5);
	date2.setYear(2005);
	
	cout<<"Date: "<<date2.getDay()<<" - "<<"Month: "<<date2.getMonth()<<" - "<<"Year:- "<<date2.getYear()<<endl;
}
