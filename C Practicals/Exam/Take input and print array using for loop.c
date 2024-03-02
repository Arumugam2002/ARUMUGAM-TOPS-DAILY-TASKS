#include<stdio.h>

int main()
{
	int a[5], i;
	
	printf("Enter numbers:- \n");
	
	for(i=1;i<=5;i++)
	{
		scanf("%d", &a[i]);
	}
	
	printf("\nNumbers are:- \n");
	
	for(i=1;i<=5;i++)
	{
		printf("%d\n", a[i]);
	}
}
