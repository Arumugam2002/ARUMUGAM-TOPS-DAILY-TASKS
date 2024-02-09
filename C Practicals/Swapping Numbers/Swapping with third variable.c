#include<stdio.h>

int main()
{
	int num1, num2, temp;
	
	printf("Enter first number:- ");//10
	scanf("%d", &num1);
	
	printf("Enter second number:- ");//20
	scanf("%d", &num2);
	
	printf("\nBefore Swapping First Number is %d and Second Number is %d\n",  num1,num2);
	
	temp = num1; // temp =10 if num1 = 10
	num1 = num2;// num1 = 20 if num2 = 20
	num2 = temp;// num2 = 10 if temp =10
	
	printf("\nAfter Swapping First Number is %d and Second Number is %d",  num1,num2);
	
	
}
