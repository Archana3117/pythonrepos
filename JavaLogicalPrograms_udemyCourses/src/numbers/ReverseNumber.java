package numbers;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int num=sc.nextInt();
		int digit;
		int result=0;

		while(num!=0)
		{
			digit=num%10;
			result=result*10+digit;
			num=num/10;
		}
		System.out.print(result);
	}

}
