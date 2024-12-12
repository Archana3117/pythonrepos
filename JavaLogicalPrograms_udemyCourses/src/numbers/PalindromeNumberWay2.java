package numbers;

import java.util.Scanner;

public class PalindromeNumberWay2 {

	public static void main(String[] args) {

          Scanner sc=new Scanner(System.in);
          System.out.println("Enter a number");
          String num=sc.next();
          StringBuffer sb=new StringBuffer(num);
          String reversenumber=sb.reverse().toString();
          System.out.println(num.equals(reversenumber)?"Palindrome":"not Palindrome");


	}

}
