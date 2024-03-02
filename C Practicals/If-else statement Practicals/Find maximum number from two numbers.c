#include<stdio.h>

int main()
{
	int a,b;
	
	printf("Enter the first number:- ");
	scanf("%d", &a);
	
	printf("Enter the second number:- ");
	scanf("%d", &b);
	
	if(a>b)
	{
		printf("\n%d is the maximum number", a);
	}
	
	else if(b>a)
	{
		printf("\n%d is the maximum number", b);
	}
	
	else
	{
		printf("\n%d and %d both are equal", a,b);
	}
	
	return 0;
}
