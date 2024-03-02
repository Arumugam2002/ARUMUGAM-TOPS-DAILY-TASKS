#include<iostream>
#include<string>

using namespace std;

class MethodOverloading{
    
    public:
    
    int func1(int a, int b, int c=0)
    {
        return a+b+c;
    }
    
};

int main()
{
    MethodOverloading obj1;
    
   cout<<"Result is "<<obj1.func1(20,15)<<endl;
   cout<<"Another result is "<<obj1.func1(80,10,30);
   
   
}
