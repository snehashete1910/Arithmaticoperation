package Aithmatic;

import java.util.Scanner;

public class Powernumber {

	public static void main(String[] args) 
	{
		int n,p,result=1;
		System.out.println("Enter value of number n = ");
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		System.out.println("Enter power for number p =");
		p=s.nextInt();
		for(int i=1;i<=n;i++)
		{
			result=p*result;
		}
System.out.println("Result of number result = "+result);
	}

}
