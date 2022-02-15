package functional_Programming_with_Java;

import java.util.*;
import java.util.stream.Collectors;

public class map_filter_reduce {
	
	public static String toLowercase(String n) {
		char ch = 0;
		String t = "";
		for(int i=0; i<n.length();i++) {
			 ch = (char) Character.toLowerCase(n.charAt(i));
			 t = t + Character.toString(ch);
		}
		
		
		return t;
		
	}
	

	public static void main(String[] args) {
		
		
		List<String> names = Arrays.asList("Mohamamd","Ahmed","Mari","Roz");
		List<String> longNames;
		
		longNames = names.stream().filter(n->n.length()>=4).collect(Collectors.toList());     // getting words >=4
		longNames = longNames.stream().map(n->n.toUpperCase()).collect(Collectors.toList());  // toUppercase
		
		Iterator name = longNames.iterator(); //creating an Iterator behavioral design		
		
		while(name.hasNext()) {
			System.out.println(name.next());
		}
		
		longNames = longNames.stream().map(n->toLowercase(n)).collect(Collectors.toList());
		
		for(String n:longNames) {
			System.out.println(n);
		}
		
		
		System.out.println(toLowercase("ALOT"));
		
		
       

				

	}

}
