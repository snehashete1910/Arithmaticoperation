package Aithmatic;

import java.util.Scanner;

public class Sumofdigit {

	public static void main(String[] args) 
	{
		int n,sum=0,num;
		System.out.println("Enter number for sum : ");
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		while(n>0)
		{
			/*sum=sum+n%10;
			n=n/10;*/
			num=n%10;
			sum=num+sum;
			n=n/10;
		}
		System.out.println(sum);
		
	}

}
