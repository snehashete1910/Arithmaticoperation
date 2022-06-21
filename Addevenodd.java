package Aithmatic;

import java.util.Scanner;

public class Addevenodd {

	public static void main(String[] args) 
	{
		int n,sum=0;
		System.out.println("ENter value of n = ");
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		if(n%2==0)
		{
		for(int i=0;i<=n;i++)
		{
			
			sum=sum+i;
		}
		
		System.out.println("Sum of even number : "+sum);
		}
		else
		{
			for(int i=1;i<=n;i++)
			{
				sum=sum+i;
			}
			System.out.println("Sum of odd number : "+sum);
			
		}
	}

}
