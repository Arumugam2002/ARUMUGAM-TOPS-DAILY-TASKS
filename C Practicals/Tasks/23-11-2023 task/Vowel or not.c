#include<stdio.h>

int main()
{
	
	char character;
	printf("Enter the character:- ");
	scanf("%c", &character);
	
	switch(character)
	{
		case 'A': 
		printf("%c is a Vowel", character);
		break;
		
		case 'E': 
		printf("%c is a Vowel", character);
		break;
		
		case 'I': 
		printf("%c is a Vowel", character);
		break;
		
		case 'O': 
		printf("%c is a Vowel", character);
		break;
		
		case 'U': 
		printf("%c is a Vowel", character);
		break;
		
		case 'a': 
		printf("%c is a Vowel", character);
		break;
		
		case 'e': 
		printf("%c is a Vowel", character);
		break;
		
		case 'i': 
		printf("%c is a Vowel", character);
		break;
		
		case 'o': 
		printf("%c is a Vowel", character);
		break;
		
		case 'u': 
		printf("%c is a Vowel", character);
		break;
		
		default: printf("%c is a Consonant", character);
		break;
	}
}
