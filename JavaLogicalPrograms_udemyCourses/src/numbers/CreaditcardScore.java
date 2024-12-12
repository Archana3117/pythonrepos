package numbers;

import java.util.Scanner;

public class CreaditcardScore {
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("enter a creaditscore");
		int creaditscore=sc.nextInt();

		if(creaditscore<400 && creaditscore>800)
		{
			System.out.println("Invalid creaditscore");
		}
		else
		{
			if(creaditscore>400 && creaditscore<600)
			{
				System.out.println(" Sliver Card");
			}
			else if(creaditscore>600 && creaditscore<800)
			{
				System.out.println("Gold Card");
			}
			else
			{
				System.out.println("Platinum card");
			}

		}

	}

}
