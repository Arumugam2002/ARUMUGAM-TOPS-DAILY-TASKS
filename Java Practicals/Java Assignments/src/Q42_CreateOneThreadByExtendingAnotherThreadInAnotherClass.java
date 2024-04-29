/* W.A.J. P to create one thread by extending Thread class in another Class.         */

class ThreadOne extends Thread{
	
	public void run(){
		
		System.out.println("The Thread is Running");
		
	}
}



public class Q42_CreateOneThreadByExtendingAnotherThreadInAnotherClass {

	public static void main(String[] args)
	{
		ThreadOne myThread = new ThreadOne();
		
		myThread.start();
	}
	
	
}
