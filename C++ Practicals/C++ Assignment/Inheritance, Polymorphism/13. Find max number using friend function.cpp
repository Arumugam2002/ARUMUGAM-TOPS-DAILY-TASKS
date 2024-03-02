/* Write a program to find the max number from given two numbers
using friend function */ 

#include <iostream>

using namespace std;
//Class created
class MaximumNumber {
private:
    int num1, num2;

	public:
		
		//Constructor
    MaximumNumber(int a, int b) 
	{
        num1 = a;
        num2 = b;
    }

//Friend function created
    friend int MaximumNumberFinder(MaximumNumber obj);
};

int MaximumNumberFinder(MaximumNumber obj) 
{
    return (obj.num1 > obj.num2) ? obj.num1 : obj.num2;// Maximum logic used
}

int main() 
{
    int num1, num2;
    cout << "Enter two numbers: ";
    cin >> num1 >> num2;

    MaximumNumber obj(num1, num2);
    cout << "Maximum number is: " << MaximumNumberFinder(obj) << endl;

    return 0;
}

