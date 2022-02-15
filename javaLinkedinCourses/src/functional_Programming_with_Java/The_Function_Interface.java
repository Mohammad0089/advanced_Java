package functional_Programming_with_Java;
import java.util.function.Function;

public class The_Function_Interface {
	
	protected static class Mymath{
		public static Integer triple(Integer x) {
			return x*3;
		}

	
	public static void main(String[] args) {
			
		    //   inputType , returnType
		Function< Integer  , Integer   > myTriple = Mymath::triple;
		
		Integer result = myTriple.apply(5);
		
		System.out.println(result); //15
		
		Function <Integer,Integer> myFunc = (n)->n*2+1;
		
		result = myFunc.apply(5);
		System.out.println(result);
			
		}
	}

}
