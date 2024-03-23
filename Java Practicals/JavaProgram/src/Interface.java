

interface interf1{
	
	
	public void fun1();
		
	
	public static void staticinterf1(){
		System.out.println("This is static interface1");
	}
	
}

interface interf2{
	
	public void fun2();
	
	public static void staticinterf2(){
		System.out.println("This is static interface 2");
	}
	
}

interface interf3{
	
	public void fun3();

	
	public static void staticinterf3(){
		
		System.out.println("This is static interface 3");
		
	}
}

class InterCalling implements interf1, interf2, interf3{

	@Override
	public void fun3() {
		System.out.println("This is abstract function1");
		
	}

	@Override
	public void fun2() {
		System.out.println("This is abstract function2");
		
	}

	@Override
	public void fun1() {
		System.out.println("This is abstract function3");	
	}
	
	
	
}

public class Interface {

	public static void main(String[] args)
	{
		interf1.staticinterf1();
		
		InterCalling c1 = new InterCalling();
		
		c1.fun1();
		c1.fun2();
		c1.fun3();
	}
	
}
