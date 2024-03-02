#include<stdio.h>
#include<string.h> //header file for strings

int main()
{
	char str1[100];
	int len=0;
	
	printf("Enter string : ");
	gets(str1);
	
	len=strlen(str1); // strlen(str_name): return length of string
	
	printf("Length : %d\n",len);
	
	strrev(str1); // strrev(str_name) : make the string reverse in place
	
	printf("reversed string : %s",str1);
	
	return 0;
}
