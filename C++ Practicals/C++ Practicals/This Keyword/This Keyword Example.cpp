#include<iostream>

using namespace std;

class A{
	
	private:
		int x;
		int y;
		
	public:
		A (int x, int y)
		{
			this->x=x;	
			this->y=y;
			
		}
		
	void one()
	{
		cout<<x<<" "<<y;
	}
};

int main()
{
	A obj(25,30);
	obj.one();
}
