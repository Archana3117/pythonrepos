package set;

import java.util.HashSet;
import java.util.Set;

public class HashSetConcepts {
	
	public static void main(String[] args) {
		
		//datastruture-hashtable
		//duplicates not allowed
		//insertion order not maintain
		//null allowed only once
		//capcity 16
		//best for search operation
		//if we try to add duplicates then its return false,not any c.e or r.e
	
		HashSet h=new HashSet();
		
		h.add(1);
		h.add("Hi");
		h.add(10);
		h.add("java");
		h.add(null);
		
		System.out.println(h);
	
		System.out.println(h.add(null));   //false
		
	}

}
