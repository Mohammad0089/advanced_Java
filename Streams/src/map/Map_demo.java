package map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.ArrayList;


class Employee{
	int empId;
	String name;
	int salary;
	
	Employee(int id, String name, int sal){
		this.empId = id;
		this.name = name;
		this.salary = sal;
	}
}
public class Map_demo {

	public static void main(String[] args) {
		
	List <String> v = Arrays.asList("car","truck","bicycle","train","plan");
	
	List <String> vToUpper = new ArrayList<String>();
	
	// converting elements to upper case then assign them to vTo list	
	vToUpper = v.stream().map(n->n.toUpperCase()).collect(Collectors.toList());  
	System.out.println(v);
	System.out.println(vToUpper);
	
	
	// reading a length of each element 
	
	v.stream().map(n->n.length()).forEach(length->System.out.print(length+" "));
	
	List<Integer> numbers = Arrays.asList(2,4,5,6,7);
	List<Integer> num = new ArrayList<Integer>();
	
	System.out.println("/n multiply each element times 3 then store them in the arraylist");
	num = numbers.stream().map(n->n*3).collect(Collectors.toList());
	System.out.println(numbers);
	System.out.println(num);
	numbers.stream().map(n->n*4).forEach(System.out::print);
	
	
	List<Employee> emps = new ArrayList<Employee>();
	emps.add(new Employee(10,"Aziz",165000));
	emps.add(new Employee(15,"Safa",12000));
	emps.add(new Employee(10,"Atyaf",15000));
	emps.add(new Employee(10,"Ryan",505000));
	
	List<Integer> salaries = new ArrayList<Integer>();
	
	salaries = emps.stream().filter(e->e.salary>100000).map(e->e.salary).collect(Collectors.toList());
	
	System.out.println("\n this is salariess over 100000 sotred in salaries ArrayList: "+ salaries);
	
	
		
	
	


		
		

		
		
		
	}

}
