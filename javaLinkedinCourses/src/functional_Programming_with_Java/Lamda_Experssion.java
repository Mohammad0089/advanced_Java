package functional_Programming_with_Java;

import java.util.function.BiFunction;
import java.util.function.Function;


 interface VoidFunction{
	void noApply();
 }

public class Lamda_Experssion {
	
	public static void main(String [] args) { 
		// create a function that returns abs value
		
		Function<Integer,Integer> absValue = n-> n < 0 ? -n : n;    // in a single line decleration there is no need for {} and return keyword
		
		Integer x = absValue.apply(5);
		System.out.println(x);
		
		BiFunction <Integer,Integer,Integer> add = (x1, y)-> x1+y;
		System.out.println(add.apply(5,3));//8
		
		Trifunction<Integer,Integer,Integer,Integer> addThere = (a,b,c)-> a+b+c;
		System.out.println(addThere.apply(10, 8, 2));//20
		
		VoidFunction sayHello = ()->System.out.println("hello");
		sayHello.noApply(); //hello

	}

}
