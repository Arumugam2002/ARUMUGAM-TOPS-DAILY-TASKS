/*  W.A.J.P to start the same Thread twice by calling start () method twice. Test 
ThreadTwice1 t1=new TestThreadTwice1(); t1.start (); t1.start ();          */



public class Q44_StartTheThreadTwiceBySameStartMethod extends Thread {
    
	public void run() {
        System.out.println("Thread is running.");
    }

    public static void main(String[] args) {
        
    	Q44_StartTheThreadTwiceBySameStartMethod t1 = new Q44_StartTheThreadTwiceBySameStartMethod();
        try 
        {
            t1.start();
            Thread.sleep(1000); 
            t1.start(); 
            
        } 
        catch (InterruptedException e) {
            e.printStackTrace();
        } 
        catch (IllegalThreadStateException e) {
            System.out.println("Cannot start a thread twice.");
        }
    }
}

