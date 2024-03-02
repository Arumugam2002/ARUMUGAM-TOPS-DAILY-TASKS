#include<stdio.h>

int main()
{
	int num1=0,num2=1,num,num3,i;
	
	printf("Enter the number:- ");
	scanf("%d", &num);
	
	printf("Fibonacci Series is %d %d", num1, num2);
	
	for(i=2;i<=num;i++)
	{
		num3 = num1 + num2;
		
		printf(" %d", num3);
		
		num1 = num2;
		num2 = num3;
	}
}
