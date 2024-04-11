/* Create a class to print an integer and a character with two methods having the same
name but different sequence of the integer and the character parameters. For
example, if the parameters of the first method are of the form (int n, char c), then
that of the second method will be of the form (char c, int n).   */


class MethodOverriding{
	
	public void printStringInt(int n, char c)
	{
		System.out.println(" Integer is " + n + " and Character is " + c);
	}
	
	public void printStringInt(char c, int n)
	{
		System.out.println(" Character is " + c + " and Integer  is " + n);
	}
	
	
}




public class Q21_PrintIntegerAndCharacterWithSameMethodName {

	public static void main(String[] args)
	{
		MethodOverriding m1 = new MethodOverriding();
		
		m1.printStringInt(20, 'A');
		
		m1.printStringInt('H', 500);
	}
	
}
