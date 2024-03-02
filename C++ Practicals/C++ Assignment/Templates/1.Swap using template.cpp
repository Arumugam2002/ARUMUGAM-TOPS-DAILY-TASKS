/* Write a program of to swap the two values using template */ 


#include <iostream>

using namespace std;


//Template is used
template<typename T>
void my_swap(T &a, T &b) {
    T temp = a;
    a = b;
    b = temp;
}

int main() {
   

    int c = 5, d = 10;
    

    cout << "Before swapping:" << endl;
    cout << "Num1 is " << c << " Num2 is " << d << endl;
    

    my_swap(c,d);// template is implemented
    
   

    cout << "\nAfter swapping:" << endl;
    cout << "Num1 is " << c << " Num2 is " << d << endl;
    

    return 0;
}

