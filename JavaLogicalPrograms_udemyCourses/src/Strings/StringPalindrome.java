package Strings;

import java.util.Scanner;

public class StringPalindrome {
	public static void main(String[] args) {
		

	Scanner sc=new Scanner(System.in);
	System.out.println("enter a string");
	String input=sc.next();
	String rev="";
	
	for(int i=input.length()-1;i>=0;i--)
	{
	  rev= rev+input.charAt(i);
	}
	if(rev.equals(input))
	{
		System.out.println("string is palindrome");
	}
	else
	{
		System.out.println("not palindrome");
	}

}
}