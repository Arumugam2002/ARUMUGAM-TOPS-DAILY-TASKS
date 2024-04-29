/* • W.A.J.P to create 2 threads and make one thread as Daemon Thread by using set 
Daemon () method of Thread class and check whether the thread is set daemon or 
not by using is Daemon () method.
TestDaemonThread2 t1=new TestDaemonThread2(); 
TestDaemonThread2 t2=new TestDaemonThread2(); t1.start(); 
t1.setDaemon(true);//will throw exception here t2.start();
                    */




public class Q45_ThreadAsDaemonThread extends Thread {
	
	
    public void run() {
        if (Thread.currentThread().isDaemon()) 
        {  
        	
            System.out.println(Thread.currentThread().getName() + " is a daemon thread.");
        } 
        else 
        {
            System.out.println(Thread.currentThread().getName() + " is a user thread.");
        }

        for (int i = 0; i < 5; i++) 
        {
            try
            {
                Thread.sleep(1000); 
            } catch (InterruptedException e) 
            {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " running: " + i);
        }
    }

    public static void main(String[] args) {
        Q45_ThreadAsDaemonThread t1 = new Q45_ThreadAsDaemonThread();
        Q45_ThreadAsDaemonThread t2 = new Q45_ThreadAsDaemonThread();

        t1.setDaemon(true);  
        t1.start();

        t2.start();  

        
        System.out.println("Is t1 a daemon thread? " + t1.isDaemon());
    }
}

