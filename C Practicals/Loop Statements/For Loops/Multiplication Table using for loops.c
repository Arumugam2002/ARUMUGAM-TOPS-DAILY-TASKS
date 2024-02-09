// Print multiplication table take number from user ex:- num = 5 then op = 5 * 1 = 5

#include<stdio.h>

int main()
{
	int num, i, multiply;
	
	printf("Enter the range of numbers:- ");
	scanf("%d", &num);
	
	printf("\n Multiplication of %d is \n", num);
	
	for(i=1;i<=10;i++)
	{
		//5*1=5
		 multiply = num * i;
		 
		 printf("%d * %d = %d\n", num,i,multiply);
		
	}
	
	return 0;
}
