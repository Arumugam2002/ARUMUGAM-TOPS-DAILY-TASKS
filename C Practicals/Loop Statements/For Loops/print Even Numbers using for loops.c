// Take end point from user and find even numbers till that end point

#include<stdio.h>

int main()

{
	int num,i;
	printf("Enter the range of number:- ");
	scanf("%d", &num);
	
	for(i=1;i<=num;i++)
	{
		if(i%2==0)
		{
			printf("%d\n", i);
		}
		
		
	}
}
