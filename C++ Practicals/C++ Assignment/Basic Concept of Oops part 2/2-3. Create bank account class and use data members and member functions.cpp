/* Define a class to represent a bank account. Include the following members:
3. Data Member:
-Name of the depositor
-Account Number
-Type of Account
-Balance amount in the account
Member Functions
-To assign values
-To deposited an amount
-To withdraw an amount after checking balance
-To display name and balance  */ 


#include<iostream>
#include<string>

using namespace std;


//Class bankaccount created
class BankAccount{
	//data members declared
	public:
		string name;
		int account_no;
		double balance;
		
	public: 
	//Constructor
	BankAccount(string n, int acc_num, double balance_num)
	{
	    name = n;
		account_no = acc_num;
		balance = balance_num;
	}
	
	//deposit and withdraw functions
	
	void depositMoney(double amount)
	{
		balance = balance + amount;
		cout<<endl<<"Money "<<amount<<"  is deposited in the account"<<endl;
		
    }
    
    void withdrawMoney(double amount)
    {
    	balance = balance - amount;
    	cout<<endl<<"Money "<<amount<< " is withdrawn from the account"<<endl;
    	
	}
    
    //Getters
    double getBalance()
    {
    	
    	return balance;
    	
	}
	
	string getName()
	{
		return name;
	}
    	
};

int main()
{
	
	BankAccount account1("Arumugam", 12334546, 75000); // Object created
	cout<<endl<<"Name:- "<<account1.getName(); 
	
	account1.depositMoney(10000);
	account1.withdrawMoney(20000);
	
	cout<<endl<<"Your balance is "<<account1.getBalance();
	
}
