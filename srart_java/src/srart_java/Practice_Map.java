package srart_java;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Practice_Map {
	public static void main(String args[])
	{
    HashMap<Integer,String> map=new HashMap<Integer,String>();
    map.put(1,"Atul");
    map.put(2,"Anish");
    map.put(3,"Naman");
    map.put(4,"Michael");
    
    Set  set=map.entrySet();
    
    Iterator iterator=set.iterator();
    while(iterator.hasNext())
    {
    	Map.Entry entry=(Map.Entry)iterator.next();
    	System.out.println(entry.getKey());
    	System.out.println(entry.getValue());
    }
}
}