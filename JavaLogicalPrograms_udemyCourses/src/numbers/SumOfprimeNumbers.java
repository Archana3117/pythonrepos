package numbers;

import java.util.Scanner;

public class SumOfprimeNumbers {


public static void main(String[] args) {


	Scanner sc=new Scanner(System.in);
	System.out.println("enter number");
	int num = sc.nextInt();
	int digit;
	int sum=0;

	while(num!=0)
	{
		digit=num%10;
		if(digit==2||digit==3 || digit==5||digit==7)
		{
			sum=sum+digit;
		}

            num=num/10;

	}
	System.out.print("sum of digit"+sum);

	}

}

