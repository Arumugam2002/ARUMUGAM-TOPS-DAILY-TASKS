#include<stdio.h>

int main()
{
	int year;
	
	printf("Enter the year:- ");
	scanf("%d", &year);
	
	if(year%4==0)
	{
		printf("%d year is a Leap year\n", year);
	}
	else
	{
		printf("%d year is not a Leap year\n", year);
	}
}
