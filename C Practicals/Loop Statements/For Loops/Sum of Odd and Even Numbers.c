// Take end point from user and find sum of odd numbers and find sum of even numbers

#include<stdio.h>

int main()
{
	int num,i,sum=0;
	
	printf("Enter the range of numbers:- ");
	scanf("%d", &num);
	
	for(i=1;i<=num;i++)
	{
		if(i%2!=0)
	
		{
			sum=sum+i;//0=0+1,  1=1+3=4 ,4=4+5=9, 9=9+7=16, 16=16+9=25
		}
	}
	
	
	printf("The sum of Odd Numbers are %d ",sum);//1+3+5+7+9=25

	
	
	int j, sum1=0;
	
	//For Sum of Even Numbers
	
	for(j=1;j<=num;j++)
	{
		if(j%2==0)
		{
			sum1=sum1+j;
		}
	}
	
	printf("\nThe Sum of Even Numbers are %d", sum1);//2+4+6
	
		return 0;
	
}
