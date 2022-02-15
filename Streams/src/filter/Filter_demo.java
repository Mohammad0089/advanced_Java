package filter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Product{ // I use this class after line 80
	int id;
	String name;
	double price;
	
	Product(int id, String name, double price){
		this.id=id;
		this.name=name;
		this.price=price;
	}
}

public class Filter_demo {

	public static void main(String[] args) {
		/*
		ArrayList <Integer> a = new ArrayList <Integer>();
		a.add(5);
		a.add(10);
		a.add(15);
		a.add(20);
		*/
		
		// ArrayList <Integer> a = (ArrayList<Integer>) Arrays.asList(5,10,15,20);
		
		List<Integer> a = Arrays.asList(5,10,15,20,25,32);
		
		List<Integer> evenNum = new ArrayList();
		
		// without using stream
		
		for(int val:a) {
			if(val%2==0)
				evenNum.add(val);
		}
		System.out.println(evenNum);	
		
		// Using stream concept
		System.out.println();
		
		evenNum = a.stream().filter(n->n%2==0).collect(Collectors.toList());
		System.out.println(a);
		System.out.println(evenNum);
		
		// Just output the result     // forEach is counsomer means it take a value just output the value no manipulation
		a.stream().filter(n->n%2==0).forEach(n->System.out.println(n));
		a.stream().filter(n->n+2>0).forEach(System.err::print);
		
		// Chain Filters - more than one condition
		
		List <String> names = Arrays.asList("mohammad","Ryan","Atyaf","Safa","Sacramento","California");
		
		List<String> longNames = new ArrayList<String>();
		
		// Store the result into longName ArrayList using collect.
		
		longNames = names.stream().filter(n->n.length()>5 && n.length()<12).collect(Collectors.toList());
		System.out.println(longNames);
		
		// out put the result using consum function
		
		names.stream().filter(n->n.length()>3 && n.length()<6).forEach(n->System.out.print(n +" "));
		names.stream().filter(n->n.length()>3 && n.length()<6).forEachOrdered(n->System.err.print(n +" "));
		names.stream().filter(n->n.length()>3 && n.length()<6).forEach(System.out::print);
		System.out.println();
		System.out.println(longNames);
		longNames.sort(null);
		System.out.println(longNames);
		
		List<String> words = Arrays.asList("cup",null,"forest","boook",null,"theater");
		
		List<String> result = new ArrayList<String>();
		result = words.stream().filter(n->n != null).collect(Collectors.toList());
		System.out.println(result);
		System.out.println(words);
		
		
		
		// using Product class
		
		List <Product> pr = new ArrayList<Product>();
		
		pr.add(new Product(1,"Hp laptob",3540.54));
		pr.add(new Product(4,"Lenovo tablet",999.99));
		pr.add(new Product(5,"Ipad",450));
		pr.add(new Product(4,"sony",300));
		
		pr.stream().filter(n->n.price>500).forEach(n->System.out.println(n.price));
		
		
		
		
		
		
		
		
	
	}

}
