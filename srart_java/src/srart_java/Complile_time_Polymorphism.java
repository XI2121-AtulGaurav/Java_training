package srart_java;

class MultiflyFun{
    static int Multiple(int a, int b)
    {
	  return a*b;
    }
	
    static double Multiply(double a,double b)
    {
	  return a*b;
    }
}
public class Complile_time_Polymorphism {
  public static void main(String[] args) {
	System.out.println(MultiflyFun.Multiple(4, 5));
	System.out.println(MultiflyFun.Multiply(7.8, 8.7));
}
}
