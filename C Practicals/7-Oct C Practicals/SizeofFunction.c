#include<stdio.h>

int main()
{
	short int d = 5;
	int a = 100;
	float b =10.52;
	double c = 15.63;
	char e = 'A';
	long double f = 500.35;
	
	printf("Size of short int is %d bytes\n", sizeof(d));
	printf("\nSize of int is %d bytes\n", sizeof(a));
	printf("\nSize of float is %d bytes\n", sizeof(b));
	printf("\nSize of double is %d bytes\n", sizeof(c));
	printf("\nSize of char is %d bytes\n", sizeof(e));
	printf("\nSize of long double is %d bytes\n", sizeof(f));
	
	return 0;
}
