//WAP to find Simple Interest


#include<stdio.h>

int main()
{
	int principal, rate, time;
	int simple_interest;
	
	
	printf("Enter the Principal Amount:- ");
	scanf("%d", &principal);
	
	printf("Enter the Interest Rate:- ");
	scanf("%d", &rate);
	
	printf("Enter the Duration of Interest:- ");
	scanf("%d", &time);
	
	simple_interest = (principal*rate*time)/100;
	
	printf("The Simple Interest of given amount is %d", simple_interest);
	
	
}
