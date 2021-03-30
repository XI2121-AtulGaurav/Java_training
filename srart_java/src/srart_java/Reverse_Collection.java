package srart_java;

import java.util.ArrayList;
import java.util.ListIterator;


public class Reverse_Collection {
	public static void main(String args[])
	{
		ArrayList<String>Taking_Name=new ArrayList<String>();
		Taking_Name.add("Atul");
		Taking_Name.add("Anish");
		Taking_Name.add("Naman");
		Taking_Name.add("Michael");
		ListIterator<String> it=Taking_Name.listIterator(Taking_Name.size());
		while(it.hasPrevious())
		{
			System.out.println(it.previous());
		}
     }
}
