package srart_java;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ClassifyString {
     public static void main(String args[])
     {
    	//list of integers
    	 List<Integer> Number = Arrays.asList(2,3,4,5);

    	 // create a list of integers
    	 List<Integer> Numbers = Arrays.asList(2,3,4,5,2,10);

    	 // create a list of String
    	 List<String> Names =
    	             Arrays.asList("Reflection","Collection","Stream");
    	 
    	 List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
    	 System.out.println(strings.parallelStream().filter(string->string.isEmpty()).count());
    	 List<String>arr= Arrays.asList("Mango", "Cat", "Cup", "Dog", "Rat", "Couple", "Friend");
    	 System.out.println(Number.stream().filter(y->y%2==0).map(x->x*x).collect(Collectors.toList()));
    	 System.out.println(Names.stream().reduce((str1,str2)->str1+"-"+str2));
    	 Numbers.stream().filter(num -> num % 5 == 0).forEach(System.out::println);
    	 System.out.println(Names.stream().sorted().collect(Collectors.toList()));
    	 System.out.println(arr.stream().filter(name->name.startsWith("C")).collect(Collectors.toList()));
     }
}
