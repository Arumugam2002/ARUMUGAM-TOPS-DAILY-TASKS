#include<stdio.h>
#include<string.h> //header file for strings

int main()
{
	char str1[100];
	int len=0;
	
	printf("Enter string : ");
	gets(str1);
	
	printf("Upper case : %s\n",strupr(str1));
	
	printf("Lower case : %s\n",strlwr(str1));
	
	printf("Occurance of character in string : %s\n",strchr(str1,'l'));
	
	printf("Occurance of sub string in Main string : %s\n",strstr(str1,".W"));
	
	return 0;
}
