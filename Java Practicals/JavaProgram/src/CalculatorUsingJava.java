import java.util.Scanner;


public class CalculatorUsingJava {
	public static void main(String[] args)
	{
		double a,b,add,subtract, multiply,div;
		
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first number:- ");
		a=sc.nextInt();
		
		System.out.println("Enter second number:- ");
		b=sc.nextInt();
		
		sc.close();
		
		add = a+b;
		subtract = a-b;
		multiply = a*b;
		div = a/b;
		
		System.out.println("Addition of " + a + " and "+ b + " is " + add);
		System.out.println("Subtraction of " + a + " and " + b + " is " + subtract);
		System.out.println("Multiplication of " + a + " and " + b + " is " + multiply);
		System.out.println("Division of " + a + " and " + b + " is " + div);
		
		
		
		
	}
}
