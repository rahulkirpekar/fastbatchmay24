package oops.classobject;
import java.util.Scanner;
public class Student 
{
	// 1) Data members
	int rno;
	String name;
	int std;
	
	// 2) Member function
	public void scanData() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Rno : ");
		rno = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Name : ");
		name = sc.nextLine();
		System.out.println("Enter Std : ");
		std = sc.nextInt();
	}
	public void dispData() 
	{
		System.out.println(rno + " " + name +" " + std+"---"+this);
	}
	// 3) constructor
}
