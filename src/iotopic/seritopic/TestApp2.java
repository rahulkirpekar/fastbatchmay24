package iotopic.seritopic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TestApp2 
{
	public static void main(String[] args) 
	{
		// Auto-Closable With Resource--[Java-7]
		try (
				FileInputStream fin = new FileInputStream("C:\\Users\\Royal\\eclipse-workspace\\fastbatchmay24\\studentlist.txt");
				ObjectInputStream oin = new ObjectInputStream(fin);
			) 
		{
			Student s = (Student)oin.readObject();	
			
			System.out.println("===> " + s.getRno()+" " + s.getName() + " " +s.getStd());
			
		} catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
}