package Lambda_experssion;
// Functional Interface 

@FunctionalInterface
interface Cab
{
	public String bookCab(String source , String des);
}
	
public class Lambda_demo {
	public static void main(String [] args) {
		
		// {} not required since there is no return statement of multi line of code.
		Cab lambda =(a , b)-> {
								System.out.println("Going from: "+ a + " to: "+ b);
								return ("price: 500USD");
							  };
		
		System.out.println(lambda.bookCab("Istanbul" , "Sacramento"));
		//Going from: Istanbul to: Sacramento
		//price: 500USD
		
	}
}
