package numbers;

import java.util.Scanner;

public class NoOfDgitOccuresCounts {
public static void main(String[] args) {

	System.out.println("enter number");
	Scanner sc=new Scanner(System.in);

	int digit,num=sc.nextInt(),digitToSerach=sc.nextInt();


	int count=0;


    while(num!=0)
    {
    	digit=num%10;
    	if(digit==digitToSerach)

    		count++;
    		num=num/10;
    }
    System.out.println("sum of gigits is:"+count);
    sc.close();
}
}
