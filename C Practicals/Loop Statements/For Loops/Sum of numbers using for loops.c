//Take end point from user and print sum (Example:- number=10 then output=1+2+3+4+5+6+7+8+9+10=55)

#include<stdio.h>

int main()
{
	int i, sum=0, num;
	
	printf("Enter the range of number:- ");
	scanf("%d", &num);
	
	for(i=1;i<=num;i++)
	{
		sum=sum+i;
			
	}
		printf("Sum of Numbers are:- %d", sum);
		return 0;
}
