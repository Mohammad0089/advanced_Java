package Lambda_experssion;

import java.util.ArrayList;
import java.util.function.Predicate;

class Employee{
	String name;
	int salary;
	int experince;
	
	
	Employee(String name,int sal,int exp){
		this.name = name;
		salary = sal;
		experince = exp;		
	}
}
public class Predicate_demo2 {

	public static void main(String[] args) {
		
		Employee emp = new Employee("Jhon",250000,20);		
		
		Predicate <Employee> currentEmp = em->(em.salary>30000 && em.experince>3);
		if(currentEmp.test(emp))
			System.out.println("qualified \n"
					+ "");
		//Ex2
		ArrayList <Employee>al =new <Employee> ArrayList();
		al.add(new Employee("Jhon",250000,20));
		al.add(new Employee("Mohammad",160000,2));
		al.add(new Employee("Ryan",60000,5));
		al.add(new Employee("Mary",30000,2));
		
		for(Employee value: al) {
			if(currentEmp.test(value))
				System.out.println(value.name + " "+value.salary);
			else
				System.out.println("not qualifeid");
		}
	}
}
