package numbers;

import java.util.Scanner;

public class DuckNumber {
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int num=sc.nextInt();
		Boolean isDuckNumber=false;
		while(num!=0)
		{
			int digit=num%10;
			if(digit==0)
			{
				isDuckNumber=true;
				break;
			}
			num=num/10;
		}

		if(isDuckNumber)
		{
			System.out.println("Number is DuckNumber number");
		}
		else
		{
			System.out.println("not DuckNumber");
		}
		System.out.println();
	}

}
