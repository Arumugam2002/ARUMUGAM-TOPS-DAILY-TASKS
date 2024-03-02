#include<stdio.h>

int main()
{
	int number;
	
	printf("Enter the Number:- ");
	scanf("%d", &number);
	
	(number%2==0)?printf("\n%d is a Even Number", number):printf("\n%d is a Odd Number", number);
}
