package Lambda_experssion;

interface test_d {
	public  String test_t( String source , String destenation);
}

/*class Demo implements test_d{
	public String test_t(String source ,  String des) {
		System.out.println("from: "+ source + " to: "+ des);
		return"500";
	}
}
*/
public class Interface_demo {
	
public static void main(String [] a) {
	
	test_d h = (source, destenation)->{
		System.out.println("from: "+ source + " to: "+ destenation);
		return"500";
	};
	
	test_d v1 = (source, des)->{System.out.println("from: "+ source + " to: "+ des);
						return "500";};
	//v1.test_t("mubai", "NYC");
	
	v1.test_t("teh","esf");
	
	//h.test_t("aheaz" , "sac");
	

}
	
	
	

}
