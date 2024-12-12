package numbers;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();

		int digit;
		int result=0;
		int temp=num;

		while(num!=0)
		{
           digit=num%10;
           result=result*10+digit;
           num=num/10;
		}
		if(temp==result)
		{
			System.out.println("no is palindrome");
		}
		else
		{
			System.out.println("no is not palindrome");
		}

	}

}
