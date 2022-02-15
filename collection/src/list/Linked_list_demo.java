package list;
import java.util.LinkedList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;


public class Linked_list_demo {
	
	public static void main(String [] agrs) {
		
	List v1 =new LinkedList();
	v1.add("Mohammad");
	v1.add(100);
	v1.add(true);
	v1.add('A');
	
	LinkedList v2 = new LinkedList();	
	v2.add("Mohammad");
	v2.add(100);
	v2.add(true);
	v2.add('A');
	
	
	System.out.println("this is list from linkedlist"+v1);
	System.out.println(v2);
	
	// Inserting at the begining of the linked list
	v2.addFirst("Ameri");
	System.out.println(v2);
	
	// Insert in the middle of the list
	v2.add((v2.size()/2), "Ryan");
	System.out.println(v2);
	
	// Insert at the end of the list
	v2.addLast("Sacrament");
	
	System.out.println();
	
	// reading elements of linked list
		
	// for loop
	for (int i = 0; i <v2.size(); i++)
			System.err.print(v2.get(i)+ " ");
	
	System.out.println("\n");
		
	// for each / enhanced loop
	for(Object value:v2)
		System.out.print(value+ " ");
	System.out.println();
	
	// USing Iterator
	System.out.println("\n");
	Iterator it = v2.iterator();
	
	while(it.hasNext()) {
		System.out.print(it.next() + " ");
	}
	System.out.println("\n");
	
	// Add all, copy v1 into v2;
	v2.addAll(v1);
	System.out.println(v1);
	System.out.println(v2);
	
	// Remove all elemnts of v2 that is in v1
	v1.removeAll(v2);	
	System.out.println(v1);
	
	// sorting is only possible on the same type elements 
	
	LinkedList < Character> ch = new <Character>LinkedList();
	ch.add('z');
	ch.add('h');
	ch.add('b');
	ch.add('m');
	ch.add('a');
	ch.add('a');
	ch.add('c');
	ch.add('n');
	
	
	System.out.println(ch);
	// Sorting
	Collections.sort(ch);
	System.out.println(ch);
	Collections.sort(ch, Collections.reverseOrder());
	System.out.println(ch);
	
	Collections.shuffle(ch);
	System.out.println(ch);
	
	
	
		
	}
	

}
