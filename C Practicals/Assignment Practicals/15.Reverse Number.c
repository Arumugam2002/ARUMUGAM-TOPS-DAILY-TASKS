//Program to reverse a number


#include<stdio.h>

int main()
{
	int num, remainder, rev=0;
	
	printf("Enter the number to reverse:- ");
	scanf("%d", &num);
	
	while(num!=0)
	{
		remainder = num %10;
		num=num/10;
		rev = rev * 10 + remainder;
		
		
	}
	
	printf("The reverse number is %d", rev);
}


//num=6015

//rem=num%10
//	 =6015%10=5
//  rev=0*10+5=5
//  num=6015/10=601


// rem = 601%10=1
//  rev = 5*10+1=51
// num = 601/10=60

//rem = 60%10=0
//rev = 51*10+0=510
//num = 60/10=6

//rem= 6%10 = 6
//rev = 510*10+6=5106
//num = 6/10=0;


