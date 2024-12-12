package numbers;

import java.util.Scanner;

public class SumOfMultiplesof3 {

	public static void main(String[] args) {


		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int num=sc.nextInt();
		int digit;
		int sum=0;

		while(num!=0)
		{
			digit=num%10;
			if(digit==3 ||digit==6||digit==9)
			{
				sum=sum+digit;
			}
			num=num/10;
		}
		System.out.println(sum);

	}
}
