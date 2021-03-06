package Lambda_experssion;
import java.util.function.Function;

/*
 * Function chaining
 * 
 * andThen()
 * compose()
 * */
public class Function_demo3 {
	public static void main(String []args) {

		Function<Integer,Integer> f1=i->i*2;
		Function<Integer,Integer> f2=i->i*i*i;
		
		System.out.println(f1.andThen(f2).apply(2)); // first f1 = 4 the f2 = 64
		System.out.println(f1.compose(f2).apply(2));
	}

}
