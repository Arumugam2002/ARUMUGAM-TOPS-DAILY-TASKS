/* Create an abstract class 'Bank' with an abstract method 'getBalance'. $100, $150 and
$200 are deposited in banks A, B and C respectively. 'BankA', 'BankB' and 'BankC'
are subclasses of class 'Bank', each having a method named 'getBalance'. Call this 
method by creating an object of each of the three classes.
      */


abstract class Bank{
	
	abstract void getBalance();
}


class BankA extends Bank{
	
	double bankAmountA = 100;
	
	public void getBalance()
	{
		System.out.println("Amount deposited in Bank A is $" + bankAmountA);
	}
	
}

class BankB extends Bank{
	
	
	double bankAmountB = 150;
	
	public void getBalance()
	{
		System.out.println("Amount deposited in Bank B is $" + bankAmountB);
	}
	
}

class BankC extends Bank{
	
	double bankAmountC = 200;
	
	public void getBalance()
	{
		System.out.println("Amount deposited in Bank C is $" + bankAmountC);
	}
	
}
public class Q29_CreateAbstractBankClassAndtheirSubclasses {

	 public static void main(String[] args)
	 {
		 BankA b1 = new BankA();
		 BankB b2 = new BankB();
		 BankC b3 = new BankC();
		 
		 b1.getBalance();
		 b2.getBalance();
		 b3.getBalance();
		 
		 
	 }
	
}
