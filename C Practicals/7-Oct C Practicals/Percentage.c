#include<stdio.h>

int main()
{
	float marks1, marks2, marks3, total;
	float percentage;
	
	printf("Enter the marks of Maths:- ");
	scanf("%f", &marks1);
	
	printf("Enter the marks of English:- ");
	scanf("%f", &marks2);
	
	printf("Enter the marks of Science:- ");
	scanf("%f", &marks3);
	
	total = marks1 + marks2 + marks3;
	
	printf("\nTotal of Three Subjects is %.2f\n", total);
	
	percentage = (total/300) * 100;
	
	printf("\nThe Percentage of given three sub marks are %.2f%%", percentage);
	
	return 0;
	
}
