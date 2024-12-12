package list;

import java.util.ArrayList;

public class ArraylistConcepts {
	
	public static void main(String[] args) {
		
		//datastruture growable array
		//duplicates allowed
		//oreder maintain
		//null allowed
		//default size is 10
		//if array is full and we can add another new object that time new array will be created
		//best for retrive operation
		//objects are added 
		
		ArrayList<Integer> alist=new ArrayList<Integer>();
		
		alist.add(1);
		alist.add(2);
		alist.add(5);
		alist.add(2);
		alist.add(null);
		
		System.out.println(alist);
		
		alist.remove(1);
		System.out.println(alist);
		
		alist.add(3, 10);
		System.out.println(alist);
		
		
	}

}
