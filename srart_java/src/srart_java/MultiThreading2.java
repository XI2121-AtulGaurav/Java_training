package srart_java;

class MultiThreadingDemo implements Runnable{
    public void run()
    {
    	try {
    		System.out.println("Thread"+Thread.currentThread().getId());
    	}
    	catch(Exception e) {
    		System.out.println("Exception is caught");
    	}
    }
}

 public class MultiThreading2{
	 public static void main(String args[])
	 {
		 int n=8;
		 for(int i=0;i<n;i++)
		 {
			 Thread mt=new Thread(new MultiThreadingDemo());
			 mt.start();
			 
		 }
	 }
 }