/*  W.A.J. P to create one thread by implementing Runnable interface in 
Class.
              */

class ThreadRunnableClass implements Runnable{

	@Override
	public void run() {
		
		for(int i=0; i<5;i++)
		{
			System.out.println(Thread.currentThread().getName() + ": " + i);
			
			try {
				Thread.sleep(500);
				
				
			} catch (InterruptedException e) {
				
				e.printStackTrace();
				
			}
		}
		
	}
	
	
	
	
}

public class Q41_CreateOneThreadByImplementingRunnableInterfaceInClass {

	public static void main(String[] args)
	{
		ThreadRunnableClass myRunnable = new ThreadRunnableClass();
		
		Thread myThread = new Thread(myRunnable);
		
		myThread.start();
	}
	
}
