package Aithmatic;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args)
	{
		int n,sum=1;
		System.out.println("Enter value for factorial : ");
		Scanner s= new Scanner(System.in);
		n=s.nextInt();
		for(int i=1;n>=i;i++ )
		{
			sum=sum*i;
			
		}
System.out.println(sum);
	}

}
