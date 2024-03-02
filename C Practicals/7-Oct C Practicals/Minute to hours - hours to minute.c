#include<stdio.h>

int main()
{
	int minutes, hours;
	
	printf("Enter the number of minutes:- ");
	scanf("%d", &minutes);
	
	hours = minutes/60;
	
	printf("Number of hours are %d", hours);



	int min, hrs;
	
	printf("\nEnter the number of hours:- ");
	scanf("%d",&hrs);
	
	min = hrs * 60;
	
	printf("Number of minutes are %d", min);
	
	return 0;
	
	
}
