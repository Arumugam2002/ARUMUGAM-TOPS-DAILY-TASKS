/*  W.A.J.P to compare a given string to the specified character sequence. Comparing 
topsint.com and topsint.com: true Comparing Topsint.com and topsint.com: false
            */


public class Q15_CompareTwoStrings {

	public static void main(String[] args)
	{
		String s1 = "topsint.com";
		String s2 = "topsint.com";
		String s3 = "Topsint.com";
		
		
		
	boolean compareString = s1.equals(s2);
	boolean compareSecondString = s1.equals(s3);
	
	System.out.println("By Comparing Both Strings It is " + compareString);
	System.out.println("By Comparing Both Strings It is " + compareSecondString);
	}
	
	
}
