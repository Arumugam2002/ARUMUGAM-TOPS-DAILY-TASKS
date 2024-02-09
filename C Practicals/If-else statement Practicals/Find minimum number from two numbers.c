#include<stdio.h>

int main()
{
	int a,b;
	
	printf("Enter the first number:- ");
	scanf("%d", &a);
	
	printf("Enter the second number:- ");
	scanf("%d", &b);
	
	if(a<b)
	
	{
		printf("\n%d is the minimum number", a);
	}
	
	else if(b<a)
	{
		printf("\n%d is the minimum number", b);
	}
	
	else
	{
		printf("\nBoth are equal");
	}
	
	return 0;
}
