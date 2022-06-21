package Aithmatic;

import java.util.Scanner;

public class Countdigit {

	public static void main(String[] args) {
		int a,sum=0;
		System.out.println("Enter number ");
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		while(a>0)
		{
			a=a/10;
			sum++;
		}
		System.out.println(sum);
		
	}

}
