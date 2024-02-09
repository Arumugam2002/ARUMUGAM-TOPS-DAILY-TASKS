#include<stdio.h>

/*
	Strings in C:
	
	"String is a Character array terminated with NULL character('\0')"
	
	Syntax : 
		
		>>declaration :
		char str_name[size];
		
		>>initialization :
		char str_name[20]={'a','g','u','\0'};
		or 
		char str_name="Hello";
	
	
*/

int main()
{
	char str1[]="Hello world";
	char str2[]={'a','b','c','d','\0'};
	char str3[100];
	
	printf("string1 : %s\n",str1);
	printf("string2 : %s\n",str2);
	printf("string3 : %s\n",str3);
	
	return 0;
}

