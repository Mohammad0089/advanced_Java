package functional_Programming_with_Java;

import java.io.PrintStream;
import java.util.function.BiFunction;
import java.util.function.Function;



public class test{
	
    //Function<Integer,Function<Integer>> multiplyerCreator;
    
	static NoArgFunction<NoArgFunction<String>> greeter = ()->()->"hello";
	

	static final Function<String,NoArgFunction<String>> greet=(x)->()->"hello "+x;
	
	static final Function<Integer , Function<Integer,Integer>> creatMulti=(x)->(y)-> y * x;


	
	public static void main(String []a) {

		System.out.println(greeter.apply().apply());
		System.out.println(greet.apply("Mphammad").apply());
		Function<Integer,Integer>timesTwo = creatMulti.apply(2);
		System.out.println(timesTwo.apply(5));

	}
}