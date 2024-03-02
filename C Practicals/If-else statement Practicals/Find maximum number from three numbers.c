#include<stdio.h>

int main()
{
	int a,b,c;
	
	printf("Enter first number:- ");
	scanf("%d", &a);
	
	printf("Enter second number:- ");
	scanf("%d", &b);
	
	printf("Enter third number:- ");
	scanf("%d", &c);
	
	if(a>b && a>c)
	{
		printf("\n%d is the maximum number", a);
	}
	
	else if(b>a && b>c)
	{
		printf("\n%d is the maximum number", b);
	}
	
	else if(c>a && c>b)
	{
		printf("\n%d is the maximum number", c);
	}
	
	else
	{
		printf("\nAll the numbers are equal");
	}
	
	return 0;
}
