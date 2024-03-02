#include<stdio.h>

int main()
{
	float radius,area;
	float pi=3.14;
	
	printf("Enter the radius of circle:- ");
	scanf("%f", &radius);
	
	area = pi * radius * radius;
	
	printf("Area of Circle is %.2f", area);
	
	
}
