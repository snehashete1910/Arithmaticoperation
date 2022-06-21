package Aithmatic;

import java.util.Scanner;

public class gretestthreenumer {

	public static void main(String[] args)
	{
int a,b,c;
Scanner s=new Scanner(System.in);
System.out.println(" Enter value of a = ");
a=s.nextInt();
System.out.println(" Enter value of b = ");
b=s.nextInt();
System.out.println(" Enter value of c = ");
c=s.nextInt();

if(a>b) 
{
	if(b>c)
	{
		System.out.println(" a is gretest ");
	}
	else
	{
		System.out.println("c is gretest");
	}
	
}
else
{
	if(b>c)
	{
		System.out.println(" b is greatest");
	}

else
{
	System.out.println(" c is greatest ");
}


	}

}
}