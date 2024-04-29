/* Create a class named 'Print Number' to print various numbers of different data types 
by creating different methods with the same name 'printn' having a parameter for 
each data type                                         */

class PrintNumber{
		
		
		public void printn(int num)
		{
			System.out.println("Number is " + num);
		}
		
		public void printn(float num)
		{
			System.out.println("Number is " + num);
		}
		
		public void printn(double num)
		{
			System.out.println("Number is " + num);
		}
		
		public void printn(long num)
		{
			System.out.println("Number is " + num);
		}
		
		
		
	}

public class Q20_PrintNumberWithDifferentDataTypes {

	
	
	public static void main(String[] args)
	{
		PrintNumber p1 = new PrintNumber();
		
		p1.printn(100);
		p1.printn(100.25);
		p1.printn(100L);
		p1.printn(100.14F);
		
	}
}
