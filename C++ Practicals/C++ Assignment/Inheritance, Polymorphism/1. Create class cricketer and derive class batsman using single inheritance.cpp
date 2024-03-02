/* Assume a class cricketer is declared. Declare a derived class batsman from
cricketer. Data member of batsman. Total runs, Average runs and best
performance. Member functions input data, calculate average runs, Display
data. (Single Inheritance) */ 

#include<iostream>
#include<string>

using namespace std;


//Cricketer class created
class Cricketer{
	
	public:
		string name;
		int playedMatches;
		
		//setters
	void inputData()
	{
		cout<<endl<<"Enter Cricketer name:- ";
		cin>>name;
		
		cout<<"Enter total Matches played:- ";
		cin>>playedMatches;
	}
	
};

class Batsman: public Cricketer{ // Inheritance used
	private:
		int runs;
		double avg_runs;
		int bes_perform;
		
	public:
		//Function created
		int calculateAverageRuns()
		{
			cout<<"Enter total runs scored:- ";
			cin>>runs;
			
			avg_runs = runs/playedMatches;
			
			cout<<"Enter best performance:-  ";
			cin>>bes_perform;
		}
		
		void displayInfo()
		{
			cout<<"Player Name:- "<<name<<endl;
			cout<<"Total Matches Played:- "<<playedMatches<<endl;
			cout<<"Total runs scored:- "<<runs<<endl;
			cout<<"Average runs per matches:- "<<avg_runs<<endl;
			cout<<"Best performance of cricketer:- "<<bes_perform<<endl;
		}
};

int main()
{
	Batsman batsman1;
	
	batsman1.inputData();
	
	batsman1.calculateAverageRuns();
	
	cout<<endl<<"----------Display Data-----------\n"<<endl;
	
	batsman1.displayInfo();
	
	Batsman batsman2;
	
	batsman2.inputData();
	
	batsman2.calculateAverageRuns();
	
	cout<<endl<<"----------Display Data-----------\n"<<endl;
		
	batsman2.displayInfo();
	
	
}


