#include<stdio.h>

int main()
{
	int a;//a=108
	int b;//b=110
	
	printf("Enter first number:- ");
	scanf("%d", &a);
	
	printf("Enter Second number:- ");
	scanf("%d", &b);
	
	printf("\nBefore Swapping First Number is %d and Second Number is %d\n",a,b);
	
	a=a+b;// 108+110=218 (a=218)
	b=a-b;// 218-110=108 (b=108)
	
	a=a-b;// 218-108=110 (a=110)
	
	printf("\nAfter Swapping First Number is %d and Second Number is %d",a,b);
	
	return 0;
}
