#include<stdio.h>

int main()

{
	
	int num1,num2;
	
	printf("Enter two numbers:- ");
	scanf("%d %d", &num1, &num2);
	
	
	int add=num1+num2;
	int sub=num1-num2;
	int multiply = num1*num2;
	int division = num1/num2;
	
	printf("Addition of %d and %d is %d\n\n",num1,num2,add);
	
	printf("Subtraction of %d and %d is %d\n\n",num1,num2,sub);
		
	printf("Multiplication of %d and %d is %d\n\n",num1,num2,multiply);
			
	printf("Division of %d and %d is %d\n",num1,num2,division);
	
	
}
