#include<stdio.h>

int main()
{
	int i,j,num1=1,num2=0;
	
	for(i=1;i<6;i++)
	{
		for(j=1;j<=i;j++)
		{
			if(j%2==0)
			{
				printf("%d", num2);
			}
			
			else
			{
				printf("%d", num1);
			}
		}
		
		printf("\n");
	}
	
}
