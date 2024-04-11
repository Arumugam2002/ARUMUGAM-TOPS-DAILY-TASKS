

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
