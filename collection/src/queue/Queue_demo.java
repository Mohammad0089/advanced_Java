package queue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class Queue_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PriorityQueue q = new PriorityQueue();
		//Adding elemnt
		// add()  or offer()
		q.add('A');
		q.add('g');
		q.add('f');
		q.add('d');
		q.add('s');
		q.add('x');
		q.add('c');
		q.add('v');
		
		
		// get head element 
		System.out.println(q.element());   // if empty throws exception
		System.out.println(q.peek());		// if empty return null
		
		// Return and Remove element
		System.out.println(q);
		System.out.println(q.remove());    // throws exception
		System.out.println(q);
		System.out.println(q.poll());
		System.out.println(q);
		
		
		//reading element from queue
		
		Iterator it =q.iterator(); 
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		

	}

}
