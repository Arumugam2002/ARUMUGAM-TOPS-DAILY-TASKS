/* W.A.J.P to check whether a given string ends with the contents of another string. 
"Java Exercises" ends with "se"? False "Java Exercise" ends with "se"? True          */



public class Q16_StringEndsWithProgram {

	public static void main(String[] args)
	{
		String str1 = "Java Exercises";
		String str2 = "Java Exercise";
		
		String str3 = "se";
		
		
		boolean endsWithString1 = str1.endsWith(str3);
		boolean endsWithString2 = str2.endsWith(str3);
		
		
		System.out.println("It does not ends with se, so it is " + endsWithString1);
		System.out.println("It end with se, so it is " + endsWithString2);
	}
	
	
}
