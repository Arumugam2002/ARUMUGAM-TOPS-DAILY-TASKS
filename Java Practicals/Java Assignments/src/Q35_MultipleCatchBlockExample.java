/*  W.A.J. P to demonstrate multiple catch blocks, (one is to handle divide by zero 
exception and another one is to handle
ArrayIndexOutOfBoundException) int a [] =new int [5]; a [5]=30/0;
            */ 


public class Q35_MultipleCatchBlockExample {

	public static void main(String[] args)
	{
		int[] a = new int[5];
		
		
		//Arithmetic Exception(Divide By Zero Exception Caught) Example
		try {
			
			a[4] = 30/0;
			
			
		} catch (ArithmeticException e) {


			System.out.println("Arithmetic Exception has been caught:- " + e.getMessage());
		}
		
		catch (ArrayIndexOutOfBoundsException e) {
			
			System.out.println("ArrayIndexOutOfBoundsException has been caught:- " + e.getMessage());
		}
		
		//ArrayIndexOutOfBoundsException Example
		
		try { 
			
			a[8] = 20;
			
			
		} catch (ArithmeticException e) {


			System.out.println("Arithmetic Exception has been caught:- " + e.getMessage());
		}
		
		catch (ArrayIndexOutOfBoundsException e) {
			
			System.out.println("ArrayIndexOutOfBoundsException has been caught:- " + e.getMessage());
		}
	}
	
	
}
