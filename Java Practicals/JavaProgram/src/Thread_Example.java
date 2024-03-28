
class FThread implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
}

class NewThread extends Thread{
	
}

public class Thread_Example{

	public static void main(String[] args) throws InterruptedException
	{
			 Thread t = new Thread();
			 System.out.println(t);
			 t.setName("MyThread");
			 
			 System.out.println(t);
			 
			 for(int i=1;i<=5;i++)
			 {
				 System.out.println(i + " : " + t);
				 Thread.sleep(10000);
			 }
			 
			 System.out.println("Thread Complete");
	}
	
}
