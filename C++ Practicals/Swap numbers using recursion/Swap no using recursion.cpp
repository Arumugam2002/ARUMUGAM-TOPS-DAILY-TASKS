#include<stdio.h>

using namespace std;

void swapnum(int *num1, int *num2)
{
	int temp;
	
	temp = *num1;
	*num1 = *num2;
	*num2 = temp;
}

int main()
{
	int a, b;
	
	printf("Enter two values:- ");
	scanf("%d %d", &a,&b);
	
	printf("Value of A & B before swap:- %d  %d\n", a, b);
	
	swapnum(&a,&b);
	
	printf("\nValue of A & B after swap:- %d   %d", a, b);
	
	
	
}
