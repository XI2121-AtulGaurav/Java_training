package srart_java;

 class MultiThreding extends Thread{
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

 public class MultiThredingDemo{
	 public static void main(String args[])
	 {
		 int n=8;
		 for(int i=0;i<n;i++)
		 {
			 MultiThreding mt=new MultiThreding();
			 mt.start();
			 
		 }
	 }
 }