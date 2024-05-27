package exceptiontopic.basic;

import java.util.Scanner;

class A{}
class B extends A{}
class C extends A{}

public class TestApp1 
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
			
			String name = "abc";
			System.out.println("name.length() : " + name.length());// NullpointerException
			
			int a[] = new int[5];
			a[5] = 100;// ArrayIndexoutofBoundException
		
		}
		catch(ArithmeticException | NullPointerException |  ArrayIndexOutOfBoundsException e) 
		{
			System.out.println("Catch Block Hanlded Exception--"+e.getClass().getName());
			e.printStackTrace();
		}
//		catch( e) 
//		{
//			System.out.println("Catch Block Hanlded Exception----NullPointerException");
//			e.printStackTrace();
//		}
//		catch( e) 
//		{
//			System.out.println("Catch Block Hanlded Exception----ArrayIndexOutOfBoundsException");
//			e.printStackTrace();
//		}
		catch(Exception e) 
		{
			System.out.println("Catch Block Hanlded Exception----Exception");
			e.printStackTrace();
		}
		System.out.println("Division : "+ans);


//		String value = "1a2";
//		int no = Integer.parseInt(value);// NumberFormatException
//		System.out.println("No : " + no);
		
//		A objA = new B();
//		C objC = (C)objA;
	}
}