/* W.A.J.P to create 2 threads and execute that threads by providing sleep time as 
2000ms and check the execution          */

class MyThread extends Thread{
	
	String threadName;
	long sleepTime;
	
	public MyThread(String name, long sleepTime)
	{
		this.threadName = name;
		this.sleepTime = sleepTime;
	}
	
	public void run(){
		
		try {
			
			System.out.println(threadName + " is running");
			Thread.sleep(sleepTime);
			
			System.out.println(threadName + " is done sleeping for " + sleepTime + " ms");
			
			
		}
		
		catch (InterruptedException e) {
			
			System.err.println(threadName + " was interrupted");
			
		}
		
		
	}
	
}



public class Q43_CreateTwoThreadsAndExecuteThreadByProvidingSleepTime {


	
	public static void main(String[] args)
	{
		MyThread thread1 = new MyThread("Thread1", 2000);
		MyThread thread2 = new MyThread("Thread2", 2000);
		
		thread1.start();
		thread2.start();
	}
	
	
}
