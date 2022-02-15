package test;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test_Demo {

	public static void main(String[] args) {
		
		//*************************************************************************//
		Stream.of(1,1,1,2,3,5,77,8,99,99,88,88,8,4)     // it was Amazon SDE OA
		.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
		.entrySet().forEach(n->System.err.print(n+" "));
		//************************************************************************//
		System.out.println("beging of testing");
		
		
		String s = "i love software engineering role. I live in the sacramento California";
		
		boolean toUpper = true;
		
		Stream.of(s).forEach(n->System.out.println(n));
		
		

		

	
		String s2 = new String();
		char[] ch;
		System.err.println(s2);
		
		ch = s.toCharArray();
		for(int i=0; i<s.length();i++) {
			if(toUpper) {
				ch[i] = Character.toUpperCase(ch[i]);
				toUpper = false;
			}
			else {
				if(ch[i] == ' ')
					toUpper = true;
			}
			
			s2 = s2+Character.toString(ch[i]);
		}
		
		for(char val:ch) {
			System.out.print(val);
		}
		System.out.println("\n\n");
		System.out.println(s2);
		
		
		
		
		
		
	
	}
}
