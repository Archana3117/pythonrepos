package numbers;

import java.util.Scanner;

public class SimpleNumber {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter num");
		int num=sc.nextInt();
		
		int digit1,digit2;
		
	
		
			digit1=num%10;
			digit2=num/10;
			int result=(digit1+digit2)+(digit1*digit2);
			System.out.println(result==num?"simple number":"not simple number");
			
		
	}

}
