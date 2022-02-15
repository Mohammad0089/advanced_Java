package Lambda_experssion;
import java.util.function.Predicate;
/*
 * Joining Predicates -  and, or, negate
 * p1---- checks number is even
 * p2---- checks greater than 50
 * */

public class Prediactes_joinMulti {

	public static void main(String[] args) {
	
		int[] a= {5,10,15,20,25,30,35,40,45,50,55,60,65};
		
		Predicate<Integer> p1=(i)->i%2==0; // even numbers
		Predicate<Integer> p2= i ->i>50;
		
		for(int value:a) {
			if(p1.and(p2).test(value))//p1.test(value)&& p2.test(value)
			System.out.println(value);
		}
		
		for(int value:a) {
			if(p1.or(p2).test(value))//p1.test(value) | p2.test(value)
			System.out.println(value);
		}
		
		for(int value:a) {
			if(p1.negate().test(value))//!p1.test(value)  returns odd numbers
			System.out.println(value);
		}
	}

}
