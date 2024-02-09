

#include<stdio.h>

int main()
{
	int age;
	printf("Enter age:- ");
	scanf("%d", &age);
	
	if(age>18)
	{
		if(age==18)
		{
			printf("You are eligible for driving License");
		}
		else
		{
			printf("You are not eligible for driving License");
		}
	}
		else
		{
			printf("You are not eligible for driving License");
		}
}
