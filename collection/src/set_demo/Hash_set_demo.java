package set_demo;

import java.util.HashSet;
import java.util.Iterator;

public class Hash_set_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//HashSet sh = new HashSet(); //by default capacity is 16 and load factor is 0.75
		
		//HashSet sh =new HashSet(100); capacity is 100 load factor is 0.75
		
		HashSet <Integer> sh = new <Integer>HashSet(100 , (float)0.90);
		sh.add(10);
		sh.add(5);
		sh.add(8);
		sh.add(4);
		sh.add(7);
		sh.add(6);
		sh.add(12);
		sh.add(null);
		System.out.println(sh);
		
		// contains
		System.out.println(sh.contains(null));
		
		System.out.println(sh.size());
		
		// reading elements
		
		for(Integer value: sh) {
			System.out.print(value + " ");
		}
		
		
		Iterator it = sh.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		HashSet<Integer> sh1 = new <Integer> HashSet();
		sh1.add(2);
		sh1.add(6);
		sh1.add(12);
		System.out.println(sh1);
		
		// It is like Union operation on sets
		sh1.addAll(sh);
		System.out.println(sh1);
		
		// Intersection operation 
	    // sh1.retainAll(sh);
		// System.err.print(sh1 +" ");
		
		//Difference
	//	sh1.removeAll(sh);
	//	System.err.print(sh1 +" ");
		
		
		//subset
		sh1.containsAll(sh);
		System.out.print(sh1);
		
		
		
		
		
		
		
	}

}
