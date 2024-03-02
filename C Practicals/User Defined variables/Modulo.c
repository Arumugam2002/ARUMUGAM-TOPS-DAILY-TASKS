#include<stdio.h>

int main()
{
	int num1, num2, remainder;
	
	printf("Enter first number:- ");
	scanf("%d", &num1);
	
	printf("Enter second number:- ");
	scanf("%d", &num2);
	
	remainder = num1%num2;
	
	printf("\nRemainder of %d and %d is %d", num1,num2,remainder);
	
}
