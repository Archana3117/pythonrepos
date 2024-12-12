package arrays;

import java.util.Arrays;
import java.util.Collections;

public class MergeArrays {
public static void main(String[] args) {
	
	//write code for merging arrays
	int[]a= {1,2,3,4};
	int[] b= {5,2,7,8};
	
	int[] c=new int[a.length+ b.length];
	
	for(int i=0;i<a.length;i++)
	{
		c[i]=a[i];
		
	}
	
	for(int i=0;i<b.length;i++)
	{
		c[i + a.length]=b[i];
		
	}
	System.out.print(Arrays.toString(c));
	


	
	
}
}
