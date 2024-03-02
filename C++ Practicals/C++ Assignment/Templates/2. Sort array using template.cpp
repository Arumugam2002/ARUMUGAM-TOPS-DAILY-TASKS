/* Write a program of to sort the array using templates */ 

#include <iostream>

using namespace std;


//Swap template used
template <typename T>
void my_swap(T& a, T& b) 
{
    T temp = a;
    a = b;
    b = temp;
}


//Sorting for array template used
template <typename T>
void Sort(T arr[], int n) 
{
    for (int i = 0; i < n - 1; ++i) 
	{
        for (int j = 0; j < n - i - 1; ++j) 
		{
            if (arr[j] > arr[j + 1]) 
			{
                my_swap(arr[j], arr[j + 1]);
            }
        }
    }
}

// Printing array template used
template <typename T>
void printArray(T arr[], int size) 
{
    for (int i = 0; i < size; ++i) 
	{
        cout << arr[i] << " ";
    }
    cout << std::endl;
}

int main() {
    int intArr[] = {5, 2, 8, 1, 3};
    

    int intArrSize = sizeof(intArr) / sizeof(int);
    

    cout << "Original integer array: ";
    
    printArray(intArr, intArrSize);
    
    Sort(intArr, intArrSize);
    
    cout << "Sorted integer array: ";
    printArray(intArr, intArrSize);

   
    
    return 0;
}

