/*   Write a program to find the multiplication values and the cubic values using
inline function  */

#include <iostream>

using namespace std;

// Inline function to find multiplication of two numbers
inline int multiply(int a, int b) 
{
    return a * b;
}

// Inline function to find the cubic value of a number
inline int cube(int x) 
{
    return x * x * x;
}

int main() 
{
    int num1, num2;
    cout << "Enter two numbers: ";
    cin >> num1 >> num2;

    // Calculate and display multiplication value
    cout << "Multiplication of " << num1 << " and " << num2 << " is: " << multiply(num1, num2) <<endl;

    int num3;
    cout<<endl<<"Enter a number to find cube value: ";
    cin >> num3;

    // Calculate and display cube value
    cout<<"Cube value of " << num3 << " is: " << cube(num3)<<endl;

    return 0;
}

