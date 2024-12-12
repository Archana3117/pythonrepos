package arrays;

import java.util.Arrays;

public class SortingArrays {
public static void main(String[] args) {
	
	//write logic for sorting the arrays	
	int[] d= {1, 2, 3, 4, 5, 2, 7, 8};
	
	
	//logic for sorting
	for(int i=0;i<d.length;i++)
	{
		for(int j=i+1;j<d.length;j++)
		{
			if(d[i] > d[j])
			{
				int temp=d[i];
				d[i]=d[j];
				d[j]=temp;
			}
			
		}
		
	}
	
	System.out.println(Arrays.toString(d));
	//inbuld method
	//Arrays.sort(c);
}
}
