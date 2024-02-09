// Take end point from user point from user and find odd numbers till that end point

#include<stdio.h>

int main()
{
	int num,i;
	
	printf("Enter the range of numbers:- ");
	scanf("%d", &num);
	
	for(i=1;i<=num;i++)
	{
		if(i%2!=0)
		{
			printf("%d\n", i);
		}
	}
}
