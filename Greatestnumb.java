package Aithmatic;

import java.util.Scanner;

public class Greatestnumb {

	public static void main(String[] args) 
	{
		int a,b;
		System.out.println("Enter value of a and b");
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		b=s.nextInt();
		if(a>b)
		{
			System.out.println("a is greater than b");
		}
		else
		{
			System.out.println("b is greater than a");
		}
		
		
	}

}
