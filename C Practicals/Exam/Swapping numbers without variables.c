#include<stdio.h>

int main()
{
	int num1,num2; // a = 10, b = 40
	
	printf("*******Before Swapping *******\n");
	
	printf("\nEnter value of Number 1:- ");
	
	scanf("%d", &num1);
	
	printf("\nEnter value of Number 2:- ");
	scanf("%d", &num2);
	
	num1 = num1 + num2;// num1 = 10 + 40 = 50;
	num2 = num1 - num2;// num2 = 50 - 40 = 10;
	
	num1 = num1 - num2;// num1 = 50 - 10 = 40;
	
	printf("\n *******After Swapping *******\n");
	
	printf("\nValue of Number 1 is %d\n", num1);
	
	printf("\nValue of Number 2 is %d\n", num2);
	
	
}
