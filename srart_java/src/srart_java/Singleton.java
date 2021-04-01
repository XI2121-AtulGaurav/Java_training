package Singleton;

public class Singleton {
    private static Singleton instance = null;
    
    public String name;
    private Singleton()
    {
    	name="Atul";
    }
    public static Singleton getInstance()
    {
    	if(instance==null)
    	{
    		instance=new Singleton();
    	}
    	return instance;
    }
}
