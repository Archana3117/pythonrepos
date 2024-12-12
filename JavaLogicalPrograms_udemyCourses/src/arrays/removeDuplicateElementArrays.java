package arrays;

import java.util.Collections;
import java.util.LinkedHashSet;

public class removeDuplicateElementArrays {
public static void main(String[] args) {
	
	
	//write  logic for duplicate element
	
	int[] a= {1,2,3,4,5,4,2};
	
	for(int i=0;i<a.length;i++)
	{
		
		for(int j=i+1;j<a.length;j++)
	     {
		      if(a[i]==a[j])
		      {
		    	  System.out.println("duplicate element:"+a[i]);
		  
		      }
	
	     }
	}
	

	
}
}
