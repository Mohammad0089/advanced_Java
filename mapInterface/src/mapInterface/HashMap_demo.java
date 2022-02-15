package mapInterface;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMap_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap m = new HashMap();
		//HashMap<Integer, String> m = new <Integer, String> HashMap();
		
		m.put(101, "Mohammad");
		m.put(102, "Ryan");
		m.put(103, "Ted");
		m.put(104, "Jhon");
		m.put(105, "X");
		m.put(106, "Ameri");
		m.put(107, "Mohammad");
		System.err.println(m); // {101=Mohammad, 102=Ryan, 103=Ted, 104=Jhon, 105=X, 106=Ameri, 107=Mohammad}
		System.out.println(m.get(101));
		
		m.remove(101); // remove a pair key value 
		System.out.println(m);
		
		
		System.out.println(m.containsKey(101));
		System.out.println(m.containsKey(105));
		System.out.println(m.containsValue("X"));
		
		
		System.out.println(m.isEmpty());
		
		// getteing only keys
		
		System.out.println(m.keySet()); // return all the keys
		System.out.println(m.values()); //  return all values
		
		System.out.println(m.entrySet()); // this is a set
		
		for(Object i :m.keySet()) {
			System.out.println(i);
		}
		
		for(Object i : m.values()) {
			System.out.println(i);
		}
		
		for(Object i : m.keySet()) {
			System.out.println(i + "    "+ m.get(i));
		}
		
		// Using Entry Interface
		// Entry Method
		
		//for(Map.Entry<Integer , String> entry:m.entrySet()) {
			
	//	}
		Set s = m.entrySet();
		
		Iterator itr = s.iterator();
		
		while(itr.hasNext()) {
			Map.Entry entry=(Entry) itr.next();
			System.out.println(entry.getKey() + "   "+entry.getValue());
		}
		
		m.forEach((key,value) -> System.out.println("key: "+ key  +" value: "+ value));
		
		
		
		
		
		
		
		
	}

}
