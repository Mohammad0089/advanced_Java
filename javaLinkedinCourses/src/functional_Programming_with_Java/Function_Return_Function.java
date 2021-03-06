package functional_Programming_with_Java;

import java.util.function.Function;

			

public class Function_Return_Function {
	
	protected static class Mymath{
	
		protected static Integer timesTwo(Integer x) {
			return x*2;
		}
		protected static Integer timesThree(Integer x) {
			return x*3;
		}
		protected static Integer timesFour(Integer x) {
			return x*4;
		}
		
		// Instead of creating a several slightly different functions
		// we use first class function to create these function for us 
		

		public static Function<Integer,Integer> creatMultiplier(Integer y){
			
			return (Integer x)->x*y;   // define and return a lambda expression of Function -> R apply(T t);
		
		}
		public static final Function<Integer , Function<Integer,Integer>> creatMulti=(x)->(y)-> y * x; // Other way
	}
	

	public static void main(String[] args) {

		Function<String,NoArgFunction<String>> creatGreet = x->() -> "hello "+ x ;
		NoArgFunction<String> myGreet = creatGreet.apply("Mohammad");
		System.out.println(myGreet.apply());

		Function<Integer,Integer> timesTwo= Mymath.creatMultiplier(2);        // we Don't use apply method since creatMultiplier 
		Function<Integer,Integer> timesThree= Mymath.creatMultiplier(3);      // itself is not a functional Interface.
		Function<Integer,Integer> timesFour= Mymath.creatMultiplier(4);       // We reference times* functions to the address of return Function created 
																			  // by creatMultiplier method.
		Function<Integer,Integer>timesSix = Mymath.creatMulti.apply(6);       //---------Defined by a Functional method creatMulti
		
		System.out.println(timesTwo.apply(6));
		System.out.println(timesThree.apply(6));
		System.out.println(timesFour.apply(6));
		System.out.println(timesSix.apply(6));
		
		// --------- Closure concept in Java
		
		/* closure means that when we define a function that returns another function,
		 * the function that we return still has access to the 
		 * internal scope of the function that returned it.
		 */
		
		NoArgFunction<NoArgFunction<String>> Greeter = ()->()->{
			String name ="Mohammad";
			return name + " Loves software engineering";
		};
		
		System.out.println(Greeter.apply().apply());   
	
	


		
		
		
		
		
		

	}

}
