package Strings;

import java.util.Scanner;

public class CounttheWords {
	public static void main(String[] args) {
		
	
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a string");
	String input=sc.nextLine();
	//System.out.println(input.split(" ").length);//split the words
	
	int count=0;
	
	for(int i=0;i<input.length();i++)
	{
		if(Character.isWhitespace(input.charAt(i)));
	{
		count++;
	}
  }
	System.out.println(count+1);
}
}