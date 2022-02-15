package functional_Programming_with_Java;

import java.util.function.BiFunction;

public class Passing_function_as_argument {
	protected static class Mymath{
		
		public static Integer add(Integer x, Integer y) {
			return x + y;
		}
		protected static Integer subtract(Integer x, Integer y) {
			return x - y;
		}
		
		
		public static Integer math(BiFunction<Integer ,Integer ,Integer> operation,Integer a, Integer b){
			return operation.apply(a, b);	
		}
	}
	public static void main (String [] args) {
		System.out.println(Mymath.math(Mymath::add,4,5));
		System.out.println(Mymath.math(Mymath::subtract,-4,-5));
		System.out.println(Mymath.math((x,y)-> x * y , 6 ,4));
	}
}
