package Lambda_experssion;
import java.util.function.Predicate;

/*
 * Predicate ---> one parameter returns boolean
 * use only if you have conditional check in your program...
*/

public class Predicate_demo {
	public static void main(String [] args) {
		
		//Predicate<Integer> p=(Integer i)->(i>10);
		//Predicate<Integer> p=(i)->(i>10);		
		  Predicate<Integer> p=i->(i>10);
		
		System.out.println(p.test(20));
		System.out.println(p.test(5));		
		
	//EX2 Check the length of a given string is greater is 4.
		Predicate<String> pr = s->(s.length()>4);
		System.out.println(pr.test("california"));
		System.out.println(pr.test("zyz"));
	
	//Ex3 print array elements whose size is greater than 4		
		String[]names = {"Mohammad","ryan", "Mary","Gallilio"};
		
		for(String name:names) {
			if(pr.test(name))
				System.out.println(name);
		}

	}

}
