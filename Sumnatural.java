package Aithmatic;

import java.util.Scanner;

public class Sumnatural {

	public static void main(String[] args)
	{
		int n,sum=0;
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter value of n");
		n=s.nextInt();
		System.out.println("Enter value of n="+n);
		for(int i=1;i<=n;i++)
		{
			sum=sum+i;
			
		}
		System.out.println("sum of n natural number="+sum);
	}

}
