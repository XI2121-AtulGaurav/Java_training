package srart_java;

import java.util.ArrayList;

public class Collection_Demo {
	public static void main(String args[])
	{
		ArrayList<Integer>Taking_list=new ArrayList<Integer>();
		for(int i=0;i<20;i++)
		{
			Taking_list.add(i);
		}
		System.out.println(Taking_list);
		Taking_list.remove(5);
		Taking_list.remove(10);
		Taking_list.remove(11);
		Taking_list.remove(14);
		System.out.println(Taking_list);
  }
	
}