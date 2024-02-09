//Take end point from user and print numbers from 1 to end point.

#include<stdio.h>

int main()
{
	
	int num,i;
	printf("Enter range to print the numbers:- ");
	scanf("%d", &num);
	
	for(i=1;i<=num;i++)
	{
		printf("\n%d", i);	
	}
	
	return 0;
}
