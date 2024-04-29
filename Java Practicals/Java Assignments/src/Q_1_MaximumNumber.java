/* • Write a Java program to Take three numbers from the user and print the greatest
number.  */

import java.util.Scanner;

public class Q_1_MaximumNumber {
    
	public static void main(String[] args) {
        
		Scanner num = new Scanner(System.in);

        System.out.println("Enter First number:- ");
        
        int num1 = num.nextInt();

        System.out.println("Enter Second number:- ");
        
        int num2 = num.nextInt();

        System.out.println("Enter Third number:- ");
        
        int num3 = num.nextInt();

        if (num1 >= num2 && num1 >= num3) 
        {
            
        	System.out.println(num1 + " is greatest number");
        } 
        else if (num2 >= num1 && num2 >= num3) 
        {
            
        	System.out.println(num2 + " is greatest number");
        } 
        else 
        {
            System.out.println(num3 + " is greatest number");
        }
    }
}
