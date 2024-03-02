// WAP to convert years into days and days into years

#include<stdio.h>

int main()
{
	
    float days;
	float year;
    
    printf("Enter the number of days:- ");
    scanf("%f", &days);
    
    year = days/365;
    
    printf("\nThe conversion of days to year is %.2f year\n", year);
    
    float year1;
    float days1;
    
    printf("\nEnter the Year:- ");
    scanf("%f", &year1);
    
    days1 = year1 * 365;
    
    printf("\n The conversion of year to days is %.2f days", days1);
	
	
}
