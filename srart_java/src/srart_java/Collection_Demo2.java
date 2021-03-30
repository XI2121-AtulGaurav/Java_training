package srart_java;

import java.util.ArrayList;
import java.util.Iterator;
  public class Collection_Demo2 {
	public static void main(String args[])
	{
		ArrayList<String>Taking_Name=new ArrayList<String>();
		Taking_Name.add("Atul");
		Taking_Name.add("Anish");
		Taking_Name.add("Naman");
		Taking_Name.add("Michael");
		Iterator<String> it=Taking_Name.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
     }
}
