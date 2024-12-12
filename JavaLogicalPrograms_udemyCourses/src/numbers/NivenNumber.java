package numbers;

import java.util.Scanner;

public class NivenNumber {
	
	//21-->2+1=3-->21/3=7 rem=0
	public static int sum(int num) {
		int digit,sum=0;
		while(num!=0)
		{
			digit=num%10;
			sum=sum+digit;
			num=num/10;
		}
		return sum;
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter an num");
		int num=sc.nextInt();
		
		System.out.println((num%sum(num)==0?"niven number":"not niven number"));
		sc.close();
		
	}

	
}
