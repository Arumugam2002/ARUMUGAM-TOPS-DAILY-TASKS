#include<stdio.h>

int main()
{
	float km, meters;
	
	printf("Enter the length of kilometres to convert in meters:- ");
	scanf("%f", &km);
	
	meters = km *1000;
	
	printf("Conversion of km to Meters is %.2f metres\n ", meters);
	
	float kilom, m;
	
	printf("\nEnter the length of meters to convert in kilometers:- ");
	scanf("%f", &m);
	
	kilom = m/1000;
	
	printf("Conversion of meters to kilometers is %.2f kilometres", kilom);
	
	return 0;
	
}
