package Aithmatic;

import java.util.Scanner;

public class Averageofsubject {

	public static void main(String[] args)
	{
		int a,b,c,d,e,total,average;
		System.out.println("Enter value of Five subject : ");
		Scanner s=new Scanner(System.in);
		System.out.println("Enter value of A : ");
		a=s.nextInt();
		System.out.println("Enter value of B : ");
		b=s.nextInt();
		System.out.println("Enter value of C : ");
		c=s.nextInt();
		System.out.println("Enter value of D : ");
		e=s.nextInt();
		System.out.println("Enter value of E : ");
		d=s.nextInt();
		total=a+b+c+d+e;
		System.out.println("Total number :" +total);
		average=total/5;
		System.out.println("Average of number "+average);
		

	}

}
