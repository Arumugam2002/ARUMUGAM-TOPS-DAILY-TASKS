#include<stdio.h>

int main()
{
	int a1[2][2], a2[2][2], res[2][2];
	int i,j;
	
	printf("Enter matrix-1 numbers:- \n");
	
	for(i=0;i<2;i++)
	{
		for(j=0;j<2;j++)
		{
			scanf(" %d ", &a1[i][j]);
		}
	}
	
	printf("Enter matrix-2 numbers:- \n");
	
	for(i=0;i<2;i++)
	{
		for(j=0;j<2;j++)
		{
			scanf(" %d ", &a2[i][j]);
		}
	}
	
	printf("--------Matrix-1-------\n");
	for(i=0;i<2;i++)
	{
		for(j=0;j<2;j++)
		{
			printf(" %d ", a1[i][j]);
		}
		printf("\n");
	}
	
	printf("--------Matrix-2-------\n");
	for(i=0;i<2;i++)
	{
		for(j=0;j<2;j++)
		{
			printf(" %d ", a2[i][j]);
		}
		printf("\n");
	}
	

	for(i=0;i<2;i++)
	{
		for(j=0;j<2;j++)
		{
			res[i][j] = a1[i][j] - a2[i][j];
		}
	}
	
	printf("\nSubtraction of matrix is \n");
	
	
	for(i=0;i<2;i++)
	{
		for(j=0;j<2;j++)
		{
			printf(" %d ", res[i][j]);
		}
		printf("\n");
	}
}
