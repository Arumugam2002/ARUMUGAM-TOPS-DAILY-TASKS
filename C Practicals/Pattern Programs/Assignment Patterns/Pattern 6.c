#include<stdio.h>

int main()
{
	int i,j;
	char c = 'A';
	
	for(i=1;i<6;i++)
	{
		for(j=1;j<=i;j++)
		{
			printf(" %c", c+j-1);
			
		}
		
		printf("\n");
	}

}
