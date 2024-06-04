package iotopic.seritopic;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		Student sobj = new Student(1, "rahul", 12);
		
		
//		JDK--7 -- "AutoClosable Resource"
		
		try(
				FileOutputStream fout = new FileOutputStream("studentlist.txt");
				ObjectOutputStream out  = new ObjectOutputStream(fout);	
			) 
		{
			out.writeObject(sobj);

			System.out.println("Success");
		
		} catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
	}

}
