#include<iostream>

using namespace std;

class A{
	
	private:
		int a = 10;
	protected:
		int b = 20;
	public:
		int c = 30;
		
		public:
		void Afunc()
		{
			cout<<"A is "<<a<<endl;
		//	cout<<"B is "<<b<<endl;
		//	cout<<"C is "<<c<<endl;
		}
};

class B : public A{
    
    public:
	void Bfunc()
	{
		//cout<<"A is "<<a<<endl;
		cout<<"B is "<<b<<endl;
		cout<<"C is "<<c<<endl;
	}
};

int main()
{
	B obj;
	obj.Afunc();
	obj.Bfunc();
}
