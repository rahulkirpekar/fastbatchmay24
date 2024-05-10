package oops.inhtopic.si;

import java.util.Scanner;

public class Student extends Person
{
	int rno,std;
	
	public void scanData() 
	{
		Scanner sc  = new Scanner(System.in);
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
		System.out.println(rno +" " + name +" " + std);
	}
	public static void main(String[] args) 
	{
		Student s = new Student();
		
		s.scanData();
		s.dispData();
	}
}
