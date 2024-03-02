/* Write a C++ program to implement a class called Bank Account that has
private member variables for account number and balance. Include
member functions to deposit and withdraw money from the account. */ 

#include<iostream>

using namespace std;


//Bank class created
class BankAccount{
	
	private:
		
		int account_no;
		double balance;
		
	public: 
	
	//Constructor
	BankAccount(int acc_num, double balance_num)
	{
		account_no = acc_num;
		balance = balance_num;
	}
	
	//Deposit money function
	void depositMoney(double amount)
	{
		balance = balance + amount;
		cout<<"Money "<<amount<<"  is deposited in the account"<<endl;
		
    }
    
    //Withdraw money function created
    void withdrawMoney(double amount)
    {
    	balance = balance - amount;
    	cout<<"Money "<<amount<< " is withdrawn from the account"<<endl;
    	
	}
	
	//Getters
    
    double getBalance()
    {
    	return balance;
    	
	}
    	
};

int main()
{
	
	BankAccount account1(12334546, 75000); // Object created
	
	account1.depositMoney(10000);
	account1.withdrawMoney(20000);
	
	cout<<"Your balance is "<<account1.getBalance(); 
}
