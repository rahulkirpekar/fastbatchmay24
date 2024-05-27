package exceptiontopic.basic;

import java.util.Scanner;

public class TestApp3 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No1 : ");
		int no1 = sc.nextInt();
		System.out.println("Enter No2 : ");
		int no2 = sc.nextInt();

		int ans = 0 ;
		
		try 
		{
			ans = no1 / no2;
		} catch (NullPointerException e) 
		{
			e.printStackTrace();
			System.out.println("I am catch Block");
			
		}finally 
		{
			System.out.println("I am Finally Block");
		}
		System.out.println("Result : " + ans);
	}
}




