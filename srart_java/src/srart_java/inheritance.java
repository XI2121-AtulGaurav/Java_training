package srart_java;

class Bicycle{
	public int gear;
	public int speed;
	
	public Bicycle(int gear,int speed)
	{
		this.gear=gear;
		this.speed=speed;
	}
	
	public void applyBrake(int decrement)
	{
		speed=speed-decrement;
	}
	public void speedUp(int increment)
	{
		speed=speed+increment;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return ("No of gears are"+gear+"\n"+
		"speed of bicycle is"+speed);
	}
}
class Bike extends Bicycle{
	public int height;
	public Bike(int gear,int speed,int str_height)
	{
		super(gear,speed);
		height=str_height;
	}
	public void setHeight(int value)
	{
		height=value;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return (super.toString()+"\nheight is"+height);
	}
}
public class inheritance {
	public static void main(String[] args) {
		Bike bk=new Bike(3,100,20);
		System.out.println(bk.toString());
	}
}
