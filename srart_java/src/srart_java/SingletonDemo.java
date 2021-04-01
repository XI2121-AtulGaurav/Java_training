package Singleton;

public class SingletonDemo {
  public static void main(String args[])
  {
	  Singleton obj1=Singleton.getInstance();
	  Singleton obj2=Singleton.getInstance();
      obj1.name=obj1.name+"Gaurav";
      
      System.out.println(obj1.name);
      System.out.println(obj2.name);
  }
}
