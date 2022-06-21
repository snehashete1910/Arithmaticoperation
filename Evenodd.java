package Aithmatic;

import java.util.Scanner;

public class Evenodd {

	public static void main(String[] args)
	{
		int n;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter value of n=");
		n=s.nextInt();
		for(int i=0;i<=n;i++ )
		{
			if(i%2==0)
			{
				System.out.println("value is even: "+i);
			
			}
			else
			{
			
				System.out.println("value is odd: "+i);
			}
		}
		

	}

}
