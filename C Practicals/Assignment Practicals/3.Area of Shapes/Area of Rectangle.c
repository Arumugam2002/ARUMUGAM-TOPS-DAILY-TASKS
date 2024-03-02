#include<stdio.h>

int main()
{
	float length, breadth, area;
	
	printf("Enter the length of Rectangle:- ");
	scanf("%f", &length);
	
	printf("Enter the breadth of Rectangle:- ");
	scanf("%f", &breadth);
	
	area = length * breadth;
	
	printf("\nArea of Rectangle is %.2f", area);
	
}
