package srart_java;

import java.util.*;
import java.util.stream.Collectors;
public class Empty_String {
    public static void main(String args[]) {
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
        int count=0;
        for(String item : strings){
            if(item.isEmpty()){
                count++;
            }
        }
        System.out.print(count);
        List<Integer>integers = Arrays.asList(1,2,13,4,15,6,17,8,19);
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int sum=0;
        List<Integer>results=new ArrayList<>();
        for(int i=0;i<integers.size();i++)
        {
        	if(max<integers.get(i))
        	{
        		max=integers.get(i);
        	}
        	if(min>integers.get(i))
        	{
        		min=integers.get(i);
        	}
        	sum=sum+integers.get(i);
        	
        	int t=(int) Math.pow(integers.get(i),2);
        	results.add(t);
        }
        System.out.println("average="+sum/9);
        System.out.println("summation="+sum);
        System.out.println("maximum value="+max);
        System.out.println("minimum value="+min);
        System.out.println(results);
        
        System.out.println(integers
        		.stream()
        		.mapToInt(number->number.intValue())
        		.average()
        		);
        
        System.out.println(integers
        		.stream()
        		.mapToInt(number->number.intValue())
        		.sum()
        		);
        
        System.out.println(integers
        		.stream()
        		.map(x->x*x)
        		.collect(Collectors.toList())
        		);
    }
}
