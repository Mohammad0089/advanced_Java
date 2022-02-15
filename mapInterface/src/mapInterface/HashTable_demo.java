package mapInterface;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashTable_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Hashtable t = new Hashtable(); // capacity 11 load factor 0.75
		//Hashtable t = new Hashtable(initiail capacity); 
		//Hashtable t = new Hashtable(capacity , loadFactor);
		Hashtable<Integer,String> t = new <Integer,String>Hashtable();
		t.put(101, "Mohammad");
		t.put(102, "Amero");
		t.put(103, "Ryan");
		t.put(104, "John");
		t.put(105, "Mohammad");
		//t.put(null, "Mohammad");  in hash table it wont except null as a key
		//t.put(101 , null);          no null as a value
		
		System.out.println(t.get(101));
		
		System.out.println(t); //{105=Mohammad, 104=John, 103=Ryan, 102=Amero, 101=Mohammad}
		
		System.out.println(t.containsKey(101));
		System.out.println(t.contains("Mohammad"));
		
		System.out.println(t.isEmpty());
		
		System.out.println(t.keySet()); // [105, 104, 103, 102, 101]
		
		System.out.println(t.values()); // [Mohammad, John, Ryan, Amero, Mohammad]
		
		for(int i : t.keySet()) {
			System.out.println("key: "+ i +"      " + t.get(i));
		}
		
		t.forEach((key , value) -> System.err.println("key: " + key+ " value: "+ value));
		/*	The default implementation is equivalent to, for this map:
		 *   for (Map.Entry<K, V> entry : map.entrySet())
     			action.accept(entry.getKey(), entry.getValue());
		 */
		
	     for ( Entry<Integer, String> entry : t.entrySet())
		    System.out.println(entry.getKey() + entry.getValue());
	     
	     //   for (Entry<Integer,String>entry:t.entrySet())
	     
	     for (Map.Entry ent :t.entrySet()) {
	    	 System.err.println(ent.getKey() +"    "+ ent.getValue());
	     }
	     
	     // Using Iterator
	     
	     Set s = t.entrySet();
	     Iterator itr = s.iterator();
	     while(itr.hasNext()) {
	    	 Map.Entry ent = (Entry) itr.next();
	    	 System.out.println(ent.getKey() +"  "+ ent.getValue());
	    	 
	     }
	     
	     System.out.println(t);

	}

}
