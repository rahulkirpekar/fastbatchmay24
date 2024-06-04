package iotopic.bow;

import java.io.FileOutputStream;
import java.util.Scanner;

// read  [FileInputStream]
public class TestWriteApp1 
{
	public static void main(String[] args) 
	{
		Scanner sc  = new  Scanner(System.in);
		
		System.out.println("Enter Name : ");
		String name = sc.nextLine();//ABCD
		
		// String---->Byte Array(ASCII)
		
		byte b[] = name.getBytes();
		
		try 
		{
			FileOutputStream fout = new FileOutputStream("test1.txt");

			fout.write(b);
			
			fout.close();
		
			System.out.println("Success");
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}
