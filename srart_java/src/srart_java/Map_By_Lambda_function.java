package srart_java;

import java.util.HashMap;

public class Map_By_Lambda_function {
	public static void main(String args[])
	{
		HashMap<Integer,String> map=new HashMap<Integer,String>();
		map.put(1,"Atul");
		map.put(2,"Anish");
		map.put(3,"Naman");
		map.put(4,"Michael");
		
		map.entrySet()
		.stream()
		.forEach(e->System.out.println(e.getKey()+":"+e.getValue()));
	}
}
