package list;

import java.lang.foreign.AddressLayout;
import java.util.LinkedList;

public class LinkedListConcepts {
	
	
	public static void main(String[] args) {
		
		//datastruture doubly linkedlist
		//duplicates allowed
		//order maintain
		//null allowed
		//best for insertion and deletion
		
		
		LinkedList<Integer> llist=new LinkedList<Integer>();
		
		llist.add(10);
		llist.add(20);
		llist.add(null);
		llist.add(10);
		llist.add(30);
		
		System.out.println(llist);
		
		llist.set(1, 5);
		System.out.println(llist);
		
		LinkedList<Object> l=new LinkedList<Object>();
		l.add(1);
		l.add("hi");
		l.add("Java");
		l.add(10);
		l.add(null);
		l.add(1);
		
		System.out.println(l);
		
		l.set(2,"c");
		
		System.out.println(l);
	}

}
