package set;

import java.util.LinkedHashSet;

public class LinkedHashSetConcepts {
	
	public static void main(String[] args) {
		
		//same as hashSet except two 
		//1.data struture is linkedlist+hashtable
		//2.order is maintain
		
		LinkedHashSet<Object> h=new LinkedHashSet<Object>();
		h.add(1);
		h.add(2);
		h.add(30);
		h.add("java");
		h.add("selenium");
		
		System.out.println(h);
		
		System.out.println(h.add(1));
		}

}
