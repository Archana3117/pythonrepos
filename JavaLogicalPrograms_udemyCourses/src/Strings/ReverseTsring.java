package Strings;

import java.util.Scanner;

public class ReverseTsring {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String s=sc.next();
		String output="";
		for(int i=s.length()-1;i>=0;i--)
		{
		  output+= s.charAt(i);
		}
		System.out.println( output);
	}
	
	
	//sSystem.out.print(new StringBuffer(s).reverse());

}

