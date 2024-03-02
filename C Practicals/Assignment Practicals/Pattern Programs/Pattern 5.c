#include<stdio.h>

int main()
{
	int i,j;
	int k=1;
	
	for(i=0;i<5;i++)
	{
		for(j=0;j<=i;j++)
		{
			printf(" %d",k);
			k++;
		}
		printf("\n");
	}
}
