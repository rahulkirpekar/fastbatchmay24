package iotopic.bow;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		// read(TestWriteApp1.java)----write(TestWriteAppDup.java)
		try 
		{
			FileInputStream fin  =new FileInputStream("C:\\Users\\Royal\\eclipse-workspace\\fastbatchmay24\\src\\iotopic\\bow\\TestWriteApp1.java");

			FileOutputStream fout = new FileOutputStream("C:\\Users\\Royal\\eclipse-workspace\\fastbatchmay24\\src\\iotopic\\bow\\TestWriteAppDup.java");
			
			int temp;
			
			while(	(temp = fin.read())	!= -1) 
			{
//				temp---write--TestWriteAppDup.java
				System.out.print((char)temp);
				fout.write(temp);
			}
			fin.close();
			fout.close();
			System.out.println("success");
		} catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} catch (IOException e) 
		{
			e.printStackTrace();
		}  
	}
}
