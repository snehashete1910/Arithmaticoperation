package aNotherlogicsalaryetc;

import java.util.Scanner;

public class Taxcalculation {

	public static void main(String[] args) 
	{
		int sal;
		double tax;
		System.out.println("Enter salary of employee..: ");
		Scanner s=new Scanner(System.in);
		sal=s.nextInt();
		if(sal<=10000)
		{
			System.out.println("no tax for less salary");
		}
		else if(sal>10000 && sal <=100000)
		{
			tax=sal*0.10;
			System.out.println(" tax according salary = "+tax);
		}
		else
		{
			tax=sal*0.20;
			System.out.println("tax is high = "+tax);
		}

	}

}
