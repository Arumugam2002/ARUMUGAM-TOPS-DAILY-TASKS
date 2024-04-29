/* W.A.J.P to create a custom exception if Customer withdraw amount which is greater 
than account balance then program will show custom exception otherwise amount
will deduct from account balance. Account balance is: 2000 Enter withdraw amount: 
2500
Sorry, insufficient balance, you need more 500 Rs. To perform this transaction.               */


 class InsufficientAmountException extends Exception{
	
	
	private static final long serialVersionUID = 1L;
	int lessMoney;
	
	public InsufficientAmountException(int lessMoney)
	{
		System.out.println("Sorry, insufficient balance, you need more " + lessMoney + " Rs. to perform this transaction.");
		this.lessMoney = lessMoney;
		
	}
	
	public int getLessMoney()
	{
		return lessMoney;
	}
	
	
}






public class Q39_CustomerWithdrawException {

	
	int balance;
	
	public Q39_CustomerWithdrawException(int balance)
	{
		this.balance = balance;
		
	}
	
	public void withdrawAmount(int amount) throws InsufficientAmountException
	{
		if(amount > balance)
		{
			throw new InsufficientAmountException(amount - balance);
		}
		
		balance -= amount;
		
		System.out.println("Withdrawal Successful, Current Amount is " + balance);
	}
	
	
	public static void main(String[] args)
	{
		
		int initialBalance = 2000;
		int withdrawalAmount = 2500;
		
		Q39_CustomerWithdrawException account = new Q39_CustomerWithdrawException(initialBalance);
		
		try {
			account.withdrawAmount(withdrawalAmount);
		} catch (InsufficientAmountException e) {
			
			System.out.println(e.getMessage());
		}
		
		
	}
	
	
}
