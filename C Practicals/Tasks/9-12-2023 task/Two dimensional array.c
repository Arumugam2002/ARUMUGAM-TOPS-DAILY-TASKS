#include<stdio.h>

int main()
{
	int a[4][2],i,j;
	
	printf("Enter the numbers:- ");
	
	for(i=0;i<4;i++)
	{
		for(j=0;j<2;j++)
		{
			scanf("%d", &a[i][j]);
		}
	}
	
	
	for(i=0;i<4;i++)
	{
		for(j=0;j<2;j++)
		{
			printf("a[%d][%d] = %d\n", i,j,a[i][j]);
		}
	}
	
	
	
	
}
