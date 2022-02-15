package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class arrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ArrayList a = new ArrayList();								// anyType of value
		//ArrayList <String> s = new <String> ArrayList();			// Only String
		//ArrayList <Integer> i = new <Integer> ArrayList();
		ArrayList <Character> ch = new <Character> ArrayList();
		
		//ADD
		ch.add('a');
		ch.add(1, 'b');
		ch.add('c');
		System.out.println("Array List: "+ch);
		System.out.println("Number of elemtnts in ArrayList: "+ch.size());
		ch.get(0);
		System.out.println("set function also return old value: " + ch.set(1, 'B'));
		System.out.println("After update Array List: "+ch);
		ch.add('z');
		System.out.println("After insertion Array List: "+ch);
		
		// search for an element
		System.out.println("search for z  elemnt: "+ ch.contains('z'));
		System.out.println("Is Array List empty: "+ ch.isEmpty());
		Collections.sort(ch);
		System.out.println("After sorting Array List: "+ch);
		
		// for loop
		System.out.println("\nreading elements using for loop");
		for(int i=0; i<ch.size();i++) {
			System.out.print(ch.get(i));
		}
		
		// for each loop
		System.out.println("\nreading elements using for each loop");
		for(Character value:ch) {
			System.out.print(value);
		}

		
		//iterator
		System.out.println("\nreading elements using Iterator");
		Iterator arrList = ch.iterator();
		
		while(arrList.hasNext()) {
			System.out.print(arrList.next());
		}
		
		ArrayList<Character> ch1 = new <Character>ArrayList();
		ch1.add('t');
		ch1.add('y');
		ch1.add('u');
		ch1.add('i');
		ch1.add('o');
		ch1.add('p');
		System.out.println("ch1 Array List: "+ ch1);
		System.out.println("befor adding a new Array List: "+ ch);
		ch.addAll(2,ch1);
		System.out.println("After adding a new Array List: "+ ch);
		System.out.println("remove all from ch1");
		ch1.removeAll(ch1);
		
		System.out.println(ch1);
		
		// Sort collections class
		System.out.println("Using Collections class on ArrayList: ch");
		System.out.println("Orginal ArrayList: "+ch);
		Collections.shuffle(ch);
		System.out.println("After Shuffle: "+ch);
		Collections.sort(ch);
		System.out.println("After sorting: "+ch);
		Collections.sort(ch,Collections.reverseOrder());
		System.out.println("After reverseOrder: "+ch);
		System.out.println("Finally how to change a normal array into a ArrayList");
		
		String [] arr = {"Mohamamd", "ryan", "aziz","pavan"};
		int size = arr.length;
		
		System.out.print("regular array: ");
		for(int i =0; i<size;i++)
			System.out.print(arr[i] + " ");
		System.out.println();
		
		ArrayList<String> str = new <String>ArrayList(Arrays.asList(arr));
		System.out.println("This is ArrayList of the regular array: "+str);
		

		
		
	}

}
