package Lambda_experssion;
import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;


class Employeee
{
	String ename;
	int salary;
	
	Employeee(String name,int salary){
		this.ename = name;
		this.salary = salary;
	}
}

public class Function_demo2 {

	public static void main(String[] args) {
		ArrayList<Employeee> emplist = new ArrayList<Employeee>();
		
		emplist.add(new Employeee("Mohammad" , 50000));
		emplist.add(new Employeee("Jhon" , 30000));
		emplist.add(new Employeee("Ryan" , 20000));
		
		Function<Employeee , Integer> fn = e->{
											 	int sal = e.salary;
											 	if(sal>=10000 && sal <=20000)
											 		return (int) (sal*0.1);
											 	else if(sal >=2000 && sal<=30000)
											 			return (sal*20/100);
											 	else
											 		return sal*30/100;
											 };
											 
	 Predicate<Integer> pr = i->i>5000; // Using predicate to check bouns is > 5000;
											 
	  for(Employeee emp:emplist) {
		  int bouns = fn.apply(emp);
		  System.out.println(emp.ename +" Salary is "+emp.salary );
		  if(pr.test(bouns))
			  System.out.println("Bouns is: "+bouns);
		  else
			  System.out.println("Bouns is less than 5000");
	  }

	}

}
