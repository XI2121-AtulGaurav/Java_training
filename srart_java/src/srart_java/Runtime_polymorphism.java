package srart_java;

class parent{
	void parent()
	{
		System.out.println("parent class");
	}
}
class child1 extends parent{
	void parent()
	{
		System.out.println("child1 class");
	}
}
class child2 extends parent{
	void parent()
	{
		System.out.println("child2 class");
	}
}
public class Runtime_polymorphism {
  public static void main(String[] args) {
	parent a;
	a=new child1();
	a.parent();
	
	a=new child2();
	a.parent();
	
}
}
