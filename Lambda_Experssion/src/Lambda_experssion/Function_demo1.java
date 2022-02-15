package Lambda_experssion;
import java.util.function.Function;

public class Function_demo1 {
	public static void main(String [] args) {
		
		Function<Integer,Integer> f = n->n*n;
		
		System.out.println(f.apply(5)); // 25
		
		//String ----> length -----> int
		//Function takes two parameters: argument type and return type
		Function <String, Integer> str = s->s.length();
		
		System.out.println(str.apply("Mohammad"));//8
		System.out.println(str.apply("java programming is amazing"));//27
		
		
		
	}

}
