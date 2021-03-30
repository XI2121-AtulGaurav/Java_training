package srart_java;

abstract class shape{
	String color;
	
	abstract double area();
	@Override
	public abstract String toString();
	public shape(String color)
	{
		this.color=color;
	}
	
	public String getColor()
	{
		return color;
	}
}

class Circle extends shape{
	double radius;
	
	public Circle(String color,double radius)
	{
		super(color);
		System.out.println("circle constructor is called");
		this.radius=radius;
	}
	
	double area()
	{
		return Math.PI*Math.pow(radius, 2);
	}
	
	@Override
	public String toString() {

		return "Circle color is "+super.getColor()+"and area is"+area();
	}
}

class Rectangle extends shape{
	
	double length;
	double breadth;
	
	public Rectangle(String color,double length,double breadth)
	{
		super(color);
		System.out.println("rectangle constructor is called");
		this.length=length;
		this.breadth=breadth;
	}
	
	double area()
	{
		return length * breadth;
	}
	
	@Override
	public String toString() {
		return "Rectangle color is"+super.getColor()+"and area is"+area();
	}
}

public  class Abstractt {
   public static void main(String[] args) {
	 shape s1=new Circle("red",3);
	 shape s2=new Rectangle("green",4,5);
	 System.out.println(s1.toString());
	 System.out.println(s2.toString());
}
}
