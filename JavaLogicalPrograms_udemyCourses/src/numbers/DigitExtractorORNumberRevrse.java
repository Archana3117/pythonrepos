package numbers;

import java.util.Scanner;

public class DigitExtractorORNumberRevrse {

	public static void main(String[] args) {


		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int num=sc.nextInt();
		int digit;
		while(num!=0)
		{
			digit=num%10;
			System.out.print(digit+" ");
			num=num/10;


		}


	}

}
