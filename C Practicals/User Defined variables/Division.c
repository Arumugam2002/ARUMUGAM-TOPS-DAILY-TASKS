#include<stdio.h>

int main()
{
	float num1, num2, division;
	
	printf("Enter first number:- ");
	scanf("%f", &num1);
	
	printf("Enter second number:- ");
	scanf("%f", &num2);
	
	division = num1/num2;
	
	printf("\nDivision of %.2f and %.2f is %.2f", num1, num2, division);
	
	return 0;
}
