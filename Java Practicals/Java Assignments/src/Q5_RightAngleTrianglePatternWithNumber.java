/* Write a program in Java to display the pattern like right angle triangle with a number. */


public class Q5_RightAngleTrianglePatternWithNumber {

	public static void main(String[] args)
	{
		int i,j;
		
		for(i=1;i<=5;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			
			System.out.println();
		}
	}
	
}
