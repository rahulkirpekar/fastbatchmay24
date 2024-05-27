package exceptiontopic.basic;

import java.util.Scanner;

public class TestApp2 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No1 : ");
		int no1 = sc.nextInt();
		System.out.println("Enter No2 : ");
		int no2 = sc.nextInt();

		int ans = 0 ;
		
		// code--- raise exception---code crashed
		
		try 
		{
			try 
			{
				ans = no1 / no2;
				
			} catch (Exception e) 
			{
				System.out.println(e.getClass().getName()+" catch hanlded.");
			}
			
			try 
			{
				String name = "abc";
				System.out.println("name.length() : " + name.length());// NullpointerException
				
			} catch (Exception e) 
			{
				System.out.println(e.getClass().getName()+" catch hanlded.");
			}

			
			try 
			{
				int a[] = new int[5];
				a[5] = 100;// ArrayIndexoutofBoundException
				
			} catch (Exception e) 
			{
				System.out.println(e.getClass().getName()+" catch hanlded.");
			}
		
		}
		catch(Exception e) 
		{
			System.out.println("Catch Block Hanlded Exception----Exception");
			e.printStackTrace();
		}
		System.out.println("Division : "+ans);

	}
}
