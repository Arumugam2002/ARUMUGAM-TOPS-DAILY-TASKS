#include<stdio.h>
void ascending(int arr[])


{
int i,j,temp;

for(i=0;i<5;i++)
{
	for(j=i+1;j<5;j++)
	{
		if(arr[i]>arr[j])
		{
			temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
	}
}
}

void descending(int arr[])
{
	int i,j,temp;
	
	for(i=0;i<5;i++)
{
		for(j=i+1;j<5;j++)
	{
		if(arr[i]<arr[j])
		{
			temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
	}
}


}



int main()
{
	int a[5],i,j;
	
	printf("Enter the numbers:- ");
	
	for(i=0;i<5;i++)
	{
		scanf("%d", &a[i]);
	}
	
	
	ascending(a);
	
	printf("Ascending numbers are \n");
	for(i=0;i<5;i++)
	{
			printf("%d ", a[i]);
	}
	
	descending(a);
	
	printf("\nDescending numbers are \n");
	for(i=0;i<5;i++)
	{
			printf("%d ", a[i]);
	}

	
	return 0;
	
}
