#include<stdio.h>

int main()
{
	float height, base, area;
	
	printf("Enter the height of triangle:- ");
	scanf("%f", &height);
	
	printf("Enter the base of triangle:- ");
	scanf("%f", &base);
	
	area = 0.5 * base * height;
	
	printf("Area of Triangle is %.2f", area);
}
